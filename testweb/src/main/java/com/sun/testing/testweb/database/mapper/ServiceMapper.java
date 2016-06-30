package com.sun.testing.testweb.database.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sun.testing.testweb.common.demo.Service;

public class ServiceMapper implements RowMapper<Service> {

	@Override
	public Service mapRow(ResultSet rs, int rowNum) throws SQLException {
		Service service = new Service();
		service.setName(rs.getString("name"));
		service.setPath(rs.getString("path"));
		return service;
	}

}
