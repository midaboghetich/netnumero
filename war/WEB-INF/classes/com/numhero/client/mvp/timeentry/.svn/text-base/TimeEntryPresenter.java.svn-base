package com.numhero.client.mvp.timeentry;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.timeentry.*;
import com.numhero.client.model.pojoc.TimeEntryC;
import com.numhero.client.mvp.BasePresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.CoreUtils;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

@Singleton
public class TimeEntryPresenter extends BasePresenter {

    Service<GetTimeEntryRequest, GetTimeEntryResponse> timeentryGetService;
    Service<SaveTimeEntryRequest, SaveTimeEntryResponse> timeentrySaveService;
    private Service<TimeEntryListRequest, TimeEntryListResponse> timeEntriesListService;
    private Service<DeleteTimeEntriesRequest, BulkActionResponse> deleteTimeEntriesService;

    private TimeEntryC timeentryC;

    @Inject
    public TimeEntryPresenter(EventManager eventManager,
                              Service<GetTimeEntryRequest, GetTimeEntryResponse> timeentryGetService,
                              Service<SaveTimeEntryRequest, SaveTimeEntryResponse> timeentrySaveService,
                              TimeEntryView timeentryView,
                              Service<TimeEntryListRequest, TimeEntryListResponse> timeEntriesListService,
                              Service<DeleteTimeEntriesRequest, BulkActionResponse> deleteTimeEntriesService) {
        super(eventManager, timeentryView);
        this.timeentryGetService = timeentryGetService;
        this.timeentrySaveService = timeentrySaveService;
        this.timeEntriesListService = timeEntriesListService;
        this.deleteTimeEntriesService = deleteTimeEntriesService;

        final TimeEntriesTable table = getView().getTimeEntryPanel().getTimeEntriesTable();

        Command deleteCommand = new Command() {
            public void execute() {
                deleteTimeEntries(table.getSelectedIds());
            }
        };

        Command raiseInvoicesCommand = new Command() {
            public void execute() {
                raiseInvoices(table.getSelectedIds());
            }
        };

        table.getFooter().getTableFooterActionsCombo().setAnimationEnabled(true);
        table.getFooter().getTableFooterActionsCombo().setAutoOpen(true);
        MenuBar bulkActions = new MenuBar(true);
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteTimeEntries(), deleteCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().raiseInvoices(), raiseInvoicesCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));
    }

    private void deleteTimeEntries(List<String> selectedIds) {
        DeleteTimeEntriesRequest request = new DeleteTimeEntriesRequest();
        request.setEntityIdList(selectedIds);
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

    private void raiseInvoices(List<String> ids) {
        //todo
        CoreUtils.debug("raiseInvoices");
    }

    @Override
    protected String getPresenterUrl() {
        return "timeentry";
    }

    @Override
    public TimeEntryView getView() {
        return (TimeEntryView) super.getView();
    }

    @Override
    public void onShow() {

        getView().getTimeEntryPanel().getDescription().addMouseOverHandler(new MouseOverHandler() {
            @Override
            public void onMouseOver(MouseOverEvent mouseOverEvent) {
                getView().getTimeEntryPanel().getDescription().setFocus(true);
            }
        });


        if (getUrl().getId() == null) {
            timeentryC = new TimeEntryC();
            timeentryC.setTimeUnit(0D);
            getView().getTimeEntryPanel().setTimeEntryC(timeentryC);
        } else {
            GetTimeEntryRequest request = new GetTimeEntryRequest();
            request.setEntityId(getUrl().getId());
            timeentryGetService.execute(request, new ServiceCallbackImpl<GetTimeEntryResponse>() {
                @Override
                public void onSuccess(GetTimeEntryResponse response) {
                    timeentryC = response.getTimeEntryC();
                    getView().getTimeEntryPanel().setTimeEntryC(timeentryC);
                }
            });
        }

        refreshFromServer();
    }

    private ClickHandler saveTimeEntryHandler() {
        ClickHandler ret = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if (getView().getTimeEntryPanel().saveValuesFromUi()) {
                    SaveTimeEntryRequest request = new SaveTimeEntryRequest();
                    request.setTimeEntryC(timeentryC);
                    timeentrySaveService.execute(request, new ServiceCallbackImpl<SaveTimeEntryResponse>() {
                        @Override
                        public void onSuccess(SaveTimeEntryResponse response) {
                            refreshFromServer();
                        }
                    });
                }
            }
        };
        return ret;
    }

    @Override
    protected void onBind() {
        super.onBind();
        final TimeEntryPanel panel = getView().getTimeEntryPanel();

        panel.getCalendarWidget().addChangeListener(new ChangeListener() {
            public void onChange(Widget sender) {
                panel.getSelectedDate().setValue(panel.getCalendarWidget().getDate());
            }
        });

        panel.getBtSearch().addClickHandler(saveTimeEntryHandler());
    }

    @Override
    protected void onUnbind() {
        super.onUnbind();
    }

    private void refreshFromServer() {
        TimeEntryListRequest request = new TimeEntryListRequest();
        timeEntriesListService.execute(request, new ServiceCallbackImpl<TimeEntryListResponse>() {
            @Override
            public void onSuccess(TimeEntryListResponse response) {
                getView().getTimeEntryPanel().getTimeEntriesTable().setTimeEntries(response.getTimeEntryCList());

            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem getting time entries:" + th.toString());
            }
        });
    }

}
