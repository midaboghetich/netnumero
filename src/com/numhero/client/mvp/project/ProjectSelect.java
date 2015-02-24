package com.numhero.client.mvp.project;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.*;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
import com.numhero.client.model.datacargo.project.ProjectListRequest;
import com.numhero.client.model.datacargo.project.ProjectListResponse;
import com.numhero.client.model.datacargo.project.SaveProjectRequest;
import com.numhero.client.model.datacargo.project.SaveProjectResponse;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.client.service.Service;
import com.numhero.client.widget.combobox.ServerSuggestOracle;


public class ProjectSelect extends Composite implements Focusable {
    public interface ProjectSelectHandler {
        public void projectChanged(ProjectC projectC);
    }

    interface ProjectSelectUiBinder extends UiBinder<HTMLPanel, ProjectSelect> {
    }

    private static ProjectSelectUiBinder uiBinder = GWT.create(ProjectSelectUiBinder.class);

    @UiField(provided = true)
    SuggestBox sb;

    @UiField
    Anchor btAdd;

    private Service<SaveProjectRequest, SaveProjectResponse> saveService;
    private ProjectC pojoC;
    private ProjectSelectHandler handler;

    public ProjectSelect(
            Service<ProjectListRequest, ProjectListResponse> getListService,
            Service<SaveProjectRequest, SaveProjectResponse> saveService,
            final QuickProjectPanel projectPanel) {
        this.saveService = saveService;

        pojoC = new ProjectC();
        sb = new SuggestBox(new ServerSuggestOracle<ProjectListRequest, ProjectListResponse>(getListService, new ProjectListRequest()));
        sb.addSelectionHandler(new SelectionHandler<Suggestion>() {
            @Override
            public void onSelection(SelectionEvent<Suggestion> event) {
                if (event.getSelectedItem() instanceof ProjectC) {
                    pojoC = (ProjectC) event.getSelectedItem();
                    handler.projectChanged(pojoC);
                }
            }
        });
        sb.getTextBox().addValueChangeHandler(new ValueChangeHandler<String>() {
            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                pojoC.setName(null);
                handler.projectChanged(pojoC);
            }
        });

        initWidget(uiBinder.createAndBindUi(this));

        btAdd.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                createDialogBox(projectPanel).center();
            }
        });
    }

    public void setHandler(ProjectSelectHandler handler) {
        this.handler = handler;
    }

    public void setProject(String projectId, String companyName) {
        pojoC.setId(projectId);
        pojoC.setName(companyName);
    }

    public ProjectC getProjectC() {
        return pojoC;
    }

    public SuggestBox getSbProject() {
        return sb;
    }

    @Override
    public int getTabIndex() {
        return sb.getTabIndex();
    }

    @Override
    public void setAccessKey(char key) {
        sb.setAccessKey(key);
    }

    @Override
    public void setFocus(boolean focused) {
        sb.setFocus(focused);
    }

    @Override
    public void setTabIndex(int index) {
        sb.setTabIndex(index);
    }

    private DialogBox createDialogBox(QuickProjectPanel projectPanel) {
        ProjectDialog dialog = new ProjectDialog(saveService, projectPanel, sb.getText());
        dialog.addCloseHandler(new CloseHandler<PopupPanel>() {
            @Override
            public void onClose(CloseEvent<PopupPanel> event) {
                ProjectDialog dialog = (ProjectDialog) event.getTarget();
                if (dialog.getProjectC().getId() != null) {
                    sb.setValue(dialog.getProjectC().getReplacementString());
                    handler.projectChanged(dialog.getProjectC());
                }
            }
        });
        return dialog;
    }
}