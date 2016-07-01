package com.sun.testing.testweb.business.impl;

import com.sun.testing.testweb.business.IBusinessService;
import com.sun.testing.testweb.common.request.PageRequest;
import com.sun.testing.testweb.common.response.PageResponse;
import com.sun.testing.testweb.database.IDataService;

public class BusinessService implements IBusinessService {

	private IDataService dataService;
	
	public void setDataService(IDataService dataService) {
		this.dataService = dataService;
	}

	@Override
	public PageResponse getPageList(PageRequest pageRequest) {
		
		PageResponse pageResponse = dataService.getPageList(pageRequest);
		
		return pageResponse;
	}

}
