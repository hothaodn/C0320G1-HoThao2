package com.codegym.furama_resort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {
    //****************************** LOG-IN-ADMIN ******************************
    @GetMapping("") //done
    public String showAdminLoginSite1() {
        return "redirect:/admin/login";
    }

    @GetMapping("/login") //done
    public String showAdminLoginSite() {
        return "admin/login_admin";
    }

    @PostMapping("/login") //building
    public String loginAdmin() {
        return "redirect:/admin/home-page";
    }

    @GetMapping("/home-page") //done
    public String showAdminHomePage() {
        return "admin/homepage_admin";
    }
}





