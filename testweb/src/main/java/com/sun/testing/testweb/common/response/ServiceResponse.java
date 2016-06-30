package com.sun.testing.testweb.common.response;

import java.util.List;

import com.sun.testing.testweb.common.demo.Service;

public class ServiceResponse extends BaseResponse {

	private static final long serialVersionUID = -4604858158014064408L;
	
	private List<Service> serviceList;

	public List<Service> getServiceList() {
		return serviceList;
	}

	public void setServiceList(List<Service> serviceList) {
		this.serviceList = serviceList;
	}
	
}
