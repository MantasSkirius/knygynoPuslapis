package com.skiriaus.knygynoPuslapis.dao.impl;

import java.util.List;
import java.util.Optional;

import com.skiriaus.knygynoPuslapis.dao.DaoUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.skiriaus.knygynoPuslapis.dao.AutoriusDao;
import com.skiriaus.knygynoPuslapis.dao.mapper.AutoriusRowMapper;
import com.skiriaus.knygynoPuslapis.domain.Autorius;
import com.skiriaus.knygynoPuslapis.domain.Knyga;

@Repository
public class AutoriusDaoImpl implements AutoriusDao {
	private final JdbcTemplate jdbcTemplate;

	public AutoriusDaoImpl(final JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Optional<Autorius> findOne(long autorius_id){

	    List<Autorius> results = jdbcTemplate.query(
	            "SELECT id, vardas FROM autoriai WHERE id = ?",
	            new AutoriusRowMapper(),
	            autorius_id
	    );

	    return results.stream().findFirst();
		
	}
	
	public List<Autorius> findByIds(List<Long>ids){
		if(ids.isEmpty()) {
			return List.of();
		}
		String klaustukai = DaoUtils.kurtiPlaceholderKlaustukus(ids.size());
		List<Autorius> results = jdbcTemplate.query(
				"select * from autoriai where id in ("+klaustukai+")"
				, new AutoriusRowMapper(), ids.toArray());
		return results;
	}
	

	

}
