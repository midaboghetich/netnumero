package com.numhero.client.mvp.staff;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.numhero.client.model.pojoc.StaffC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.widget.NetNumeroButton;

public class QuickStaffPanel extends AbstractEditEntityPanel {

    interface StaffUiBinder extends UiBinder<VerticalPanel, QuickStaffPanel> {
    }

    private static StaffUiBinder uiBinder = GWT.create(StaffUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField
    TextBox name;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private StaffC staffC;

    public QuickStaffPanel() {
        initWidget(uiBinder.createAndBindUi(this));
        createValidator(errorsPanel);
    }

    public void setStaffC(StaffC staffC) {
        this.staffC = staffC;
        resetValidator();
        name.setValue(staffC.getName());
    }

    public boolean saveValuesFromUi() {
        boolean ret = validator.validate();
        if (ret) {
            staffC.setName(name.getValue());
        } else {
            errorsPanel.setVisible(true);
        }
        return ret;
    }

    public NetNumeroButton getBtSearch() {
        return btSave;
    }

    public NetNumeroButton getBtCancel() {
        return btCancel;
    }

    public StaffC getStaffC() {
        return staffC;
    }

    protected DisclosurePanel getErrorsPanel() {
        return errorsPanel;
    }

    @Override
    protected void addValidators() {

    }

    public TextBox getName() {
        return name;
    }
}