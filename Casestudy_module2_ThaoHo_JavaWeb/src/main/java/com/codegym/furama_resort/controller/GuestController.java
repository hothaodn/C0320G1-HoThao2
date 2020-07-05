package com.codegym.furama_resort.controller;

import com.codegym.furama_resort.model.customer.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuestController {
    @GetMapping("") //done
    public String showMainWebsite(){
        return "guest/official-website";
    }

    @GetMapping("/login") //done
    public String showFormLogin(){
        return "guest/official-website";
    }
}
