package com.sun.testing.testweb.database.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sun.testing.testweb.common.demo.PageField;

public class PageFieldMapper implements RowMapper<PageField> {

	@Override
	public PageField mapRow(ResultSet rs, int rowNum) throws SQLException {
		PageField pageField = new PageField();
		//pageField.setType(rs.getString("type"));
		//pageField.setId(rs.getString("id"));
		//pageField.setRuleID(rs.getString("rule_id"));
		return pageField;
	}
}