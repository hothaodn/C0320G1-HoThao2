package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import services.StudentService;

import java.util.List;

@Controller
//@RequestMapping("students")
public class StudentController {
//    @Autowired
//    StudentService studentService;

    @GetMapping("/")
    public String getHomePage(){
        System.out.println("Hello");
        return "students/add";
    }
}
