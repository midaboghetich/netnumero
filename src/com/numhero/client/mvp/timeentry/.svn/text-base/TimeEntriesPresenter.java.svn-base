package com.numhero.client.mvp.timeentry;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.timeentry.DeleteTimeEntriesRequest;
import com.numhero.client.model.datacargo.timeentry.TimeEntryListRequest;
import com.numhero.client.model.datacargo.timeentry.TimeEntryListResponse;
import com.numhero.client.mvp.GenericTimeTabPage;
import com.numhero.client.mvp.GridPresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.CoreUtils;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

@Singleton
public class TimeEntriesPresenter extends GridPresenter {

    private Service<TimeEntryListRequest, TimeEntryListResponse> timeEntriesListService;
    private Service<DeleteTimeEntriesRequest, BulkActionResponse> deleteTimeEntriesService;

    @Inject
    public TimeEntriesPresenter(EventManager eventManager,
                                Service<TimeEntryListRequest,
                                        TimeEntryListResponse> timeEntriesListService,
                                Service<DeleteTimeEntriesRequest, BulkActionResponse> deleteTimeEntriesService) {

        super(eventManager, new GenericTimeTabPage(new TimeEntriesTable()));

        this.timeEntriesListService = timeEntriesListService;
        this.deleteTimeEntriesService = deleteTimeEntriesService;

        getView().setDetailTitlePanel(Application.getConstants().viewTimeEntries());

        final TimeEntriesTable table = (TimeEntriesTable) getView().getContentPanel().getContentWidget();
        Command raiseInvoicesCommand = new Command() {
            public void execute() {
                raiseInvoices(table.getSelectedIds());
            }
        };
        Command deleteTimeEntriesCommand = new Command() {
            public void execute() {
                deleteTimeEntries(table.getSelectedIds());
            }
        };
        table.getFooter().getTableFooterActionsCombo().setAnimationEnabled(true);
        table.getFooter().getTableFooterActionsCombo().setAutoOpen(true);
        MenuBar bulkActions = new MenuBar(true);
        bulkActions.addItem(new MenuItem(Application.getConstants().raiseInvoices(), raiseInvoicesCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteTasks(), deleteTimeEntriesCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));
    }

    private void raiseInvoices(List<String> ids) {
        //todo
        CoreUtils.debug("raiseInvoices");
    }

    private void deleteTimeEntries(List<String> ids) {
        DeleteTimeEntriesRequest request = new DeleteTimeEntriesRequest();
        request.setEntityIdList(ids);
        deleteTimeEntriesService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors deleting time entries");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("Problem deleting time entries:" + th.toString());
            }
        });
    }

    @Override
    protected String getPresenterUrl() {
        return "timeentries";
    }

    @Override
    public GenericTimeTabPage getView() {
        return (GenericTimeTabPage) super.getView();
    }

    @Override
    public void onShow() {
        refreshFromServer();
    }

    @Override
    public void onBind() {
    }

    private void refreshFromServer() {
        TimeEntryListRequest request = new TimeEntryListRequest();
        timeEntriesListService.execute(request, new ServiceCallbackImpl<TimeEntryListResponse>() {
            @Override
            public void onSuccess(TimeEntryListResponse response) {
                ((TimeEntriesTable) getView().getContentPanel().getContentWidget()).setTimeEntries(response.getTimeEntryCList());

            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem getting time entries:" + th.toString());
            }
        });
    }
}