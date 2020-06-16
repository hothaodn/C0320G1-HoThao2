package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class ConvertController {
    @GetMapping("/")
    public String display(){
        return "home";
    }

    @GetMapping("/convert")
    public String convert(@RequestParam String usd, Model model){
        String vnd = String.valueOf((Float.parseFloat(usd) * 23000)) ;
        model.addAttribute("vnd",vnd);
        return "home";
    }
}
