package com.sun.testing.testweb.database.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sun.testing.testweb.common.demo.Value;

public class ValueMapper implements RowMapper<Value> {

	@Override
	public Value mapRow(ResultSet rs, int rowNum) throws SQLException {
		Value value = new Value();
		//value.setType(rs.getString("type"));
		//value.setId(rs.getString("id"));
		//value.setRuleID(rs.getString("rule_id"));
		return value;
	}
}