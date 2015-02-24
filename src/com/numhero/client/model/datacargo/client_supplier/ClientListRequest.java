package com.numhero.client.model.datacargo.client_supplier;

import com.numhero.shared.datacargo.SearcheableListCommandRequest;
import com.numhero.shared.service.ApplicationCommandEnum;

public class ClientListRequest extends SearcheableListCommandRequest {

	public ClientListRequest() {
		setCommand(ApplicationCommandEnum.CommandGetClients);
	}
}
