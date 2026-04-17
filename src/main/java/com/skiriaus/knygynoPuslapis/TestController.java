package com.skiriaus.knygynoPuslapis;

import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.skiriaus.knygynoPuslapis.domain.Knyga;
import com.skiriaus.knygynoPuslapis.services.KnygosIeskojimoSolrService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skiriaus.knygynoPuslapis.dao.AutoriusDao;
import com.skiriaus.knygynoPuslapis.dao.KnygaDao;

@Controller
public class TestController {
	private final AutoriusDao autoriusDao;
	private final KnygaDao knygaDao;
	private final KnygosIeskojimoSolrService knygosIeskojimoSolrService;

	public TestController(final AutoriusDao autoriusDao, final KnygaDao knygaDao, final KnygosIeskojimoSolrService knygosIeskojimoSolrService) {
		this.autoriusDao = autoriusDao;
		this.knygaDao = knygaDao;
		this.knygosIeskojimoSolrService = knygosIeskojimoSolrService;
	}
	
	@GetMapping("/testAutorius")
	public Object testAutorius() {
		return autoriusDao.findOne(1L);
	}
	@GetMapping("/test-knyga")
	public String testKnyga(Model model) {
//		return knygaDao.findOne(1L);
		Optional<Knyga> knyga = knygaDao.findOne(1L);
		if(knyga.isPresent()){
			model.addAttribute("knyga", knyga.get());
			return "test-knyga";
		}else{
			return "Knyga nerasta";
		}
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
	public String testKnygos(Model model) {
		List<Long> ids = new ArrayList<Long>();
		ids = knygosIeskojimoSolrService.ieskotiKnygos("Silva Rerum");
//		ids.add(3L);
//		ids.add(2L);
//		ids.add(1L);
		List<Knyga> knygos = knygaDao.findByIds(ids);
		model.addAttribute("knygos", knygos);
		return "test-knygos";
	}
	@GetMapping("/testIeskojimas")
	public String ieskotiKnygu(@RequestParam("q")String ieskojimoTerminas, Model model){
		List<Long> ids;
		ids = knygosIeskojimoSolrService.ieskotiKnygos(ieskojimoTerminas);
		List<Knyga> knygos = knygaDao.findByIds(ids);
		model.addAttribute("knygos", knygos);
		return "test-knygos";
	}


}
