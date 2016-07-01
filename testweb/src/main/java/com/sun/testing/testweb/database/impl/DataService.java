package com.sun.testing.testweb.database.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sun.testing.testweb.common.demo.Page;
import com.sun.testing.testweb.common.request.PageRequest;
import com.sun.testing.testweb.common.response.PageResponse;
import com.sun.testing.testweb.database.IDataService;
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

}
