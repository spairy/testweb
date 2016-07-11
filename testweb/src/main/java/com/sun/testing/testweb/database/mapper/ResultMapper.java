package com.sun.testing.testweb.database.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sun.testing.testweb.common.demo.Result;

public class ResultMapper implements RowMapper<Result> {

	@Override
	public Result mapRow(ResultSet rs, int rowNum) throws SQLException {
		Result result = new Result();
		//result.setType(rs.getString("type"));
		//result.setId(rs.getString("id"));
		//result.setRuleID(rs.getString("rule_id"));
		return result;
	}
}