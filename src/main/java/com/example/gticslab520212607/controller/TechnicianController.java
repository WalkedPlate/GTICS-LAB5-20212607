package com.example.gticslab520212607.controller;

import com.example.gticslab520212607.entity.Technician;
import com.example.gticslab520212607.repository.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Controller
public class TechnicianController {
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

    @GetMapping(value = {"","/","/technician"})
    public String listaTechnician(Model model){
        model.addAttribute("listaTechnician", technicianRepository.findAll());
        return "technician/list";
    }

    @GetMapping("/technician/new")
    public String nuevoTechForm(Model model, @ModelAttribute("technician") Technician technician) {

        return "technician/frm";
    }

    @PostMapping("/technician/save")
    public String guardarTech(@ModelAttribute("technician") @Valid Technician technician, BindingResult bindingResult,
                                  RedirectAttributes attr,
                                Model model) {

        if(bindingResult.hasErrors()){

            return "technician/frm";
        }else {

            if (technician.getId() == 0) {
                attr.addFlashAttribute("msg", "Technician creado exitosamente");

                technicianRepository.save(technician);

                return "redirect:/technician";
            } else {


                technicianRepository.save(technician);
                attr.addFlashAttribute("msg", "Technician actualizado exitosamente");
                return "redirect:/technician";
            }
        }
    }

    @GetMapping("/technician/edit")
    public String editartech(Model model, @RequestParam("id") int id,  @ModelAttribute("technician") Technician technician) {

        Optional<Technician> optional = technicianRepository.findById(id);

        if (optional.isPresent()) {
            technician = optional.get();
            return "technician/frm";
        } else {
            return "redirect:/technician";
        }
    }

}
