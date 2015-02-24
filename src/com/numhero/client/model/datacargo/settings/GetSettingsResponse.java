package com.numhero.client.model.datacargo.settings;

import com.numhero.client.model.pojoc.SettingsC;
import com.numhero.shared.datacargo.GetSingleEntityResponse;

public class GetSettingsResponse extends GetSingleEntityResponse {

    public SettingsC getSettingsC() {
        return (SettingsC) getEntity();
    }

    public void setSettingsC(SettingsC settingsC) {
        setEntity(settingsC);
    }
}