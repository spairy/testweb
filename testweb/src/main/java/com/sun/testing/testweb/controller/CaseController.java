package com.sun.testing.testweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.testing.testweb.business.IBusinessService;
import com.sun.testing.testweb.common.request.Request;
import com.sun.testing.testweb.common.response.Response;

@RequestMapping(value = "/case")
public class CaseController {

	private IBusinessService businessService;
	
	public void setBusinessService(IBusinessService businessService) {
		this.businessService = businessService;
	}
	
	@RequestMapping(value = "/getCases", method = RequestMethod.GET)
	@ResponseBody
	public Response getCases(final HttpServletRequest httpRequest, 
			final HttpServletResponse httpResponset) {
		System.out.println("get all cases");
		Request request = new Request();
		
		Response response = null;
		response = businessService.getCases(request);
		return response;
	}
	
	@RequestMapping(value = "/insertCase", method = RequestMethod.POST)
	@ResponseBody
	public Response insertCases(final HttpServletRequest httpRequest, 
			final HttpServletResponse httpResponset, 
			@RequestBody Request request) {
		System.out.println("insert case");
		
		Response response = null;
		response = businessService.insertCase(request);
		return response;
	}
	
	@RequestMapping(value = "/updateCase", method = RequestMethod.POST)
	@ResponseBody
	public Response updateCases(final HttpServletRequest httpRequest, 
			final HttpServletResponse httpResponset, 
			@RequestBody Request request) {
		System.out.println("update case");
		
		Response response = null;
		response = businessService.updateCase(request);
		return response;
	}
}
