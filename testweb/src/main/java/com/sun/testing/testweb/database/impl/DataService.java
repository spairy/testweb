package com.sun.testing.testweb.database.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sun.testing.testweb.common.demo.Service;
import com.sun.testing.testweb.common.request.ServiceRequest;
import com.sun.testing.testweb.common.response.ServiceResponse;
import com.sun.testing.testweb.database.IDataService;
import com.sun.testing.testweb.database.mapper.ServiceMapper;

public class DataService implements IDataService {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public ServiceResponse getService(ServiceRequest serviceRequest) {
		ServiceResponse serviceResponse = new ServiceResponse();
		List<Service> userInfoList = 
				jdbcTemplate.query("select * from service where name = ?", 
						new Object[]{serviceRequest.getServiceName()}, new ServiceMapper());
		serviceResponse.setServiceList(userInfoList);
		return serviceResponse;
	}

}
