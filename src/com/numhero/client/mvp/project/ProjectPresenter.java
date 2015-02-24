package com.numhero.client.mvp.project;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.project.GetProjectRequest;
import com.numhero.client.model.datacargo.project.GetProjectResponse;
import com.numhero.client.model.datacargo.project.SaveProjectRequest;
import com.numhero.client.model.datacargo.project.SaveProjectResponse;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.client.mvp.BasePresenter;
import com.numhero.client.mvp.GenericTimeTabPage;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.LocationUtils;

@Singleton
public class ProjectPresenter extends BasePresenter {
    Service<GetProjectRequest, GetProjectResponse> projectGetService;
    Service<SaveProjectRequest, SaveProjectResponse> projectSaveService;

    @Inject
    public ProjectPresenter(EventManager eventManager,
                            Service<GetProjectRequest, GetProjectResponse> projectGetService,
                            Service<SaveProjectRequest, SaveProjectResponse> projectSaveService,
                            ProjectPanel projectPanel) {
        super(eventManager, new GenericTimeTabPage(projectPanel));
        this.projectGetService = projectGetService;
        this.projectSaveService = projectSaveService;
    }

    @Override
    protected String getPresenterUrl() {
        return "project";
    }

    @Override
    public GenericTimeTabPage getView() {
        return (GenericTimeTabPage) super.getView();
    }

    @Override
    public void onShow() {
        if (getUrl().getId() == null) {
            getView().setDetailTitlePanel(Application.getConstants().createNewProject());
            getProjectPanel().setProjectC(new ProjectC());
        } else {
            getView().setDetailTitlePanel(Application.getConstants().editProject());
            GetProjectRequest request = new GetProjectRequest();
            request.setEntityId(getUrl().getId());

            projectGetService.execute(request, new ServiceCallbackImpl<GetProjectResponse>() {
                @Override
                public void onSuccess(GetProjectResponse response) {
                    getProjectPanel().setProjectC(response.getProjectC());
                }
            });
        }
    }

    private ProjectPanel getProjectPanel() {
        return ((ProjectPanel) getView().getContentPanel().getContentWidget());
    }

    private ClickHandler saveProjectHandler() {
        ClickHandler ret = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                SaveProjectRequest request = new SaveProjectRequest();
                if (getProjectPanel().saveValuesFromUi()) {

                    request.setProjectC(getProjectPanel().getProjectC());

                    projectSaveService.execute(request, new ServiceCallbackImpl<SaveProjectResponse>() {
                        @Override
                        public void onSuccess(SaveProjectResponse response) {
                            LocationUtils.redirect("#projects");
                        }

                        @Override
                        public void onFailure(Throwable th) {
                            Window.alert("problems saving project:" + th.toString());
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
        getProjectPanel().getBtSearch().addClickHandler(saveProjectHandler());
    }
}
