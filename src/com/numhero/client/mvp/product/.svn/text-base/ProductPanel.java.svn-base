package com.numhero.client.mvp.product;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.ProductC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.client.widget.combobox.CurrencyEnumComboBox;
import com.numhero.client.widget.textbox.NumberTextBox;
import com.numhero.shared.enums.ProductTypeEnum;
import eu.maydu.gwt.validation.client.validators.standard.NotEmptyValidator;

public class ProductPanel extends AbstractEditEntityPanel {
    interface ProductPanelUiBinder extends UiBinder<HTMLPanel, ProductPanel> {
    }

    private static ProductPanelUiBinder uiBinder = GWT.create(ProductPanelUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField
    TextBox tbProductName;

    @UiField
    TextBox tbProductDescription;

    @UiField
    CurrencyEnumComboBox cbProductCurrency;

    @UiField
    NumberTextBox tbProductUnitPrice;

    @UiField
    CheckBox cbProductTrackingEnabled;

    @UiField
    Label lbProductQuantity;

    @UiField
    NumberTextBox tbProductQuantity;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    public ProductPanel() {
        initWidget(uiBinder.createAndBindUi(this));

        createValidator(errorsPanel);

        cbProductCurrency.addChangeHandler(new ChangeHandler() {
            @Override
            public void onChange(ChangeEvent event) {
                tbProductUnitPrice.setCurrency(cbProductCurrency.getValue());
            }
        });
        cbProductTrackingEnabled.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
            @Override
            public void onValueChange(ValueChangeEvent<Boolean> event) {
                lbProductQuantity.setVisible(event.getValue());
                tbProductQuantity.setVisible(event.getValue());
            }
        });
    }

    public void setProductC(ProductC productC) {
        resetValidator();
        super.setPojoC(productC);
        tbProductName.setValue(productC.getName());
        tbProductDescription.setValue(productC.getDescription());
        cbProductCurrency.setValue(productC.getCurrency());
        tbProductUnitPrice.setCurrency(productC.getCurrency());
        tbProductUnitPrice.setAmount(productC.getUnitPrice());
        cbProductTrackingEnabled.setValue(productC.isTrackingEnabled());
        lbProductQuantity.setVisible(productC.isTrackingEnabled());
        tbProductQuantity.setVisible(productC.isTrackingEnabled());
        tbProductQuantity.setAmount(productC.getQuantity());
    }

    public boolean saveValuesFromUi() {
        boolean ret = validator.validate();
        if (ret) {
            ProductC productC = (ProductC) pojoC;
            productC.setProductType(ProductTypeEnum.product);
            productC.setName(tbProductName.getValue());
            productC.setDescription(tbProductDescription.getValue());
            productC.setCurrency(cbProductCurrency.getValue());
            productC.setUnitPrice(tbProductUnitPrice.getAmount());
            productC.setTrackingEnabled(cbProductTrackingEnabled.getValue());
            productC.setQuantity(tbProductQuantity.getAmount());
        } else {
            errorsPanel.setVisible(true);
        }
        return ret;
    }

    public NetNumeroButton getBtSearch() {
        return btSave;
    }

    public NetNumeroButton getBtCancel() {
        return btCancel;
    }

    public TextBox getName() {
        return tbProductName;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addValidators() {
        addValidators(Application.getConstants().name(), new NotEmptyValidator(tbProductName, true, "required"));
        addValidators(Application.getConstants().description(), new NotEmptyValidator(tbProductDescription, true, "required"));
        addValidators(Application.getConstants().unitPrice(), new NotEmptyValidator(tbProductUnitPrice.getAmountBox(), true, "required"));
    }
}
