package com.sun.testing.testweb.common.request;

import java.io.Serializable;

public class PageRequest implements Serializable {

	private static final long serialVersionUID = 8061338472070163771L;

	private String serviceName;
	
	private String servicePath;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServicePath() {
		return servicePath;
	}

	public void setServicePath(String servicePath) {
		this.servicePath = servicePath;
	}
}
