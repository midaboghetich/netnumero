package com.numhero.client.mvp.users;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.UserC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.widget.CustomFormatDateBox;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.client.widget.TitleLevelOne;

public class UserPanel extends AbstractEditEntityPanel {

    interface UserPanelUiBinder extends UiBinder<VerticalPanel, UserPanel> {
    }

    private static UserPanelUiBinder uiBinder = GWT.create(UserPanelUiBinder.class);

    @UiField
    TitleLevelOne hdTitle;

    @UiField
    DisclosurePanel errorsPanel;

    @UiField
    TextBox name = new TextBox();

    @UiField
    TextBox firstName = new TextBox();

    @UiField
    TextBox lastName = new TextBox();

    @UiField
    TextBox password = new TextBox();

    @UiField
    ListBox userProfile = new ListBox();

    @UiField
    ListBox status = new ListBox();

    @UiField
    CustomFormatDateBox lastLogin;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private UserC userC;

    public UserPanel() {
        initWidget(uiBinder.createAndBindUi(this));
        createValidator(errorsPanel);
    }

    public TextBox getName() {
        return name;
    }

    public void setName(TextBox name) {
        this.name = name;
    }

    public TextBox getFirstName() {
        return firstName;
    }

    public void setFirstName(TextBox firstName) {
        this.firstName = firstName;
    }

    public TextBox getLastName() {
        return lastName;
    }

    public void setLastName(TextBox lastName) {
        this.lastName = lastName;
    }

    public TextBox getPassword() {
        return password;
    }

    public void setPassword(TextBox password) {
        this.password = password;
    }

    public ListBox getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(ListBox userProfile) {
        this.userProfile = userProfile;
    }

    public ListBox getStatus() {
        return status;
    }

    public void setStatus(ListBox status) {
        this.status = status;
    }

    public TitleLevelOne getHdTitle() {
        return hdTitle;
    }

    public void setHdTitle(TitleLevelOne hdTitle) {
        this.hdTitle = hdTitle;
    }

    public NetNumeroButton getBtSearch() {
        return btSave;
    }

    public void setBtSave(NetNumeroButton btSave) {
        this.btSave = btSave;
    }

    public NetNumeroButton getBtCancel() {
        return btCancel;
    }

    public void setBtCancel(NetNumeroButton btCancel) {
        this.btCancel = btCancel;
    }

    public UserC getUserC() {
        return userC;
    }

    public CustomFormatDateBox getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(CustomFormatDateBox lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean saveValuesFromUi() {
        boolean ret = validator.validate();
        if (ret) {
            userC.setFirstName(firstName.getValue());
            userC.setLastName(lastName.getValue());
            if (userC.getUserProfile() != null) selectListBoxItem(userProfile, userC.getUserProfile().name());
            userC.setLastLogin(lastLogin.getValue());
        } else {
            errorsPanel.setVisible(true);
        }
        return ret;
    }

    public void setUserC(UserC userC) {
        resetValidator();

        this.userC = userC;
        if (userC.getId() == null) hdTitle.setHTML(Application.getConstants().createNewUser());
        else hdTitle.setHTML(Application.getConstants().editProject());
        selectListBoxItem(userProfile, userC.getUserProfile().name());
        firstName.setValue(userC.getFirstName());
        lastLogin.setValue(userC.getLastLogin());
        lastName.setValue(userC.getLastName());
    }

    @Override
    protected void addValidators() {

    }
}
