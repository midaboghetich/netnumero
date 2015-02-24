package com.numhero.client.mvp.users;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.numhero.client.Application;
import com.numhero.client.events.EventManager;
import com.numhero.client.model.datacargo.user.DeleteUsersRequest;
import com.numhero.client.model.datacargo.user.UserListRequest;
import com.numhero.client.model.datacargo.user.UserListResponse;
import com.numhero.client.mvp.GridPresenter;
import com.numhero.client.service.Service;
import com.numhero.client.service.ServiceCallbackImpl;
import com.numhero.client.util.CoreUtils;
import com.numhero.shared.datacargo.BulkActionResponse;

import java.util.List;

@Singleton
public class UsersPresenter extends GridPresenter {

    private Service<UserListRequest, UserListResponse> userListService;
    private Service<DeleteUsersRequest, BulkActionResponse> deleteUsersService;


    @Inject
    public UsersPresenter(EventManager eventManager,
                          Service<UserListRequest, UserListResponse> userListService,
                          UsersView recentUsersView,
                          Service<DeleteUsersRequest, BulkActionResponse> deleteUsersService) {
        super(eventManager, recentUsersView);
        this.userListService = userListService;
        this.deleteUsersService = deleteUsersService;

        final UsersTable table = ((UsersPanel) getView().getContent()).getUsersTable();
        Command suspendUsersCommand = new Command() {
            public void execute() {
                suspendUsers(table.getSelectedIds());
            }
        };
        Command unsuspendCommand = new Command() {
            public void execute() {
                unsuspendUsers(table.getSelectedIds());
            }
        };
        Command deleteUsersCommand = new Command() {
            public void execute() {
                deleteUsers(table.getSelectedIds());
            }
        };
        table.getFooter().getTableFooterActionsCombo().setAnimationEnabled(true);
        table.getFooter().getTableFooterActionsCombo().setAutoOpen(true);
        MenuBar bulkActions = new MenuBar(true);
        bulkActions.addItem(new MenuItem(Application.getConstants().suspendUsers(), suspendUsersCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().unsuspendUsers(), unsuspendCommand));
        bulkActions.addItem(new MenuItem(Application.getConstants().deleteUsers(), deleteUsersCommand));
        table.getFooter().getTableFooterActionsCombo().addItem(new MenuItem(Application.getConstants().bulkAction(), bulkActions));
    }

    private void suspendUsers(List<String> ids) {
        CoreUtils.debug("suspendUsers");

    }

    private void unsuspendUsers(List<String> ids) {
        CoreUtils.debug("unsuspendUsers");
    }

    private void deleteUsers(List<String> ids) {
        DeleteUsersRequest request = new DeleteUsersRequest();
        request.setEntityIdList(ids);
        deleteUsersService.execute(request, new ServiceCallbackImpl<BulkActionResponse>() {
            @Override
            public void onSuccess(BulkActionResponse response) {
                if (!response.getFailureIdList().isEmpty()) Window.alert("Errors deleting users");
                refreshFromServer();
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("Problem deleting users:" + th.toString());
            }
        });
    }

    @Override
    protected String getPresenterUrl() {
        return "users";
    }

    @Override
    public UsersView getView() {
        return (UsersView) super.getView();
    }

    @Override
    public void onShow() {
        refreshFromServer();
    }

    private void refreshFromServer() {
        UserListRequest request = new UserListRequest();

        userListService.execute(request, new ServiceCallbackImpl<UserListResponse>() {
            @Override
            public void onSuccess(UserListResponse response) {
                getView().getUsersPanel().getUsersTable().setUsers(response.getUserCList());
            }

            @Override
            public void onFailure(Throwable th) {
                Window.alert("problem get users:" + th.toString());
            }

        });
    }
}
