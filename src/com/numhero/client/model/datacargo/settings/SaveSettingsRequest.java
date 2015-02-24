package com.numhero.client.model.datacargo.settings;

import com.numhero.client.model.pojoc.SettingsC;
import com.numhero.shared.datacargo.SaveSingleEntityRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class SaveSettingsRequest  extends SaveSingleEntityRequest {

    public SaveSettingsRequest() {
        setCommand(ApplicationCommandEnum.CommandSaveSettings);
    }

    public SettingsC getSettingsC() {
        return (SettingsC) getEntity();
    }

    public void setSettingsC(SettingsC settingsC) {
        setEntity(settingsC);
    }
}
