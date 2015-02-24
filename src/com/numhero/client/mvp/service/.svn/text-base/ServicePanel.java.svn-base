package com.numhero.client.mvp.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.ProductC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.client.widget.combobox.CurrencyEnumComboBox;
import com.numhero.client.widget.combobox.ServiceUnitEnumComboBox;
import com.numhero.client.widget.textbox.NumberTextBox;
import com.numhero.shared.enums.ProductTypeEnum;
import eu.maydu.gwt.validation.client.validators.standard.NotEmptyValidator;

public class ServicePanel extends AbstractEditEntityPanel {
    interface ProductPanelUiBinder extends UiBinder<VerticalPanel, ServicePanel> {
    }

    private static ProductPanelUiBinder uiBinder = GWT.create(ProductPanelUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField
    TextBox name;

    @UiField
    TextBox tbServiceDescription;

    @UiField
    ServiceUnitEnumComboBox cbServiceUnit;

    @UiField
    CurrencyEnumComboBox cbServiceCurrency;

    @UiField
    NumberTextBox tbServiceUnitPrice;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    public ServicePanel() {
        initWidget(uiBinder.createAndBindUi(this));

        createValidator(errorsPanel);

        cbServiceCurrency.addChangeHandler(new ChangeHandler() {
            @Override
            public void onChange(ChangeEvent event) {
                tbServiceUnitPrice.setCurrency(cbServiceCurrency.getValue());
            }
        });
    }

    public void setProductC(ProductC productC) {
        super.setPojoC(productC);
        resetValidator();

        name.setValue(productC.getName());
        tbServiceDescription.setValue(productC.getDescription());
        cbServiceCurrency.setValue(productC.getCurrency());
        tbServiceUnitPrice.setCurrency(productC.getCurrency());
        tbServiceUnitPrice.setAmount(productC.getUnitPrice());
        cbServiceUnit.setValue(productC.getServiceUnit());
    }

    public boolean saveValuesFromUi() {
        boolean ret = validator.validate();
        if (ret) {
            ProductC productC = (ProductC) pojoC;
            productC.setProductType(ProductTypeEnum.service);
            productC.setName(name.getValue());
            productC.setDescription(tbServiceDescription.getValue());
            productC.setCurrency(cbServiceCurrency.getValue());
            productC.setUnitPrice(tbServiceUnitPrice.getAmount());
            productC.setServiceUnit(cbServiceUnit.getValue());
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

    @SuppressWarnings("unchecked")
    @Override
    protected void addValidators() {
        addValidators(Application.getConstants().name(),
                new NotEmptyValidator(name, true, "required"));
        addValidators(Application.getConstants().description(),
                new NotEmptyValidator(tbServiceDescription, true, "required"));
        addValidators(Application.getConstants().unitPrice(),
                new NotEmptyValidator(tbServiceUnitPrice.getAmountBox(), true, "required"));
    }

    public TextBox getName() {
        return name;
    }
}
