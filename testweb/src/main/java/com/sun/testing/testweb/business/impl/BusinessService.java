package com.sun.testing.testweb.business.impl;

import com.sun.testing.testweb.business.IBusinessService;
import com.sun.testing.testweb.common.request.ServiceRequest;
import com.sun.testing.testweb.common.response.ServiceResponse;
import com.sun.testing.testweb.database.IDataService;

public class BusinessService implements IBusinessService {

	private IDataService dataService;
	
	public void setDataService(IDataService dataService) {
		this.dataService = dataService;
	}

	@Override
	public ServiceResponse getService(ServiceRequest serviceRequest) {
		
		ServiceResponse ServiceResponse = dataService.getService(serviceRequest);
		
		return ServiceResponse;
	}

}
