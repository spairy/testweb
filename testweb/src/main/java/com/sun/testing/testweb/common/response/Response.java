package com.sun.testing.testweb.common.response;

import java.util.List;

import com.sun.testing.testweb.common.demo.Field;
import com.sun.testing.testweb.common.demo.Page;
import com.sun.testing.testweb.common.demo.PageField;

public class Response extends BaseResponse {
	
	private static final long serialVersionUID = 2420907396840866365L;
	
	private List<Page> pageList;

	private List<Field> fieldList;
	
	private List<PageField> pageFieldList;
	
	public List<Page> getPageList() {
		return pageList;
	}

	public void setPageList(List<Page> pageList) {
		this.pageList = pageList;
	}

	public List<Field> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<Field> fieldList) {
		this.fieldList = fieldList;
	}

	public List<PageField> getPageFieldList() {
		return pageFieldList;
	}

	public void setPageFieldList(List<PageField> pageFieldList) {
		this.pageFieldList = pageFieldList;
	}
	
}
