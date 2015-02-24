package com.numhero.client.mvp.staff;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.*;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.staff.SaveStaffRequest;
import com.numhero.client.model.datacargo.staff.SaveStaffResponse;
import com.numhero.client.model.datacargo.staff.StaffListRequest;
import com.numhero.client.model.datacargo.staff.StaffListResponse;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.client.service.Service;
import com.numhero.client.widget.combobox.ServerSuggestOracle;
import com.numhero.shared.enums.StaffTypeEnum;

public class StaffSelect extends Composite {

    public interface StaffSelectHandler {
        public void staffChanged(StaffC staffC);
    }

    interface StaffSelectUiBinder extends UiBinder<HTMLPanel, StaffSelect> {
    }

    private static StaffSelectUiBinder uiBinder = GWT.create(StaffSelectUiBinder.class);

    @UiField(provided = true)
    SuggestBox suggestBox;

    @UiField
    Anchor btAdd;

    PopupPanel ppAdd;

    Anchor btAddContractor;

    Anchor btAddInternal;

    private Service<SaveStaffRequest, SaveStaffResponse> saveService;
    private StaffC staffC;
    private StaffSelectHandler handler;

    public StaffSelect(Service<StaffListRequest, StaffListResponse> getListService, Service<SaveStaffRequest, SaveStaffResponse> saveService) {
        this.saveService = saveService;

        staffC = new StaffC();
        suggestBox = new SuggestBox(new ServerSuggestOracle<StaffListRequest, StaffListResponse>(getListService, new StaffListRequest()));
        suggestBox.addSelectionHandler(new SelectionHandler<Suggestion>() {
            @Override
            public void onSelection(SelectionEvent<Suggestion> event) {
                if (event.getSelectedItem() instanceof StaffC) {
                    staffC = (StaffC) event.getSelectedItem();
                    handler.staffChanged(staffC);
                }
            }
        });
        suggestBox.getTextBox().addValueChangeHandler(new ValueChangeHandler<String>() {
            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                staffC.init();
                handler.staffChanged(staffC);
            }
        });

        initWidget(uiBinder.createAndBindUi(this));

        btAdd.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                getPpAdd().showRelativeTo(btAdd);
            }
        });
    }

    public void setHandler(StaffSelectHandler handler) {
        this.handler = handler;
    }

    public void setStaff(String staffId, String name) {
        staffC.setId(staffId);
        staffC.setName(name);
        suggestBox.setValue(staffC.getName());
    }

    public StaffC getStaffC() {
        return staffC;
    }

    public SuggestBox getSbStaff() {
        return suggestBox;
    }

    public Anchor getBtAdd() {
        return btAdd;
    }

    private PopupPanel getPpAdd() {
        if (ppAdd == null) {
            ppAdd = new DecoratedPopupPanel();
            ppAdd.setAutoHideEnabled(true);
            ppAdd.setAnimationEnabled(true);
            VerticalPanel vp = new VerticalPanel();
            btAddContractor = new Anchor(Application.getConstants().newContractor());
            btAddContractor.addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    ppAdd.hide();
                    createDialogBox(StaffTypeEnum.Contractor).center();
                }
            });
            vp.add(btAddContractor);
            btAddInternal = new Anchor(Application.getConstants().newInternalStaff());
            btAddInternal.addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    ppAdd.hide();
                    createDialogBox(StaffTypeEnum.Internal).center();
                }
            });
            vp.add(btAddInternal);
            ppAdd.setWidget(vp);
        }
        return ppAdd;
    }

    private DialogBox createDialogBox(StaffTypeEnum type) {
        StaffDialog dialog = new StaffDialog(saveService, type, suggestBox.getText());
        dialog.addCloseHandler(new CloseHandler<PopupPanel>() {
            @Override
            public void onClose(CloseEvent<PopupPanel> event) {
                StaffDialog dialog = (StaffDialog) event.getTarget();
                if (dialog.getStaffC().getId() != null) {
                    suggestBox.setValue(dialog.getStaffC().getReplacementString());
                    handler.staffChanged(dialog.getStaffC());
                }
            }
        });
        return dialog;
    }
}