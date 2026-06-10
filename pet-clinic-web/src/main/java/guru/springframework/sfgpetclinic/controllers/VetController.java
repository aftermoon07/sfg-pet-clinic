package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.petclinicdata.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    // 💡 FIXED: Appended support for vets.html and /vets.html mapping options
    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html", "vets.html"})
    public String listVets(Model model) {
        System.out.println("Vets found in database service map: " + vetService.findAll().size());
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}