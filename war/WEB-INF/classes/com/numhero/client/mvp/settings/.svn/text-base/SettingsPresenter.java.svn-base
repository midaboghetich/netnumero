package com.numhero.client.mvp.settings;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ListBox;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.settings.GetSettingsRequest;
import com.numhero.client.model.datacargo.settings.GetSettingsResponse;
import com.numhero.client.model.datacargo.settings.SaveSettingsRequest;
import com.numhero.client.model.datacargo.settings.SaveSettingsResponse;
import com.numhero.client.model.pojoc.SettingsC;
import com.numhero.client.mvp.BasePresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.shared.enums.LocaleEnum;

@Singleton
public class SettingsPresenter extends BasePresenter {

    Service<GetSettingsRequest, GetSettingsResponse> settingsGetService;
    Service<SaveSettingsRequest, SaveSettingsResponse> settingsSaveService;

    @Inject
    public SettingsPresenter(EventManager eventManager,
                             Service<GetSettingsRequest, GetSettingsResponse> settingsGetService,
                             Service<SaveSettingsRequest, SaveSettingsResponse> settingsSaveService,
                             SettingsView settingsView) {
        super(eventManager, settingsView);
        this.settingsGetService = settingsGetService;
        this.settingsSaveService = settingsSaveService;
    }

    @Override
    protected String getPresenterUrl() {
        return "settings";
    }

    @Override
    public SettingsView getView() {
        return (SettingsView) super.getView();
    }

    @Override
    public void onShow() {
        if (getUrl().getId() == null) {
            getView().getSettingsPanel().setSettingsC(new SettingsC());
        } else {
            GetSettingsRequest request = new GetSettingsRequest();
            request.setEntityId(getUrl().getId());

            settingsGetService.execute(request, new ServiceCallbackImpl<GetSettingsResponse>() {
                @Override
                public void onSuccess(GetSettingsResponse response) {
                    getView().getSettingsPanel().setSettingsC(response.getSettingsC());
                }
            });
        }
    }

    private ClickHandler saveSettingsHandler() {
        ClickHandler ret = new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                SettingsPanel panel = getView().getSettingsPanel();
                if (panel.saveValuesFromUi()) {

                    SaveSettingsRequest request = new SaveSettingsRequest();
                    request.setSettingsC(getView().getSettingsPanel().getSettingsC());

                    settingsSaveService.execute(request, new ServiceCallbackImpl<SaveSettingsResponse>() {

                        @Override
                        public void onSuccess(SaveSettingsResponse response) {
                            Window.alert(Application.getConstants().settingsSaved());
                        }

                        @Override
                        public void onFailure(Throwable th) {
                            Window.alert("problem saving settings:" + th.toString());
                        }
                    });
                }
            }
        };
        return ret;
    }

    @Override
    protected void onUnbind() {
        super.onUnbind();
    }

    @Override
    protected void onBind() {
        super.onBind();
        SettingsPanel panel = getView().getSettingsPanel();
        ListBox locales = panel.getLocales();
        for (LocaleEnum c : LocaleEnum.values()) {
            locales.addItem(c.name());
        }
        panel.getBtSearch().addClickHandler(saveSettingsHandler());
    }
}
