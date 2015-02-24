package com.numhero.client.mvp.timeentry;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.inject.Inject;
import com.numhero.client.model.datacargo.project.ProjectListRequest;
import com.numhero.client.model.datacargo.project.ProjectListResponse;
import com.numhero.client.model.datacargo.project.SaveProjectRequest;
import com.numhero.client.model.datacargo.project.SaveProjectResponse;
import com.numhero.client.model.datacargo.task.SaveTaskRequest;
import com.numhero.client.model.datacargo.task.SaveTaskResponse;
import com.numhero.client.model.datacargo.task.TaskListRequest;
import com.numhero.client.model.datacargo.task.TaskListResponse;
import com.numhero.client.model.pojoc.ProjectC;
import com.numhero.client.model.pojoc.TaskC;
import com.numhero.client.model.pojoc.TimeEntryC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.mvp.project.ProjectSelect;
import com.numhero.client.mvp.project.QuickProjectPanel;
import com.numhero.client.mvp.task.QuickTaskPanel;
import com.numhero.client.mvp.task.TaskSelect;
import com.numhero.client.service.Service;
import com.numhero.client.util.CoreUtils;
import com.numhero.client.widget.CustomFormatDateBox;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.client.widget.calendar.CalendarWidget;
import com.numhero.client.widget.textbox.NumberTextBox;

public class TimeEntryPanel extends AbstractEditEntityPanel implements
        ProjectSelect.ProjectSelectHandler,
        TaskSelect.TaskSelectHandler {

    @Override
    public void taskChanged(TaskC taskC) {
        timeEntryC.setTaskId(taskC.getId());
        timeEntryC.setDescription(taskC.getDescription());
    }

    @Override
    public void projectChanged(ProjectC projectC) {
        timeEntryC.setProjectId(projectC.getId());
        timeEntryC.setDescription(projectC.getDescription());
        timeEntryC.setProjectName(projectC.getName());
        timeEntryC.setTaskName(projectC.getName());
    }

    interface TimeEntryUiBinder extends UiBinder<VerticalPanel, TimeEntryPanel> {
    }

    private static TimeEntryUiBinder uiBinder = GWT.create(TimeEntryUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField(provided = true)
    CalendarWidget calendarWidget;

    @UiField
    TextBox notes;

    @UiField
    TextBox description;

    @UiField
    Label created;

    @UiField
    CustomFormatDateBox selectedDate;

    @UiField(provided = true)
    ProjectSelect sbProject;

    @UiField(provided = true)
    TaskSelect sbTask;

    @UiField
    NumberTextBox timeUnit;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    @UiField
    TimeEntriesTable timeEntriesTable;

    private TimeEntryC timeEntryC;

    @Inject
    public TimeEntryPanel(
            Service<ProjectListRequest, ProjectListResponse> projectService,
            Service<SaveProjectRequest, SaveProjectResponse> projectSaveService,
            Service<TaskListRequest, TaskListResponse> taskService,
            Service<SaveTaskRequest, SaveTaskResponse> taskSaveService,
            QuickProjectPanel panel,
            QuickTaskPanel taskpanel) {

        calendarWidget = new CalendarWidget();

        sbProject = new ProjectSelect(projectService, projectSaveService, panel);
        sbProject.setHandler(this);

        sbTask = new TaskSelect(taskService, taskSaveService, taskpanel, null);
        sbTask.setHandler(this);


        initWidget(uiBinder.createAndBindUi(this));
        createValidator(errorsPanel);
    }

    public TextBox getNotes() {
        return notes;
    }

    public void setNotes(TextBox notes) {
        this.notes = notes;
    }

    public TextBox getDescription() {
        return description;
    }

    public void setDescription(TextBox description) {
        this.description = description;
    }

    public Label getCreated() {
        return created;
    }

    public void setCreated(Label created) {
        this.created = created;
    }

    public NetNumeroButton getBtSearch() {
        return btSave;
    }

    public void setBtSave(NetNumeroButton btSave) {
        this.btSave = btSave;
    }

    public boolean saveValuesFromUi() {
        boolean ret = validator.validate();
        if (ret) {
            timeEntryC.setDescription(getDescription().getText());
            timeEntryC.setDate(getSelectedDate().getValue());
            timeEntryC.setNotes(getNotes().getValue());
            timeEntryC.setProjectId(sbProject.getProjectC().getId());
            timeEntryC.setTaskId(sbTask.getTaskC().getId());
            if (!sbProject.getProjectC().isEmpty()) timeEntryC.setProjectName(sbProject.getProjectC().getName());
            if (!sbTask.getTaskC().isEmpty()) timeEntryC.setTaskName(sbTask.getTaskC().getName());
            timeEntryC.setTimeUnit(getTimeUnit().getAmount());

        } else {
            errorsPanel.setVisible(true);
        }
        return ret;
    }

    public void setTimeEntryC(TimeEntryC t) {
        resetValidator();
        this.timeEntryC = t;
        if (timeEntryC.getCreated() != null) created.setText(timeEntryC.getCreated().toString());
        notes.setValue(timeEntryC.getNotes());
        description.setValue(timeEntryC.getDescription());
        sbProject.setProject(timeEntryC.getProjectId(), timeEntryC.getDescription());
        sbTask.setTask(timeEntryC.getTaskId(), timeEntryC.getDescription());
        CoreUtils.debug("timeEntryC.getTimeUnit() = " + timeEntryC.getTimeUnit());
        CoreUtils.debug("timeUnit= " + timeUnit);
        if (timeEntryC.getTimeUnit() != null)
            timeUnit.setAmount(timeEntryC.getTimeUnit());
        else
            timeUnit.setAmount(0D);

    }

    protected DisclosurePanel getErrorsPanel() {
        return errorsPanel;
    }

    public CalendarWidget getCalendarWidget() {
        return calendarWidget;
    }

    public void setCalendarWidget(CalendarWidget calendarWidget) {
        this.calendarWidget = calendarWidget;
    }

    public ProjectSelect getSbProject() {
        return sbProject;
    }

    public void setSbProject(ProjectSelect sbProject) {
        this.sbProject = sbProject;
    }

    public TaskSelect getSbTask() {
        return sbTask;
    }

    public void setSbTask(TaskSelect sbTask) {
        this.sbTask = sbTask;
    }

    public NetNumeroButton getBtCancel() {
        return btCancel;
    }

    @Override
    public TextBox getName() {
        return null;
    }

    public void setBtCancel(NetNumeroButton btCancel) {
        this.btCancel = btCancel;
    }

    public CustomFormatDateBox getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(CustomFormatDateBox selectedDate) {
        this.selectedDate = selectedDate;
    }

    @Override
    protected void addValidators() {
    }

    public TimeEntriesTable getTimeEntriesTable() {
        return timeEntriesTable;
    }

    public void setTimeEntriesTable(TimeEntriesTable timeEntriesTable) {
        this.timeEntriesTable = timeEntriesTable;
    }

    public NumberTextBox getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(NumberTextBox timeUnit) {
        this.timeUnit = timeUnit;
    }
}