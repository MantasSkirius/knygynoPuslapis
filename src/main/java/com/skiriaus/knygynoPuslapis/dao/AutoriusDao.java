package com.skiriaus.knygynoPuslapis.dao;

import java.util.List;
import java.util.Optional;

import com.skiriaus.knygynoPuslapis.domain.Autorius;

public interface AutoriusDao {
	public Optional<Autorius> findOne(long autorius_id);
	public List<Autorius> findByIds(List<Long>ids);
}
