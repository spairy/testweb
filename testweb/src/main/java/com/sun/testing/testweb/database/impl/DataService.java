package com.sun.testing.testweb.database.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sun.testing.testweb.common.demo.Case;
import com.sun.testing.testweb.common.demo.Field;
import com.sun.testing.testweb.common.demo.Page;
import com.sun.testing.testweb.common.demo.Result;
import com.sun.testing.testweb.common.request.PageRequest;
import com.sun.testing.testweb.common.request.Request;
import com.sun.testing.testweb.common.response.PageResponse;
import com.sun.testing.testweb.common.response.Response;
import com.sun.testing.testweb.database.IDataService;
import com.sun.testing.testweb.database.mapper.CaseMapper;
import com.sun.testing.testweb.database.mapper.FieldMapper;
import com.sun.testing.testweb.database.mapper.PageMapper;
import com.sun.testing.testweb.database.mapper.ResultMapper;

public class DataService implements IDataService {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public PageResponse getPages(PageRequest pageRequest) {
		PageResponse pageResponse = new PageResponse();
		List<Page> pageList = 
				jdbcTemplate.query("select * from page", 
						new Object[]{}, new PageMapper());
		pageResponse.setPageList(pageList);
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
		Response response = new Response();
		List<Field> fieldList = 
				jdbcTemplate.query("select * from field", 
						new Object[]{}, new FieldMapper());
		response.setFieldList(fieldList);
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
		Response response = new Response();
		List<Result> resultList = 
				jdbcTemplate.query("select * from error", 
						new Object[]{}, new ResultMapper());
		response.setResultList(resultList);
		return response;
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
		Response response = new Response();
		List<Result> resultList = 
				jdbcTemplate.query("select * from error", 
						new Object[]{}, new ResultMapper());
		response.setResultList(resultList);
		return response;
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
		Response response = new Response();
		List<Case> caseList = 
				jdbcTemplate.query("select * from `case`", 
						new Object[]{}, new CaseMapper());
		response.setCaseList(caseList);
		return response;
	}

	@Override
	public Response insertCase(Request request) throws Exception {
		Response response = new Response();
		List<Object[]> oList = new ArrayList<Object[]>();
		Object[] o = null;
		o = new Object[] { request.getCaseName(), request.getCaseRemark()};
		oList.add(o);
		
		int[] n = jdbcTemplate.batchUpdate("insert into case (name, remark) VALUES (?, ?)", oList);
		if (null == n || n.length <= 0) {
			throw new Exception();
		}
		response.setResult(1);
		return response;
	}

	@Override
	public Response updateCase(Request request) throws Exception {
		Response response = new Response();
		List<Object[]> oList = new ArrayList<Object[]>();
		Object[] o = null;
		o = new Object[] { request.getCaseName(), request.getCaseRemark(), request.getCaseID()};
		oList.add(o);
		
		int[] n = jdbcTemplate.batchUpdate("update case set name = ?, remark = ? where id = ?", oList);
		if (null == n || n.length <= 0) {
			throw new Exception();
		}
		response.setResult(1);
		return response;
	}

}
