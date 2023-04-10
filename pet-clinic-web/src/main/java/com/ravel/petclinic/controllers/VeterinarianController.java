package com.ravel.petclinic.controllers;


import com.ravel.petclinic.service.VeterinarianService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VeterinarianController {

    public VeterinarianController(VeterinarianService veterinarianService) {
        this.veterinarianService = veterinarianService;
    }

    private final VeterinarianService veterinarianService;


    @RequestMapping({"/vets", "/vets/index" ,"/vets/index.html"})

    public String vetIndex(Model model) {
        model.addAttribute("vets", veterinarianService.getAllVets());

        return "vets/index";
    }
}
