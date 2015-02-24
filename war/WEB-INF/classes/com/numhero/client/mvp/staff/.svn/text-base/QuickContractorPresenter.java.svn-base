package com.numhero.client.mvp.staff;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.staff.GetStaffRequest;
import com.numhero.client.model.datacargo.staff.GetStaffResponse;
import com.numhero.client.model.datacargo.staff.SaveContractorRequest;
import com.numhero.client.model.datacargo.staff.SaveStaffResponse;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.client.mvp.BasePresenter;
import com.numhero.client.mvp.GenericStaffTabPage;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.LocationUtils;
import com.numhero.shared.enums.StaffTypeEnum;

@Singleton
public class QuickContractorPresenter extends BasePresenter {

    private Service<GetStaffRequest, GetStaffResponse> staffGetService;
    private Service<SaveContractorRequest, SaveStaffResponse> staffSaveService;

    @Inject
    public QuickContractorPresenter(EventManager eventManager,
                                    Service<GetStaffRequest, GetStaffResponse> staffGetService,
                                    Service<SaveContractorRequest, SaveStaffResponse> staffSaveService) {
        super(eventManager, new GenericStaffTabPage(new StaffPanel()));
        this.staffGetService = staffGetService;
        this.staffSaveService = staffSaveService;
    }

    @Override
    protected String getPresenterUrl() {
        return "quickcontractor";
    }

    @Override
    public GenericStaffTabPage getView() {
        return (GenericStaffTabPage) super.getView();
    }

    @Override
    protected void onShow() {
        if (getUrl().getId() == null) {
            getStaffPanel().setStaffC(new StaffC());
            getStaffPanel().getStaffC().setStaffType(StaffTypeEnum.Contractor);
            getView().setDetailTitlePanel(Application.getConstants().createNewContractor());
        } else {
            GetStaffRequest request = new GetStaffRequest();
            request.setEntityId(getUrl().getId());

            getView().setDetailTitlePanel(Application.getConstants().editContractor());

            staffGetService.execute(request, new ServiceCallbackImpl<GetStaffResponse>() {
                @Override
                public void onSuccess(GetStaffResponse response) {
                    getStaffPanel().setStaffC(response.getStaffC());
                }

                @Override
                public void onFailure(Throwable th) {
                    Window.alert("problem getting contractor:" + th.toString());
                }

            });
        }
    }

    private StaffPanel getStaffPanel() {
        return ((StaffPanel) getView().getContentPanel().getContentWidget());
    }

    @Override
    protected void onBind() {
        super.onBind();
        getStaffPanel().getBtSearch().addClickHandler(getSaveHandler());
        getStaffPanel().getBtCancel().setHref("#contractors");
    }

    private ClickHandler getSaveHandler() {
        ClickHandler ret = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if (getStaffPanel().saveValuesFromUi()) {

                    getStaffPanel().getStaffC().setStaffType(StaffTypeEnum.Contractor);
                    SaveContractorRequest request = new SaveContractorRequest();
                    request.setStaffC(getStaffPanel().getStaffC());
                    staffSaveService.execute(request, new ServiceCallbackImpl<SaveStaffResponse>() {
                        @Override
                        public void onSuccess(SaveStaffResponse response) {
                            Window.alert(Application.getConstants().contractorSaved());
                            LocationUtils.redirect("#contractors");
                        }

                        @Override
                        public void onFailure(Throwable th) {
                            Window.alert("problem saving contractor:" + th.toString());
                        }
                    });
                }
            }
        };
        return ret;
    }
}