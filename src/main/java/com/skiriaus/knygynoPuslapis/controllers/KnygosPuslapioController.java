package com.skiriaus.knygynoPuslapis.controllers;

import com.skiriaus.knygynoPuslapis.dao.KnygaDao;
import com.skiriaus.knygynoPuslapis.domain.Knyga;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class KnygosPuslapioController {

    private final KnygaDao knygaDao;

    public KnygosPuslapioController(final KnygaDao knygaDao) {
        this.knygaDao = knygaDao;
    }

    @GetMapping("/knyga")
    public String knygosPuslapis(@RequestParam("knyga")Long knygosId, Model model){
        Optional<Knyga> knyga = knygaDao.findOne(knygosId);
        if(knyga.isPresent()){
            model.addAttribute("knyga", knyga.get());
            return "knygos_puslapis";
        }else{
           return "Nepavyko rasti kyngos puslapio";
        }
    }
}
