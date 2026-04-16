package com.skiriaus.knygynoPuslapis.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.skiriaus.knygynoPuslapis.domain.Autorius;
import com.skiriaus.knygynoPuslapis.domain.impl.AutoriusImpl;

public class AutoriusRowMapper implements RowMapper<Autorius> {

	@Override
	public Autorius mapRow(ResultSet rs, int rowNum) throws SQLException {
		return AutoriusImpl.builder()
				.id(rs.getLong("id"))
				.vardas(rs.getString("vardas"))
				.build();
	}
	

}
