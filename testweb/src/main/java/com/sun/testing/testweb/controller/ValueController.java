package com.sun.testing.testweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.testing.testweb.business.IBusinessService;
import com.sun.testing.testweb.common.request.PageRequest;
import com.sun.testing.testweb.common.response.PageResponse;

@RequestMapping(value = "/value")
public class ValueController {

	private IBusinessService businessService;
	
	public void setBusinessService(IBusinessService businessService) {
		this.businessService = businessService;
	}

	@RequestMapping(value = "/getPageList", method = RequestMethod.GET)
	@ResponseBody
	public PageResponse getPageList(HttpServletRequest request, HttpServletResponse responset) {
		System.out.println("get page list");
		PageRequest pageRequest = new PageRequest();
		pageRequest.setServiceName(StringUtils.trimWhitespace(request.getParameter("pageName")));
		pageRequest.setServicePath(StringUtils.trimWhitespace(request.getParameter("pagePath")));
		PageResponse pageResponse = null;
		pageResponse = businessService.getPageList(pageRequest);
		return pageResponse;
	}
	
	@RequestMapping(value = "/insertPageList", method = RequestMethod.POST)
	@ResponseBody
	public PageResponse insertPageList(HttpServletRequest request, HttpServletResponse responset) {
		System.out.println("insert page list");
		PageRequest pageRequest = new PageRequest();
		pageRequest.setServiceName(StringUtils.trimWhitespace(request.getParameter("pageName")));
		pageRequest.setServicePath(StringUtils.trimWhitespace(request.getParameter("pagePath")));
		PageResponse pageResponse = null;
		pageResponse = businessService.getPageList(pageRequest);
		return pageResponse;
	}
	
	@RequestMapping(value = "/updatePageList", method = RequestMethod.POST)
	@ResponseBody
	public PageResponse updatePageList(HttpServletRequest request, HttpServletResponse responset) {
		System.out.println("update page list");
		PageRequest pageRequest = new PageRequest();
		pageRequest.setServiceName(StringUtils.trimWhitespace(request.getParameter("pageName")));
		pageRequest.setServicePath(StringUtils.trimWhitespace(request.getParameter("pagePath")));
		PageResponse pageResponse = null;
		pageResponse = businessService.getPageList(pageRequest);
		return pageResponse;
	}
	
	@RequestMapping(value = "/getField", method = RequestMethod.GET)
	@ResponseBody
	public PageResponse getAllField(HttpServletRequest request, HttpServletResponse responset) {
		System.out.println("get all field");
		PageRequest pageRequest = new PageRequest();
		pageRequest.setServiceName(StringUtils.trimWhitespace(request.getParameter("pageName")));
		pageRequest.setServicePath(StringUtils.trimWhitespace(request.getParameter("pagePath")));
		PageResponse pageResponse = null;
		pageResponse = businessService.getPageList(pageRequest);
		return pageResponse;
	}
}
