package com.skiriaus.knygynoPuslapis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skiriaus.knygynoPuslapis.dao.AutoriusDao;
import com.skiriaus.knygynoPuslapis.dao.KnygaDao;

@RestController
public class TestController {
	private final AutoriusDao autoriusDao;
	private final KnygaDao knygaDao;

	public TestController(final AutoriusDao autoriusDao, final KnygaDao knygaDao) {
		this.autoriusDao = autoriusDao;
		this.knygaDao = knygaDao;
	}
	
	@GetMapping("/testAutorius")
	public Object testAutorius() {
		return autoriusDao.findOne(1L);
	}
	@GetMapping("/testKnyga")
	public Object testKnyga() {
		return knygaDao.findOne(1L);
	}
	@GetMapping("/testAutoriai")
	public Object testAutoriai() {
		List<Long> ids = new ArrayList<Long>();
		ids.add(3L);
		ids.add(2L);
		ids.add(1L);
		return autoriusDao.findByIds(ids);
	}
	@GetMapping("/testKnygos")
	public Object testKnygos() {
		List<Long> ids = new ArrayList<Long>();
		ids.add(3L);
		ids.add(2L);
		ids.add(1L);
		return knygaDao.findByIds(ids);
	}

}
