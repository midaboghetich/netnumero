package com.numhero.client.mvp.document;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.client_supplier.ClientListRequest;
import com.numhero.client.model.datacargo.client_supplier.ClientSupplierListResponse;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierRequest;
import com.numhero.client.model.datacargo.client_supplier.SaveClientSupplierResponse;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.model.pojoc.InvoiceC;
import com.numhero.client.model.pojoc.InvoiceDetailC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.mvp.clientsupplier.ClientSelect;
import com.numhero.client.mvp.clientsupplier.ClientSelect.ClientSupplierSelectHandler;
import com.numhero.client.mvp.clientsupplier.SearchClientDialog;
import com.numhero.client.mvp.document.InvoiceDetailsTable.InvoiceDetailsHandler;
import com.numhero.client.service.Service;
import com.numhero.client.util.ApplicationValidationMessages;
import com.numhero.client.widget.CustomFormatDateBox;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.client.widget.combobox.CurrencyEnumComboBox;
import com.numhero.client.widget.textbox.NumberTextBox;
import com.numhero.shared.enums.ClientSupplierEnum;
import eu.maydu.gwt.validation.client.ValidationProcessor;
import eu.maydu.gwt.validation.client.i18n.ValidationMessages;
import eu.maydu.gwt.validation.client.validators.standard.NotEmptyValidator;

public class InvoicePanel extends AbstractEditEntityPanel implements ClientSupplierSelectHandler, InvoiceDetailsHandler {
    interface InvoiceUiBinder extends UiBinder<Widget, InvoicePanel> {
    }

    private static InvoiceUiBinder uiBinder = GWT.create(InvoiceUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField(provided = true)
    ClientSelect sbClient;

    @UiField
    TextBox tbInvoiceID;

    @UiField
    CustomFormatDateBox dateRaised;

    @UiField
    CustomFormatDateBox dateDue;

    @UiField
    CurrencyEnumComboBox cbCurrency;

    @UiField(provided = true)
    InvoiceDetailsTable invoiceDetailsTable;

    @UiField
    NetNumeroButton btAddInvoiceDetail;

    @UiField(provided = true)
    NumberTextBox tbDiscount;

    @UiField
    NumberTextBox tbPrice;

    @UiField
    TextArea taTermsConditions;

    @UiField
    TextArea taNotes;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    @Inject
    public InvoicePanel(Service<ClientListRequest, ClientSupplierListResponse> clientSuppliersListService,
                        Service<SaveClientSupplierRequest, SaveClientSupplierResponse> clientSupplierSaveService,
                        InvoiceDetailsTable idt,
                        SearchClientDialog dialog) {

        sbClient = new ClientSelect(clientSuppliersListService, clientSupplierSaveService, ClientSupplierEnum.client);
        sbClient.setHandler(this);

        invoiceDetailsTable = idt;
        invoiceDetailsTable.setHandler(this);

        tbDiscount = new NumberTextBox() {
            public void stopEdit() {
                super.stopEdit();
                totalChanged();
            }
        };

        initWidget(uiBinder.createAndBindUi(this));
        createValidator(errorsPanel);
        invoiceDetailsTable.setValidator(validator);

        cbCurrency.addChangeHandler(new ChangeHandler() {
            @Override
            public void onChange(ChangeEvent event) {
                invoiceDetailsTable.setCurrency(cbCurrency.getValue());
                tbPrice.setCurrency(cbCurrency.getValue());
            }
        });

        btAddInvoiceDetail.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InvoiceDetailC idc1 = new InvoiceDetailC();
                getInvoiceC().getDetails().add(idc1);
                invoiceDetailsTable.addLine(idc1);
                invoiceDetailsTable.setValues();
            }
        });
    }

    public void setInvoiceC(InvoiceC invoiceC) {
        resetValidator();
        super.setPojoC(invoiceC);
        invoiceDetailsTable.setInvoiceC(invoiceC);
        sbClient.setClientSupplier(invoiceC.getClientSupplierID(), invoiceC.getClientSupplierName());
        tbInvoiceID.setValue(invoiceC.getInvoiceID());
        dateRaised.setValue(invoiceC.getDateRaised());
        dateDue.setValue(invoiceC.getDateDue());
        cbCurrency.setValue(invoiceC.getCurrency());
        tbDiscount.setAmount(invoiceC.getDiscount());
        tbPrice.setAmount(invoiceC.getPrice());
        tbPrice.setCurrency(invoiceC.getCurrency());
        taTermsConditions.setValue(invoiceC.getTermsConditions());
        taNotes.setValue(invoiceC.getNotes());
    }

    public InvoiceC getInvoiceC() {
        return (InvoiceC) pojoC;
    }

    public NetNumeroButton getBtCancel() {
        return btCancel;
    }

    @Override
    public TextBox getName() {
        return tbInvoiceID;
    }

    public NetNumeroButton getBtSearch() {
        return btSave;
    }

    public ValidationProcessor getValidator() {
        return validator;
    }

    public boolean saveValuesFromUi() {
        boolean ret = validator.validate();
        if (ret) {
            getInvoiceC().setInvoiceID(tbInvoiceID.getText());
            getInvoiceC().setDateRaised(dateRaised.getValue());
            getInvoiceC().setDateDue(dateDue.getValue());
            getInvoiceC().setCurrency(cbCurrency.getValue());
            getInvoiceC().setDiscount(tbDiscount.getAmount());
            getInvoiceC().setPrice(tbPrice.getAmount());
            getInvoiceC().setTermsConditions(taTermsConditions.getText());
            getInvoiceC().setNotes(taNotes.getText());
            invoiceDetailsTable.saveValuesFromUi();
        } else {
            errorsPanel.setVisible(true);
        }
        return ret;
    }

    @Override
    public void clientSupplierChanged(ClientSupplierC clientSupplierC) {
        getInvoiceC().setClientSupplierID(clientSupplierC.getId());
        getInvoiceC().setClientSupplierName(clientSupplierC.getCompanyName());
    }

    @Override
    public void totalChanged() {
        tbPrice.setAmount(invoiceDetailsTable.getTotal() * (100 - tbDiscount.getAmount()) / 100);
    }

    @Override
    protected ValidationMessages createValidationMessages() {
        return new ApplicationValidationMessages() {
            @Override
            public String getPropertyName(String propertyName) {
                if (propertyName.startsWith("Description")) {
                    return Application.getConstants().description();
                } else {
                    return propertyName;
                }
            }
        };
    }

    @SuppressWarnings("unchecked")
    protected void addValidators() {
        addValidators(Application.getConstants().client(),
                new NotEmptyValidator(sbClient.getSbClientSupplier().getTextBox(), true, "required"));
        addValidators(Application.getConstants().invoiceID(),
                new NotEmptyValidator(tbInvoiceID, true, "required"));
//		validator.addValidators("dateRaised",
//				new LocalizedDateValidator(dateRaised, DateTimeFormat.getFormat("dd/MM/yyyy"))
//					.addActionForFailure(focusAction)
//					.addActionForFailure(new StyleAction("validation-failed")));
//		validator.addValidators("dateDue",
//				new LocalizedDateValidator(dateDue, DateTimeFormat.getFormat("dd/MM/yyyy"))
//					.addActionForFailure(focusAction)
//					.addActionForFailure(new StyleAction("validation-failed")));
    }

    public ClientSelect getSbClient() {
        return sbClient;
    }

    public void setSbClient(ClientSelect sbClient) {
        this.sbClient = sbClient;
    }
}
