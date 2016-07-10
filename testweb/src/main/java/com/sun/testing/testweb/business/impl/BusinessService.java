package com.sun.testing.testweb.business.impl;

import com.sun.testing.testweb.business.IBusinessService;
import com.sun.testing.testweb.common.request.PageRequest;
import com.sun.testing.testweb.common.request.Request;
import com.sun.testing.testweb.common.response.PageResponse;
import com.sun.testing.testweb.common.response.Response;
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

	@Override
	public PageResponse insertPageList(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageResponse updatePageList(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getFields(Request request) {
		Response response = dataService.getFields(request);
		return response;
	}

	@Override
	public Response insertField(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updateField(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getPageFields(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response insertPageField(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updatePageField(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getValues(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response insertValue(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updateValue(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getErrors(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response insertError(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updateError(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getCases(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response insertCase(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updateCase(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

}
