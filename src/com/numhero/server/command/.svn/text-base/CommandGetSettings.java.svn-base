package com.numhero.server.command;

import com.numhero.client.model.datacargo.settings.GetSettingsRequest;
import com.numhero.client.model.datacargo.settings.GetSettingsResponse;
import com.numhero.client.model.pojoc.SettingsC;

public class CommandGetSettings extends AbstractAuthenticatedCommand<GetSettingsRequest, GetSettingsResponse> {

    @Override
    public GetSettingsResponse execute(GetSettingsRequest request) {

        GetSettingsResponse response = new GetSettingsResponse();

        SettingsC settingsC = new SettingsC();
        response.setSettingsC(settingsC);

        return response;
    }
}