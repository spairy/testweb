package com.sun.testing.testweb.database.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sun.testing.testweb.common.demo.Case;

public class CaseMapper implements RowMapper<Case> {

	@Override
	public Case mapRow(ResultSet rs, int rowNum) throws SQLException {
		Case casee = new Case();
		//case.setType(rs.getString("type"));
		casee.setId(rs.getString("id"));
		//case.setRuleID(rs.getString("rule_id"));
		return casee;
	}

}