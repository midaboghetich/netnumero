package com.numhero.client.mvp.project;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.inject.Inject;
import com.numhero.client.Application;
import com.numhero.client.model.datacargo.project.SaveProjectRequest;
import com.numhero.client.model.datacargo.project.SaveProjectResponse;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;

public class ProjectDialog extends DialogBox {

    private ProjectC projectC;

    @Inject
    public ProjectDialog(final Service<SaveProjectRequest, SaveProjectResponse> projectSaveService,
                         final QuickProjectPanel projectPanel,
                         String projectName) {
        setText(Application.getConstants().newProject());
        setModal(true);
        setGlassEnabled(true);
        setAnimationEnabled(true);

        projectC = new ProjectC();
        projectC.setName(projectName);

        projectPanel.setProjectC(projectC);

        projectPanel.btSave.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if (projectPanel.saveValuesFromUi()) {

                    SaveProjectRequest request = new SaveProjectRequest();

                    request.setProjectC(projectC);

                    projectSaveService.execute(request, new ServiceCallbackImpl<SaveProjectResponse>() {
                        @Override
                        public void onSuccess(SaveProjectResponse response) {
                            projectC.setId(response.getEntityId());
                            ProjectDialog.this.hide();
                        }
                    });
                }
            }
        });
        projectPanel.btCancel.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                ProjectDialog.this.hide();
            }
        });
        setWidget(projectPanel);
    }

    public ProjectC getProjectC() {
        return projectC;
    }
}