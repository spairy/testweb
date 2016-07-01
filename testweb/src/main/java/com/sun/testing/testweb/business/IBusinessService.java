package com.sun.testing.testweb.business;

import com.sun.testing.testweb.common.request.PageRequest;
import com.sun.testing.testweb.common.response.PageResponse;

public interface IBusinessService {

	PageResponse getPageList(final PageRequest pageRequest);
	
}
