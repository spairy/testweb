package com.sun.testing.testweb.database.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sun.testing.testweb.common.demo.Page;

public class PageMapper implements RowMapper<Page> {

	@Override
	public Page mapRow(ResultSet rs, int rowNum) throws SQLException {
		Page page = new Page();
		page.setName(rs.getString("name"));
		page.setPath(rs.getString("path"));
		return page;
	}

}
