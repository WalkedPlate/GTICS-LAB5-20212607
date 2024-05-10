package com.example.gticslab520212607.controller;

import com.example.gticslab520212607.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstadisticasController {

    @Autowired
    DeviceRepository deviceRepository;
    @Autowired
    LocationRepository locationRepository;
    @Autowired
    SiteRepository siteRepository;
    @Autowired
    TechnicianRepository technicianRepository;
    @Autowired
    TicketRepository ticketRepository;

    @GetMapping(value = {"/estadisticas"})
    public String principal(Model model){
        model.addAttribute("lista", siteRepository.obtenerIntervencionesPorSitio());
        return "est/list";
    }


}
