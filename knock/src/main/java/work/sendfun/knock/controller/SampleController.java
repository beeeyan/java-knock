package work.sendfun.knock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping(value = "/")
    public String index(Model model){
        model.addAttribute("message", "Hello Springboot");
        return "index";
    }
}