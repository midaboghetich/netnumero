package com.numhero.client.mvp.taxinfo;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.TaxInfoC;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.client.widget.TitleLevelOne;
import com.numhero.client.widget.combobox.CurrencyEnumComboBox;
import com.numhero.client.widget.form.CheckBoxLabel;
import com.numhero.client.widget.textbox.NumberTextBox;

public class TaxInfoPanel extends Composite {
    interface TaxInfoPanelUiBinder extends UiBinder<VerticalPanel, TaxInfoPanel> {
    }

    private static TaxInfoPanelUiBinder uiBinder = GWT.create(TaxInfoPanelUiBinder.class);

    @UiField
    TitleLevelOne hdTitle;

    @UiField
    TextBox tbName;

    @UiField
    CheckBoxLabel lbPercent;

    @UiField
    NumberTextBox tbPercent;

    @UiField
    CheckBoxLabel lbValue;

    @UiField
    NumberTextBox tbValue;

    @UiField
    CurrencyEnumComboBox cbCurrency;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private TaxInfoC taxInfoC;

    public TaxInfoPanel() {
        initWidget(uiBinder.createAndBindUi(this));

        lbPercent.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                taxInfoC.setPercent(0d);
                taxInfoC.setValue(null);
                refreshControls();
            }
        });
        lbValue.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                taxInfoC.setPercent(null);
                taxInfoC.setValue(0d);
                refreshControls();
            }
        });
    }

    public void setTaxInfoC(TaxInfoC taxInfoC) {
        this.taxInfoC = taxInfoC;
        if (taxInfoC.getId() == null) {
            hdTitle.setText(Application.getConstants().newTax());
        } else {
            hdTitle.setText(Application.getConstants().editTax());
        }
        tbName.setValue(taxInfoC.getName());
        refreshControls();
    }

    public void saveValuesFromUi() {
        taxInfoC.setName(tbName.getValue());
        if (lbPercent.isSelected()) {
            taxInfoC.setPercent(tbPercent.getAmount());
            taxInfoC.setValue(null);
        } else {
            taxInfoC.setPercent(null);
            taxInfoC.setValue(tbValue.getAmount());
        }
        taxInfoC.setValue(tbValue.getAmount());
        taxInfoC.setCurrency(cbCurrency.getValue());
    }

    public NetNumeroButton getBtSave() {
        return btSave;
    }

    public NetNumeroButton getBtCancel() {
        return btCancel;
    }

    private void refreshControls() {
        if (taxInfoC.isPercent()) {
            lbPercent.setSelected(true);
            tbPercent.setAmount(taxInfoC.getPercent());
            tbPercent.setVisible(true);
            lbValue.setSelected(false);
            tbValue.setVisible(false);
            cbCurrency.setVisible(false);
        } else {
            lbPercent.setSelected(false);
            tbPercent.setVisible(false);
            lbValue.setSelected(true);
            tbValue.setAmount(taxInfoC.getValue());
            tbValue.setVisible(true);
            cbCurrency.setValue(taxInfoC.getCurrency());
            cbCurrency.setVisible(true);
        }
    }
}
