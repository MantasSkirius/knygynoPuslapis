package com.skiriaus.knygynoPuslapis.dao.impl;

import java.util.List;
import java.util.Optional;

import com.skiriaus.knygynoPuslapis.dao.DaoUtils;
import com.skiriaus.knygynoPuslapis.dao.mapper.AutoriusRowMapper;
import com.skiriaus.knygynoPuslapis.domain.Autorius;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.skiriaus.knygynoPuslapis.dao.KnygaDao;
import com.skiriaus.knygynoPuslapis.dao.mapper.KnygaRowMapper;
import com.skiriaus.knygynoPuslapis.domain.Knyga;

@Repository
public class KnygaDaoImpl implements KnygaDao {
	private final JdbcTemplate jdbcTemplate;
	public KnygaDaoImpl(final JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Optional<Knyga> findOne(Long id)	{
		List<Knyga>results = jdbcTemplate.query(
				"SELECT * FROM knygos WHERE id = ?",
				new KnygaRowMapper(),
				id
				);
		return results.stream().findFirst();
		
	}

	public List<Knyga> findByIds(List<Long>ids){
		if(ids.isEmpty()) {
			return List.of();
		}

		String klaustukai = DaoUtils.kurtiPlaceholderKlaustukus(ids.size());

		List<Knyga> results = jdbcTemplate.query(
				"select * from knygos where id in ("+klaustukai+")"
				, new KnygaRowMapper(), ids.toArray());
		return results;
	}

	public List<Knyga> findAll(){
		List<Knyga> results = jdbcTemplate.query("select * from knygos LIMIT ?", new KnygaRowMapper(), DaoUtils.MAX_REZULTATU_SKAICIUS);
		return results;
	}



}
