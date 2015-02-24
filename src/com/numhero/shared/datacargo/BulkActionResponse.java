package com.numhero.shared.datacargo;

import java.util.LinkedList;
import java.util.List;

public class BulkActionResponse implements CommandResponse {

	List<String> successIdList = new LinkedList<String>();

	List<String> failureIdList = new LinkedList<String>();

	String message = "";

	public List<String> getSuccessIdList() {
		return successIdList;
	}

	public void setSuccessIdList(List<String> successIdList) {
		this.successIdList = successIdList;
	}

	public List<String> getFailureIdList() {
		return failureIdList;
	}

	public void setFailureIdList(List<String> failureIdList) {
		this.failureIdList = failureIdList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
