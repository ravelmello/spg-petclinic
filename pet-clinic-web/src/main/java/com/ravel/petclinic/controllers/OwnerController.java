package com.ravel.petclinic.controllers;

import com.ravel.petclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/", "/index" ,"/index.html"})
    public String ownerIndex(Model model) {
        model.addAttribute("owners",ownerService.getOwners());
        return "owner/index";
    }
}
