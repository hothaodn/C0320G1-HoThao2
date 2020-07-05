package com.meomeo.blog_application_mini_project.controller;

import com.meomeo.blog_application_mini_project.model.BlogPost;
import com.meomeo.blog_application_mini_project.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class MemberController {
    @Autowired
    private BlogPostService blogPostService;
//MEMBER EDIT AREA
    //	PAGE BREAKING
    @GetMapping("/user/posts/page/{pageNumber}")
    public String showManagerPage(HttpServletRequest request, @PathVariable int pageNumber, Model model) {
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("listPosts");
        int pagesize = 5;
        List<BlogPost> list =(List<BlogPost>) blogPostService.findAll();
        System.out.println(list.size());
        if (pages == null) {
            pages = new PagedListHolder<>(list);
            pages.setPageSize(pagesize);
        } else {
            final int goToPage = pageNumber - 1;
            if (goToPage <= pages.getPageCount() && goToPage >= 0) {
                pages.setPage(goToPage);
            }
        }
        request.getSession().setAttribute("listPosts", pages);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - list.size());
        int end = Math.min(begin + 5, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        String baseUrl = "/user/posts/page/";

        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("listPosts", pages);

        return "posts/mainpage-user";
    }

    @GetMapping("/user/posts/edit/{id}")
    public ModelAndView showEditPage(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("posts/form-write-blog");
        modelAndView.addObject("post", blogPostService.findOne(id));
        return modelAndView;
    }

    @PostMapping("/user/posts/save")
    public String savePost(BlogPost post,RedirectAttributes redirect) {
//        if (result.hasErrors()) {
//            model.addAttribute("success","Saved failed!");
//            return "form-write-blog";
//        }
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = myDateObj.format(myFormatObj);
        post.setDateWriting(formattedDate);
        post.setUserName("meo");

        blogPostService.save(post);
        redirect.addFlashAttribute("success","Saved successfully!");
        return "redirect:/user/posts/page/1";
    }

    @GetMapping("/user/posts/create")
    public ModelAndView showCreatePage() {
        ModelAndView modelAndView = new ModelAndView("posts/form-write-blog");
        modelAndView.addObject("post", new BlogPost());
        return modelAndView;
    }

    @GetMapping("/user/posts/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id, RedirectAttributes redirect) {
        BlogPost post = blogPostService.findOne(id);
        ModelAndView modelAndView = new ModelAndView("posts/delete-confirm");
            modelAndView.addObject("post", post);
            return modelAndView;
    }

    @PostMapping("/user/posts/delete/{id}")
    public String delete(@PathVariable Integer id, RedirectAttributes redirect) {
        BlogPost post = blogPostService.findOne(id);
        blogPostService.delete(post);
        redirect.addFlashAttribute("success", "Deleted successfully!");
        return "redirect:/user/posts/page/1";
    }
}
