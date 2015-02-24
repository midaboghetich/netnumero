package com.numhero.client.mvp.staff;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.DialogBox;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.staff.SaveStaffRequest;
import com.numhero.client.model.datacargo.staff.SaveStaffResponse;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.shared.enums.StaffTypeEnum;

public class StaffDialog extends DialogBox {
    private QuickStaffPanel staffPanel;
    private StaffC staffC;

    public StaffDialog(final Service<SaveStaffRequest, SaveStaffResponse> staffSaveService, StaffTypeEnum type, String staffName) {

        setText(Application.getConstants().staff());
        setModal(true);
        setGlassEnabled(true);
        setAnimationEnabled(true);

        staffPanel = new QuickStaffPanel();
        staffC = new StaffC();
        staffC.setName(staffName);
        staffC.setStaffType(type);
        staffPanel.setPojoC(staffC);
        staffPanel.setStaffC(staffC);

        staffPanel.getBtSearch().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if (staffPanel.saveValuesFromUi()) {
                    SaveStaffRequest request = new SaveStaffRequest();
                    request.setStaffC(staffC);
                    staffSaveService.execute(request, new ServiceCallbackImpl<SaveStaffResponse>() {
                        @Override
                        public void onSuccess(SaveStaffResponse response) {
                            staffC.setId(response.getEntityId());
                            StaffDialog.this.hide();
                        }
                    });
                }
            }
        });
        staffPanel.getBtCancel().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                StaffDialog.this.hide();
            }
        });
        setWidget(staffPanel);
    }

    public StaffC getStaffC() {
        return staffC;
    }

}