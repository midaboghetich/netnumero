package com.numhero.server.command;

import com.numhero.shared.datacargo.CommandRequest;
import com.numhero.shared.datacargo.CommandResponse;
import com.numhero.shared.exception.ClientWarningException;

public interface ICommandProcessor {

	public <REQUEST extends CommandRequest, RESPONSE extends CommandResponse> CommandResponse process(REQUEST request) throws ClientWarningException;
}
