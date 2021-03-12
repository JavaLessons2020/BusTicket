package org.itstep.TrainWebApp.controller;


import org.itstep.TrainWebApp.model.Customer;
import org.itstep.TrainWebApp.repositiry.CustomerRepo;
import org.itstep.TrainWebApp.service.CustomerServiceBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SecurityController {
    CustomerServiceBaseImpl customerRepo;

    @Autowired
    public void setCustomerRepo(CustomerServiceBaseImpl customerRepo) {
        this.customerRepo = customerRepo;
    }

    @GetMapping("/registration")
    public String reg() {
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@AuthenticationPrincipal Customer currentUser, @ModelAttribute Customer customer) {
        System.out.println("current user = " + currentUser);
        customerRepo.saveUser(customer);
        return "redirect:/login";
    }

}
