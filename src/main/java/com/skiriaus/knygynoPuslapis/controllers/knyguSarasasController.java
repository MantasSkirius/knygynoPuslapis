package com.skiriaus.knygynoPuslapis.controllers;

import com.skiriaus.knygynoPuslapis.dao.KnygaDao;
import com.skiriaus.knygynoPuslapis.domain.Knyga;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class knyguSarasasController {
    public final KnygaDao knygaDao;

    public knyguSarasasController(final KnygaDao knygaDao) {
        this.knygaDao = knygaDao;
    }

    @GetMapping("/")
    public String knyguSarasas(Model model){
        List<Knyga> knygos = knygaDao.findAll();
        model.addAttribute("knygos", knygos);
        return "index.html";
    }
}
