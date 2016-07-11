package com.sun.testing.testweb.common.response;

import java.util.List;

import com.sun.testing.testweb.common.demo.Case;
import com.sun.testing.testweb.common.demo.Field;
import com.sun.testing.testweb.common.demo.Page;
import com.sun.testing.testweb.common.demo.PageField;
import com.sun.testing.testweb.common.demo.Value;
import com.sun.testing.testweb.common.demo.Result;

public class Response extends BaseResponse {
	
	private static final long serialVersionUID = 2420907396840866365L;
	
	private int result;
	
	private List<Page> pageList;

	private List<Field> fieldList;
	
	private List<PageField> pageFieldList;
	
	private List<Result> resultList;

	private List<Value> valueList;
	
	private List<Case> caseList;
	
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

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

	public List<Result> getResultList() {
		return resultList;
	}

	public void setResultList(List<Result> resultList) {
		this.resultList = resultList;
	}

	public List<Value> getValueList() {
		return valueList;
	}

	public void setValueList(List<Value> valueList) {
		this.valueList = valueList;
	}

	public List<Case> getCaseList() {
		return caseList;
	}

	public void setCaseList(List<Case> caseList) {
		this.caseList = caseList;
	}
}
