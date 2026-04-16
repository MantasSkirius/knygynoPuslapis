package com.skiriaus.knygynoPuslapis.dao;

import java.util.List;
import java.util.Optional;

import com.skiriaus.knygynoPuslapis.domain.Knyga;

public interface KnygaDao {
	public Optional<Knyga> findOne(Long id);
    public List<Knyga> findByIds(List<Long>ids);
}
