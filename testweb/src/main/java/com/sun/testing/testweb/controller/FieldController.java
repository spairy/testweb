package com.sun.testing.testweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.testing.testweb.business.IBusinessService;
import com.sun.testing.testweb.common.request.Request;
import com.sun.testing.testweb.common.response.Response;

@RequestMapping(value = "/field")
public class FieldController {

	private IBusinessService businessService;
	
	public void setBusinessService(IBusinessService businessService) {
		this.businessService = businessService;
	}
	
	@RequestMapping(value = "/getFields", method = RequestMethod.GET)
	@ResponseBody
	public Response getFields(HttpServletRequest httpRequest, HttpServletResponse httpResponset) {
		System.out.println("get all field");
		Request request = new Request();
		
		Response response = null;
		response = businessService.getFields(request);
		return response;
	}
	
	@RequestMapping(value = "/insertField", method = RequestMethod.GET)
	@ResponseBody
	public Response insertFields(HttpServletRequest httpRequest, HttpServletResponse httpResponset) {
		System.out.println("get all field");
		Request request = new Request();
		
		Response response = null;
		response = businessService.insertField(request);
		return response;
	}
}
