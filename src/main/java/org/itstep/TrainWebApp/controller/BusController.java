package org.itstep.TrainWebApp.controller;


import org.itstep.TrainWebApp.model.Route;
import org.itstep.TrainWebApp.service.RouteServiceBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/bus")
public class BusController {

    private RouteServiceBaseImpl routeService;

    @Autowired
    public void setRouteService(RouteServiceBaseImpl routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @PostMapping("/home")
    public String homePost(@RequestParam(name = "start") String start,
                           @RequestParam(name = "end") String end, Model model){

        List<Route>routes = routeService.findRoutes(start, end);
        model.addAttribute("rotes",routes);

        for (Route route : routes) {
            System.out.println("Route = " + route);
        }

        return "redirect:/";
    }

}
