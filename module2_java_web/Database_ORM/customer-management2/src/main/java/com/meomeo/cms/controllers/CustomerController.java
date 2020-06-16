package com.meomeo.cms.controllers;

import com.meomeo.cms.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @GetMapping("/create-customer")
    public ModelAndView showCreateHome(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer",new Customer());
        return  modelAndView;
    }
}
