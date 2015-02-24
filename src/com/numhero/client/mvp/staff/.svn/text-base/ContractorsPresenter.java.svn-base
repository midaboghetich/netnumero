package com.numhero.client.mvp.staff;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.staff.ContractorListRequest;
import com.numhero.client.model.datacargo.staff.DeleteStaffRequest;
import com.numhero.client.model.datacargo.staff.StaffListResponse;
import com.numhero.client.mvp.GenericStaffTabPage;
import com.numhero.client.mvp.GridPresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.CoreUtils;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

@Singleton
public class ContractorsPresenter extends GridPresenter {

    private Service<ContractorListRequest, StaffListResponse> staffListService;
    private Service<DeleteStaffRequest, BulkActionResponse> deleteStaffService;


    @Inject
    public ContractorsPresenter(
            EventManager eventManager,
            Service<ContractorListRequest, StaffListResponse> staffListService,
            Service<DeleteStaffRequest, BulkActionResponse> deleteStaffService) {
        super(eventManager, new GenericStaffTabPage(new StaffsTable()));
        this.staffListService = staffListService;
        this.deleteStaffService = deleteStaffService;


        getView().setDetailTitlePanel(Application.getConstants().manageContractors());

        final StaffsTable table = (StaffsTable) getView().getContentPanel().getContentWidget();
        Command deleteStaffCommand = new Command() {
            public void execute() {
                deleteStaff(table.getSelectedIds());
            }
        };
        table.getFooter().getTableFooterActionsCombo().setAnimationEnabled(true);
        table.getFooter().getTableFooterActionsCombo().setAutoOpen(true);
        MenuBar bulkActions = new MenuBar(true);
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteStaff(), deleteStaffCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));
    }

    private void deleteStaff(List<String> ids) {
        CoreUtils.debug("deleteStaff");
        DeleteStaffRequest request = new DeleteStaffRequest();
        request.setEntityIdList(ids);
        deleteStaffService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors deleting contractors");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("Problem deleting contractors:" + th.toString());
            }
        });
    }

    @Override
    protected String getPresenterUrl() {
        return "contractors";
    }

    @Override
    public GenericStaffTabPage getView() {
        return (GenericStaffTabPage) super.getView();
    }

    @Override
    public void onShow() {
        refreshFromServer();
    }

    private void refreshFromServer() {
        ContractorListRequest request = new ContractorListRequest();

        staffListService.execute(request, new ServiceCallbackImpl<StaffListResponse>() {
            @Override
            public void onSuccess(StaffListResponse response) {
                ((StaffsTable) getView().getContentPanel().getContentWidget()).setStaffs(response.getStaffCList());
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem getting contractors");
            }

        });
    }

    @Override
    protected void onBind() {
        super.onBind();
    }
}