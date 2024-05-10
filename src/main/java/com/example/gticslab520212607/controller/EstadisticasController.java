package com.example.gticslab520212607.controller;

import com.example.gticslab520212607.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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


}
