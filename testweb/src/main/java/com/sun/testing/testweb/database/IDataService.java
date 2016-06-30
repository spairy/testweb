package com.sun.testing.testweb.database;

import com.sun.testing.testweb.common.request.ServiceRequest;
import com.sun.testing.testweb.common.response.ServiceResponse;

public interface IDataService {

	ServiceResponse getService(ServiceRequest serviceRequest);
	
}
