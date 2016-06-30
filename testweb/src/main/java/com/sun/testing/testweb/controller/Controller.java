package com.sun.testing.testweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.testing.testweb.business.IBusinessService;
import com.sun.testing.testweb.common.request.ServiceRequest;
import com.sun.testing.testweb.common.response.ServiceResponse;

@RequestMapping(value = "/service")
public class Controller {

	private IBusinessService businessService;
	
	public void setBusinessService(IBusinessService businessService) {
		this.businessService = businessService;
	}

	@RequestMapping(value = "/getService", method = RequestMethod.GET)
	@ResponseBody
	public ServiceResponse getService(HttpServletRequest request, HttpServletResponse responset) {
		System.out.print("service get");
		ServiceRequest serviceRequest = new ServiceRequest();
		serviceRequest.setServiceName(StringUtils.trimWhitespace(request.getParameter("serviceName")));
		serviceRequest.setServicePath(StringUtils.trimWhitespace(request.getParameter("servicePath")));
		ServiceResponse serviceResponse = null;
		serviceResponse = businessService.getService(serviceRequest);
		return serviceResponse;
	}
}
