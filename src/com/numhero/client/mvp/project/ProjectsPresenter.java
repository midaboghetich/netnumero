package com.numhero.client.mvp.project;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.project.DeleteProjectsRequest;
import com.numhero.client.model.datacargo.project.ProjectListRequest;
import com.numhero.client.model.datacargo.project.ProjectListResponse;
import com.numhero.client.model.datacargo.project.ProjectRaiseInvoicesRequest;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.client.mvp.GenericTimeTabPage;
import com.numhero.client.mvp.GridPresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.CoreUtils;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

@Singleton
public class ProjectsPresenter extends GridPresenter {

    private Service<ProjectListRequest, ProjectListResponse> projectListService;
    private Service<DeleteProjectsRequest, BulkActionResponse> deleteProjectsService;
    private Service<ProjectRaiseInvoicesRequest, BulkActionResponse> raiseInvoiceService;

    @Inject
    public ProjectsPresenter(
            EventManager eventManager,
            Service<ProjectListRequest, ProjectListResponse> projectListService,
            Service<DeleteProjectsRequest, BulkActionResponse> deleteProjectsService,
            Service<ProjectRaiseInvoicesRequest, BulkActionResponse> raiseInvoiceService) {
        super(eventManager, new GenericTimeTabPage(new ProjectsTable()));
        this.projectListService = projectListService;
        this.deleteProjectsService = deleteProjectsService;
        this.raiseInvoiceService = raiseInvoiceService;

        getView().setDetailTitlePanel(Application.getConstants().manageProjects());

        final ProjectsTable table = (ProjectsTable) getView().getContentPanel().getContentWidget();
        Command raiseInvoices = new Command() {
            public void execute() {
                raiseInvoices(table.getSelectedIds());
            }
        };
        Command deleteCommand = new Command() {
            public void execute() {
                deleteProjects(table.getSelectedIds());
            }
        };
        table.getFooter().getTableFooterActionsCombo().setAnimationEnabled(true);
        table.getFooter().getTableFooterActionsCombo().setAutoOpen(true);
        MenuBar bulkActions = new MenuBar(true);
        bulkActions.addItem(new MenuItem(Application.getConstants().raiseInvoices(), raiseInvoices));
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteProjects(), deleteCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));
    }

    private void raiseInvoices(List<String> ids) {
        ProjectRaiseInvoicesRequest request = new ProjectRaiseInvoicesRequest();
        request.setEntityIdList(ids);
        raiseInvoiceService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors raising invoices");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("Problem raising invoices:" + th.toString());
            }
        });
    }

    private void deleteProjects(List<String> ids) {
        DeleteProjectsRequest request = new DeleteProjectsRequest();
        request.setEntityIdList(ids);
        deleteProjectsService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors deleting Projects");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("Problem deleting Projects:" + th.toString());
            }
        });
    }

    @Override
    protected String getPresenterUrl() {
        return "projects";
    }

    @Override
    public GenericTimeTabPage getView() {
        return (GenericTimeTabPage) super.getView();
    }

    @Override
    public void onShow() {
        refreshFromServer();
    }

    private void refreshFromServer() {
        ProjectListRequest request = new ProjectListRequest();

        projectListService.execute(request,
                new ServiceCallbackImpl<ProjectListResponse>() {
                    @Override
                    public void onSuccess(ProjectListResponse response) {

                        List<ProjectC> projectsReturned = response.getProjectCList();

                        CoreUtils.debug("projectsReturned.size():" + projectsReturned.size());
                        ((ProjectsTable) getView().getContentPanel().getContentWidget()).setProjects(projectsReturned);
                    }

                    @Override
                    public void onFailure(Throwable th) {
                        Window.alert("problem get projects:" + th.toString());
                    }

                });
    }
}
