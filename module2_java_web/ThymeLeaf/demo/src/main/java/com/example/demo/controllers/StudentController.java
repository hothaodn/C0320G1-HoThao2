package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("students")
public class StudentController {
//    @Autowired
//    StudentService studentService;

    @GetMapping("/")
    public String getHomePage(){
        System.out.println("Hello");
        return "hello";
    }
}
