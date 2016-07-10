package com.sun.testing.testweb.database.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sun.testing.testweb.common.demo.Field;
import com.sun.testing.testweb.common.demo.Page;
import com.sun.testing.testweb.common.request.PageRequest;
import com.sun.testing.testweb.common.request.Request;
import com.sun.testing.testweb.common.response.PageResponse;
import com.sun.testing.testweb.common.response.Response;
import com.sun.testing.testweb.database.IDataService;
import com.sun.testing.testweb.database.mapper.FieldMapper;
import com.sun.testing.testweb.database.mapper.PageMapper;

public class DataService implements IDataService {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public PageResponse getPageList(PageRequest pageRequest) {
		PageResponse pageResponse = new PageResponse();
		List<Page> pageList = 
				jdbcTemplate.query("select * from page where name = ?", 
						new Object[]{pageRequest.getServiceName()}, new PageMapper());
		pageResponse.setPageList(pageList);
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
