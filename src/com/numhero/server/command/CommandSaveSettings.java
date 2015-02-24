package com.numhero.server.command;

import com.numhero.client.model.datacargo.settings.SaveSettingsRequest;
import com.numhero.client.model.datacargo.settings.SaveSettingsResponse;
import com.numhero.client.model.pojoc.SettingsC;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommandSaveSettings extends AbstractAuthenticatedCommand<SaveSettingsRequest, SaveSettingsResponse> {
    @SuppressWarnings("unused")
    private static Log log = LogFactory.getLog(CommandSaveSettings.class);

    @Override
    public SaveSettingsResponse execute(SaveSettingsRequest request) {

        SaveSettingsResponse response = new SaveSettingsResponse();

        SettingsC settingsC = new SettingsC();

        response.setEntityId(settingsC.getId());

        return response;

    }
}