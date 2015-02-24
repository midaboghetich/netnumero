package com.numhero.client.mvp.taxinfo;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.*;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoRequest;
import com.numhero.client.model.datacargo.taxinfo.SaveTaxInfoResponse;
import com.numhero.client.model.datacargo.taxinfo.TaxInfoListRequest;
import com.numhero.client.model.datacargo.taxinfo.TaxInfoListResponse;
import com.numhero.client.model.pojoc.TaxInfoC;
import com.numhero.client.service.Service;
import com.numhero.client.widget.combobox.ServerSuggestOracle;

public class TaxInfoSelect extends Composite {
    public interface TaxInfoSelectHandler {
        public void taxInfoChanged(TaxInfoC taxInfoC);
    }

    interface TaxInfoSelectUiBinder extends UiBinder<HTMLPanel, TaxInfoSelect> {
    }

    private static TaxInfoSelectUiBinder uiBinder = GWT.create(TaxInfoSelectUiBinder.class);

    @UiField(provided = true)
    SuggestBox sb;

    @UiField
    Anchor btAdd;

    private Service<SaveTaxInfoRequest, SaveTaxInfoResponse> saveService;
    private TaxInfoC taxInfoC;
    private TaxInfoSelectHandler handler;

    public TaxInfoSelect(Service<TaxInfoListRequest, TaxInfoListResponse> getListService, Service<SaveTaxInfoRequest, SaveTaxInfoResponse> saveService) {
        this.saveService = saveService;

        taxInfoC = new TaxInfoC();
        sb = new SuggestBox(new ServerSuggestOracle<TaxInfoListRequest, TaxInfoListResponse>(getListService, new TaxInfoListRequest()));
        sb.addSelectionHandler(new SelectionHandler<Suggestion>() {
            @Override
            public void onSelection(SelectionEvent<Suggestion> event) {
                if (event.getSelectedItem() instanceof TaxInfoC) {
                    taxInfoC = (TaxInfoC) event.getSelectedItem();
                    handler.taxInfoChanged(taxInfoC);
                }
            }
        });
        sb.getTextBox().addValueChangeHandler(new ValueChangeHandler<String>() {
            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                taxInfoC.init();
                handler.taxInfoChanged(taxInfoC);
            }
        });

        initWidget(uiBinder.createAndBindUi(this));

        btAdd.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                createDialogBox().center();
            }
        });
    }

    public void setHandler(TaxInfoSelectHandler handler) {
        this.handler = handler;
    }

    public void setTaxInfo(TaxInfoC taxInfo) {
        taxInfoC = taxInfo;
        sb.setValue(taxInfoC.getName());
    }

    public TaxInfoC getTaxInfoC() {
        return taxInfoC;
    }

    public SuggestBox getSbTaxInfo() {
        return sb;
    }

    public Anchor getBtAdd() {
        return btAdd;
    }

    private DialogBox createDialogBox() {
        TaxInfoDialog dialog = new TaxInfoDialog(saveService);
        dialog.addCloseHandler(new CloseHandler<PopupPanel>() {
            @Override
            public void onClose(CloseEvent<PopupPanel> event) {
                TaxInfoDialog dialog = (TaxInfoDialog) event.getTarget();
                if (dialog.getTaxInfoC().getId() != null) {
                    sb.setValue(dialog.getTaxInfoC().getReplacementString());
                    handler.taxInfoChanged(dialog.getTaxInfoC());
                }
            }
        });
        return dialog;
    }
}
