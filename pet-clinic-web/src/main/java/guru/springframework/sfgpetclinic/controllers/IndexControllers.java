package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControllers {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){
        return "index";
    }

    // 💡 FIXED: Added default 'oups' path error page mapping handler
    @RequestMapping("/oups")
    public String oupsHandler() {
        return "notimplemented";
    }
}