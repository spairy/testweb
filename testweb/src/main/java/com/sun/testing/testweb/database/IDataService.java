package com.sun.testing.testweb.database;

import com.sun.testing.testweb.common.request.PageRequest;
import com.sun.testing.testweb.common.response.PageResponse;

public interface IDataService {

	PageResponse getPageList(PageRequest pageRequest);
	
}
