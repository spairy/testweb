package com.sun.testing.testweb.business;

import com.sun.testing.testweb.common.request.ServiceRequest;
import com.sun.testing.testweb.common.response.ServiceResponse;

public interface IBusinessService {

	ServiceResponse getService(final ServiceRequest loginRequest);
	
}
