package com.skiriaus.knygynoPuslapis.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.skiriaus.knygynoPuslapis.domain.Knyga;
import com.skiriaus.knygynoPuslapis.domain.impl.KnygaImpl;

public class KnygaRowMapper implements RowMapper<Knyga> {

	@Override
	public Knyga mapRow(ResultSet rs, int rowNum) throws SQLException {
			return KnygaImpl.builder()
				.id(rs.getLong("id"))
				.pavadinimas(rs.getString("pavadinimas"))
				.virselioAdresas(rs.getString("virselio_adresas"))
				.aprasymas(rs.getString("aprasymas"))
				.zanrai(rs.getString("zanrai"))
				.metai(rs.getInt("metai"))
				.leidejas(rs.getString("leidejas"))
				.puslapiuSkaicius(rs.getInt("puslapiu_skaicius"))
				.formatoInformacija(rs.getString("formato_informacija"))
				.kalba(rs.getString("kalba"))
				.build();
	}

	
}
