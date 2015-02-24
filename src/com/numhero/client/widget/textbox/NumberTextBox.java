package com.numhero.client.widget.textbox;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.i18n.client.CurrencyData;
import com.google.gwt.i18n.client.CurrencyList;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.i18n.client.constants.NumberConstants;
import com.google.gwt.user.client.ui.*;
import com.numhero.shared.enums.CurrencyEnum;

public class NumberTextBox extends Composite implements Focusable {
	public static final int					OTHER_KEY_UP		= 63232;
	public static final int					OTHER_KEY_DOWN		= 63233;
	public static final int					OTHER_KEY_LEFT		= 63234;
	public static final int					OTHER_KEY_RIGHT		= 63235;

	protected static final NumberConstants	numberConstants		= LocaleInfo.getCurrentLocale().getNumberConstants();
	protected static String					acceptableCharset	= getAcceptedCharset();

	private static String getAcceptedCharset() {
		if (!GWT.isClient()) {
			return null;
		}
		StringBuffer strbuf = new StringBuffer();
		strbuf.append("0123456789");
		if (numberConstants.zeroDigit().charAt(0) != '0') {
			for (int i = 0; i < 10; i++) {
				strbuf.append(numberConstants.zeroDigit().charAt(0) + i);
			}
		}
		strbuf.append(numberConstants.decimalSeparator().charAt(0));
		if (numberConstants.groupingSeparator().charAt(0) == '\u00a0') {
			strbuf.append(' ');
		} else {
			strbuf.append(numberConstants.groupingSeparator().charAt(0));
		}
		strbuf.append((char) KeyCodes.KEY_TAB);
		strbuf.append((char) KeyCodes.KEY_BACKSPACE);
		strbuf.append((char) KeyCodes.KEY_DELETE);
		strbuf.append((char) KeyCodes.KEY_ENTER);
		strbuf.append((char) KeyCodes.KEY_HOME);
		strbuf.append((char) KeyCodes.KEY_END);
		strbuf.append((char) KeyCodes.KEY_LEFT);
		strbuf.append((char) KeyCodes.KEY_UP);
		strbuf.append((char) KeyCodes.KEY_RIGHT);
		strbuf.append((char) KeyCodes.KEY_DOWN);
		strbuf.append((char) OTHER_KEY_LEFT);
		strbuf.append((char) OTHER_KEY_UP);
		strbuf.append((char) OTHER_KEY_RIGHT);
		strbuf.append((char) OTHER_KEY_DOWN);
		return strbuf.toString();
	}

	protected final HorizontalPanel	horizontalPanel;
	protected final TextBox			amountBox;
	protected final Label			currencySymbol;
	protected final NumberFormat	formatter;

	protected String				initialValue;

	public NumberTextBox() {
		horizontalPanel = new HorizontalPanel();
		amountBox = new TextBox();
		currencySymbol = new Label();
		horizontalPanel.setStylePrimaryName("numberTextBox");
		horizontalPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);

		formatter = NumberFormat.getFormat(getCurrencyAmountPattern());

		initWidget(horizontalPanel);
		horizontalPanel.setSpacing(0);

		horizontalPanel.add(amountBox);
		horizontalPanel.add(currencySymbol);
		amountBox.setTextAlignment(TextBoxBase.ALIGN_RIGHT);
		amountBox.setText(formatter.format(0));

		amountBox.addFocusHandler(new FocusHandler() {
			@Override
			public void onFocus(FocusEvent event) {
				initialValue = amountBox.getText();
				amountBox.selectAll();
			}
		});
		amountBox.addBlurHandler(new BlurHandler() {
			@Override
			public void onBlur(BlurEvent event) {
				stopEdit();
			}
		});
		amountBox.addKeyPressHandler(new KeyPressHandler() {
			@Override
			public void onKeyPress(KeyPressEvent event) {
				if (KeyCodes.KEY_ENTER == event.getNativeEvent().getKeyCode()) {
					stopEdit();
					event.stopPropagation();
					amountBox.setFocus(false);
				} else if (KeyCodes.KEY_ESCAPE == event.getNativeEvent().getKeyCode()) {
					cancelEdit();
					event.stopPropagation();
					amountBox.setFocus(false);
				} else {
					if (acceptableCharset.indexOf(event.getNativeEvent().getKeyCode()) == -1) {
						amountBox.cancelKey();
					}
					if (amountBox.getText().length() >= 16) {
						amountBox.cancelKey();
					}
				}
			}
		});
	}

	public NumberTextBox(CurrencyEnum currency) {
		this();
		setCurrency(currency);
	}

	public NumberTextBox(CurrencyEnum currency, double amount) {
		this(currency);
		setAmount(amount);
	}

	public NumberTextBox(CurrencyEnum currency, double amount, boolean readOnly) {
		this(currency, amount);
		setReadOnly(readOnly);
	}

	public void setCurrency(CurrencyEnum currency) {
		if (currency != null) {
			CurrencyData currencyData = CurrencyList.get().lookup(currency.name());
			if (currencyData != null) {
				currencySymbol.setText(currencyData.getPortableCurrencySymbol());
			}
		}
	}

	public TextBox getAmountBox() {
		return amountBox;
	}

	public void setReadOnly(boolean readOnly) {
		amountBox.setReadOnly(readOnly);
	}

	public double getAmount() {
		return formatter.parse(amountBox.getText());
	}

	public void setAmount(double amount) {
		amountBox.setText(formatter.format(amount));
	}

	public void stopEdit() {
		amountBox.setText(reformatContent());
	}

	public void cancelEdit() {
		amountBox.setText(initialValue);
	}

	public int getTabIndex() {
		return amountBox.getTabIndex();
	}

	public void setAccessKey(char key) {
		amountBox.setAccessKey(key);
	}

	public void setFocus(boolean focused) {
		amountBox.setFocus(focused);
	}

	public void setTabIndex(int index) {
		amountBox.setTabIndex(index);
	}

	protected String getCurrencyAmountPattern() {
		StringBuffer strBuf = new StringBuffer("#,##0");
		int precision = 2;// currencyData.getDefaultFractionDigits();
		if (precision > 0) {
			strBuf.append('.');
			for (int i = 0; i < precision; i++) {
				strBuf.append('0');
			}
		}
		return strBuf.toString();
	}

	protected String reformatContent() {
		String str = amountBox.getText();
		if (numberConstants.groupingSeparator().charAt(0) == '\u00a0') {
			str = str.replace(' ', '\u00a0');
		}
		double amount;
		try {
			amount = formatter.parse(str);
		} catch (NumberFormatException e) {
			amount = 0.0;
		}
		return formatter.format(amount);
	}
}
