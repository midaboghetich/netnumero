package com.numhero.client.mvp.taxinfo;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.DialogBox;
import com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoRequest;
import com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoResponse;
import com.numhero.client.model.pojoc.TaxInfoC;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.shared.enums.CurrencyEnum;

public class TaxInfoDialog extends DialogBox {
    private TaxInfoPanel taxInfoPanel;
    private TaxInfoC taxInfoC;

    public TaxInfoDialog(final Service<SaveTaxInfoRequest, SaveTaxInfoResponse> taxInfoSaveService) {
        setText("New tax");
        setModal(true);
        setGlassEnabled(true);
        setAnimationEnabled(true);

        taxInfoPanel = new TaxInfoPanel();
        taxInfoC = new TaxInfoC();
        taxInfoC.setCurrency(CurrencyEnum.EUR);
        taxInfoPanel.setTaxInfoC(taxInfoC);

        taxInfoPanel.btSave.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                taxInfoPanel.saveValuesFromUi();
                SaveTaxInfoRequest request = new SaveTaxInfoRequest();
                request.setTaxInfoC(taxInfoC);
                taxInfoSaveService.execute(request, new ServiceCallbackImpl<SaveTaxInfoResponse>() {
                    @Override
                    public void onSuccess(SaveTaxInfoResponse response) {
                        taxInfoC.setId(response.getEntityId());
                        TaxInfoDialog.this.hide();
                    }
                });
            }
        });
        taxInfoPanel.btCancel.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                TaxInfoDialog.this.hide();
            }
        });
        setWidget(taxInfoPanel);
    }

    public TaxInfoC getTaxInfoC() {
        return taxInfoC;
    }
}
