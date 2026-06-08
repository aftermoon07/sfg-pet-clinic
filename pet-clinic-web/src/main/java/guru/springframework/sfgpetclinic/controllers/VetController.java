package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.petclinicdata.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; //
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    // Injects the VetService constructor dependency bean
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    // 💡 TYPOS FIXED HERE: Balanced quotes and accurate mapping routes
    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(Model model) { //

        // Binds the data collection to the active UI model map under key string "vets"
        model.addAttribute("vets", vetService.findAll());

        return "vets/index"; // Points directly to templates/vets/index.html
    }
}