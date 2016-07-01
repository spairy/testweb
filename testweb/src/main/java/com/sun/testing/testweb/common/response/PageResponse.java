package com.sun.testing.testweb.common.response;

import java.util.List;

import com.sun.testing.testweb.common.demo.Page;

public class PageResponse extends BaseResponse {

	private static final long serialVersionUID = -4604858158014064408L;
	
	private List<Page> pageList;

	public List<Page> getPageList() {
		return pageList;
	}

	public void setPageList(List<Page> pageList) {
		this.pageList = pageList;
	}
	
}
