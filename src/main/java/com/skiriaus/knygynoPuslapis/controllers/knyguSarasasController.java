package com.skiriaus.knygynoPuslapis.controllers;

import com.skiriaus.knygynoPuslapis.dao.KnygaDao;
import com.skiriaus.knygynoPuslapis.domain.Knyga;
import com.skiriaus.knygynoPuslapis.services.KnygosIeskojimoSolrService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class knyguSarasasController {
    public final KnygaDao knygaDao;
    public final KnygosIeskojimoSolrService knygosIeskojimoSolrService;

    public knyguSarasasController(final KnygaDao knygaDao, final KnygosIeskojimoSolrService knygosIeskojimoSolrService) {
        this.knygaDao = knygaDao;
        this.knygosIeskojimoSolrService = knygosIeskojimoSolrService;
    }

    @GetMapping("/")
    public String knyguSarasas(@RequestParam(value = "q", required = false) String ieskojimoTerminas, Model model){
        List<Knyga> knygos = List.of();
        if (ieskojimoTerminas == null || ieskojimoTerminas.isBlank()){
            knygos = knygaDao.findAll();
        }else{
            List<Long> ids;
            ids = knygosIeskojimoSolrService.ieskotiKnygos(ieskojimoTerminas);
            knygos = knygaDao.findByIds(ids);
        }
        model.addAttribute("knygos", knygos);
        return "index.html";
    }
}
