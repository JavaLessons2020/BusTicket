package org.itstep.TrainWebApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bus")
public class BusController {


    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("last_name", "Tommy");
        return "home";
    }
}
