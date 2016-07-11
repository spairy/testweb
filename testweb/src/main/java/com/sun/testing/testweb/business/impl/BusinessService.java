package com.sun.testing.testweb.business.impl;

import com.sun.testing.testweb.business.IBusinessService;
import com.sun.testing.testweb.common.request.PageRequest;
import com.sun.testing.testweb.common.request.Request;
import com.sun.testing.testweb.common.response.ErrorInfo;
import com.sun.testing.testweb.common.response.PageResponse;
import com.sun.testing.testweb.common.response.Response;
import com.sun.testing.testweb.database.IDataService;

public class BusinessService implements IBusinessService {

	private IDataService dataService;
	
	public void setDataService(IDataService dataService) {
		this.dataService = dataService;
	}

	@Override
	public PageResponse getPages(PageRequest pageRequest) {
		PageResponse pageResponse = null;
		try {
			pageResponse = dataService.getPages(pageRequest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pageResponse;
	}

	@Override
	public PageResponse insertPage(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageResponse updatePage(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getFields(Request request) {
		Response response = null;
		try {
			response = dataService.getFields(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	public Response getResults(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response insertResult(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updateResult(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response getCases(Request request) {
		Response response = null;
		try {
			response = dataService.getCases(request);
		} catch (Exception e) {
			e.printStackTrace();
			response = new Response();
			response.addError(new ErrorInfo("DB operation error - get cases!"));
		}
		return response;
	}

	@Override
	public Response insertCase(Request request) {
		Response response = null;
		try {
			response = dataService.insertCase(request);
		} catch (Exception e) {
			e.printStackTrace();
			response = new Response();
			response.addError(new ErrorInfo("DB operation error - insert case!"));
		}
		return response;
	}

	@Override
	public Response updateCase(Request request) {
		Response response = null;
		try {
			response = dataService.updateCase(request);
		} catch (Exception e) {
			e.printStackTrace();
			response = new Response();
			response.addError(new ErrorInfo("DB operation error - update case!"));
		}
		return response;
	}

}
