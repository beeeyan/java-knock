package work.sendfun.knock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import work.sendfun.knock.entity.Measuredatas;
import work.sendfun.knock.repository.MeasureDatasRepository;

import java.util.List;

    @Controller
    public class SampleController {
        @Autowired
        private MeasureDatasRepository measureDatasRepository;

        @GetMapping(value= "/" )
        public String index(Model model) {
            model.addAttribute("message", "Hello Springboot");
            return "index";
        }

        @GetMapping(value="/list")
        public String list(Model model) {
            model.addAttribute("mesuredatas", this.measureDatasRepository.findAll());
            return "list";
        }

    }
