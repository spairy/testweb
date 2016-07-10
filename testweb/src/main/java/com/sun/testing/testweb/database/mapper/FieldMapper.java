package com.sun.testing.testweb.database.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sun.testing.testweb.common.demo.Field;

public class FieldMapper implements RowMapper<Field> {

	@Override
	public Field mapRow(ResultSet rs, int rowNum) throws SQLException {
		Field field = new Field();
		field.setType(rs.getString("type"));
		field.setName(rs.getString("name"));
		field.setRuleID(rs.getString("rule_id"));
		return field;
	}

}