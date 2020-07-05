package com.meomeo.blog_application_mini_project.controller;

import com.meomeo.blog_application_mini_project.model.BlogPost;
import com.meomeo.blog_application_mini_project.model.User;
import com.meomeo.blog_application_mini_project.service.BlogPostService;
import com.meomeo.blog_application_mini_project.service.UserService;
import com.meomeo.blog_application_mini_project.validator.PasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
public class GuestController {
    @Autowired
    private UserService userService;
    @Autowired
    private BlogPostService blogPostService;

//    GUEST AREA
    @GetMapping("/")
    public ModelAndView showHomePage() {
        ModelAndView modelAndView = new ModelAndView("display_public/homepage");
        List<BlogPost> listPosts = (List<BlogPost>) blogPostService.findAll();
        modelAndView.addObject("listPosts", listPosts);
        return modelAndView;
    }

    @GetMapping("/posts/{id}")
    public ModelAndView readOnePost(@PathVariable("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView("display_public/read-one-post");
        BlogPost onePost = blogPostService.findOne(id);
        modelAndView.addObject("onePost", onePost);
        return modelAndView;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "display_public/login";
    }

    @PostMapping("/login") //buiding this feature, mapping user registered in DB
    public String login(Model model, HttpServletRequest request, RedirectAttributes redirect) {
        request.getSession().setAttribute("listPosts", null);

        if(model.asMap().get("success") != null)
            redirect.addFlashAttribute("success",model.asMap().get("success").toString());
        return "redirect:/user/posts/page/1";
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user",new User());
        return "display_public/register";
    }

    @PostMapping("/register") //buiding this feature, mapping user registered in DB
    public String login(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, RedirectAttributes redirect, Model model) {
        new PasswordValidator().validate(user,bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("message", "Password error");
            return "display_public/register";
        }
        userService.save(user);
        redirect.addFlashAttribute("success", "Welcome " + user.getFirstName() + " to blog");
        return ("redirect:/user/posts/page/1");
    }
}
