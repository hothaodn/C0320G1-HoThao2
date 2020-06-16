package controllers;

import models.Login;
import models.User;
import models.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/")
    public ModelAndView homepage(){
//        ModelAndView modelAndView = new ModelAndView("homepage", "login", new Login());
        return new ModelAndView("homepage", "login", new Login());
//        return new ModelAndView("homepage");
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = UserDao.checkLogin(login);
        if(user == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }else{
            ModelAndView modelAndView = new ModelAndView("welcome");
            modelAndView.addObject("user",user);
            return modelAndView;
        }
    }
}
