package com.numhero.client.mvp.settings;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.numhero.client.Application;
import com.numhero.client.model.pojoc.SettingsC;
import com.numhero.client.mvp.AbstractEditEntityPanel;
import com.numhero.client.widget.NetNumeroButton;
import com.numhero.client.widget.TitleLevelOne;
import com.numhero.shared.enums.LocaleEnum;

public class SettingsPanel extends AbstractEditEntityPanel {
    @Override
    protected void addValidators() {
    }

    interface SettingsUiBinder extends UiBinder<VerticalPanel, SettingsPanel> {
    }

    private static SettingsUiBinder uiBinder = GWT.create(SettingsUiBinder.class);

    @UiField
    DisclosurePanel errorsPanel;

    @UiField
    TitleLevelOne hdTitle;

    @UiField
    ListBox locales;

    @UiField
    NetNumeroButton btSave;

    @UiField
    NetNumeroButton btCancel;

    private SettingsC settingsC;


    public SettingsC getSettingsC() {
        return settingsC;
    }

    public SettingsPanel() {
        initWidget(uiBinder.createAndBindUi(this));
        createValidator(errorsPanel);
    }

    public TitleLevelOne getHdTitle() {
        return hdTitle;
    }

    public void setHdTitle(TitleLevelOne hdTitle) {
        this.hdTitle = hdTitle;
    }

    public ListBox getLocales() {
        return locales;
    }

    public void setLocales(ListBox locales) {
        this.locales = locales;
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

    @Override
    public TextBox getName() {
        return null;
    }

    public void setBtCancel(NetNumeroButton btCancel) {
        this.btCancel = btCancel;
    }

    public void setSettingsC(SettingsC settingsC) {
        this.settingsC = settingsC;
        resetValidator();
        if (settingsC.getId() == null) hdTitle.setHTML(Application.getConstants().createNewSettings());
        else hdTitle.setHTML(Application.getConstants().editSettings());
        if (settingsC.getLocale() != null) selectListBoxItem(getLocales(), settingsC.getLocale().name());
    }

    public boolean saveValuesFromUi() {
        boolean ret = validator.validate();
        if (ret) settingsC.setLocale(LocaleEnum.valueOf(getListBoxSelectValue(getLocales())));
        else errorsPanel.setVisible(true);
        return ret;
    }

    protected DisclosurePanel getErrorsPanel() {
        return errorsPanel;
    }


}