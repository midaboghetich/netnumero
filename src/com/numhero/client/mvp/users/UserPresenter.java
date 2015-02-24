package com.numhero.client.mvp.users;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ListBox;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.user.GetUserRequest;
import com.numhero.client.model.datacargo.user.GetUserResponse;
import com.numhero.client.model.datacargo.user.SaveUserRequest;
import com.numhero.client.model.datacargo.user.SaveUserResponse;
import com.numhero.client.model.pojoc.UserC;
import com.numhero.client.mvp.BasePresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.LocationUtils;
import com.numhero.shared.enums.UserRoleEnum;
import com.numhero.shared.enums.UserStatusEnum;

@Singleton
public class UserPresenter extends BasePresenter {
    Service<GetUserRequest, GetUserResponse> userGetService;
    Service<SaveUserRequest, SaveUserResponse> userSaveService;

    @Inject
    public UserPresenter(EventManager eventManager,
                         Service<GetUserRequest, GetUserResponse> userGetService,
                         Service<SaveUserRequest, SaveUserResponse> userSaveService,
                         UserView userView) {
        super(eventManager, userView);
        this.userGetService = userGetService;
        this.userSaveService = userSaveService;
    }

    @Override
    protected String getPresenterUrl() {
        return "user";
    }

    @Override
    public UserView getView() {
        return (UserView) super.getView();
    }

    @Override
    public void onShow() {
        if (getUrl().getId() == null) {
            getView().getUserPanel().setUserC(new UserC());
        } else {

            GetUserRequest request = new GetUserRequest();

            request.setEntityId(getUrl().getId());

            userGetService.execute(request, new ServiceCallbackImpl<GetUserResponse>() {
                @Override
                public void onSuccess(GetUserResponse response) {
                    getView().getUserPanel().setUserC(response.getUserC());
                }

                @Override
                public void onFailure(Throwable th) {
                    Window.alert("problem get user: " + th.toString());
                }

            });
        }
    }

    private ClickHandler saveUserHandler() {
        ClickHandler ret = new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {

                SaveUserRequest request = new SaveUserRequest();
                if (getView().getUserPanel().saveValuesFromUi()) {
                    request.setUserC(getView().getUserPanel().getUserC());

                    userSaveService.execute(request, new ServiceCallbackImpl<SaveUserResponse>() {
                        @Override
                        public void onSuccess(SaveUserResponse response) {
                            Window.alert(Application.getConstants().userSaved());
                            LocationUtils.redirect("#users");
                        }

                        @Override
                        public void onFailure(Throwable th) {
                            Window.alert("problem saving user: " + th.toString());
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

        UserPanel panel = getView().getUserPanel();

        ListBox status = panel.getStatus();
        for (UserStatusEnum c : UserStatusEnum.values()) {
            status.addItem(c.name());
        }

        ListBox profile = panel.getUserProfile();
        for (UserRoleEnum c : UserRoleEnum.values()) {
            profile.addItem(c.name());
        }

        panel.getBtSearch().addClickHandler(saveUserHandler());
    }

    @Override
    protected void onUnbind() {
        super.onUnbind();
    }
}
