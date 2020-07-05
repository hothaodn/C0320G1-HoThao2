package com.codegym.furama_resort.controller;

import com.codegym.furama_resort.model.hotelService.Service;
import com.codegym.furama_resort.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminServiceController {
    @Autowired
    private GenericService<Service,Integer> serviceService;

    //****************************** SERVICE-ACTION ******************************
    @GetMapping("/action-service/add-new") //done
    public ModelAndView showAddServiceForm(){
        return new ModelAndView("admin/service/service-add-new-test", "service",new Service());
    }

    @PostMapping("/action-service/add-new") //done
    public String saveService(@Valid @ModelAttribute("service") Service service, BindingResult bindingResult, RedirectAttributes redirect){
        if(bindingResult.hasErrors()){
            return "admin/service/service-add-new-test";
        }else{
            serviceService.save(service);
            redirect.addFlashAttribute("notify","Saved successfully");
            return "redirect:/admin/action-service/add-new";
        }
    }

    @GetMapping("/action-service/view/page/{pageNumber}") //done
    public String viewAllServices(HttpServletRequest request, @PathVariable int pageNumber, Model model){
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("listServices");
        int pagesize = 5;
        List<Service> list =(List<Service>) serviceService.findAll();

        if (pages == null) {
            pages = new PagedListHolder<>(list);
            pages.setPageSize(pagesize);
        } else {
            final int goToPage = pageNumber - 1;
            if (goToPage <= pages.getPageCount() && goToPage >= 0) {
                pages.setPage(goToPage);
            }
        }
        request.getSession().setAttribute("listServices", pages);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - list.size());
        int end = Math.min(begin + 5, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        String baseUrl = "/admin/action-service/view/page/";

        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("listServices", pages);

        return "admin/service/service-view-all";
    }

    @GetMapping("/action-service/delete/{id}") //done
    public String deleteService(@PathVariable Integer id,Model model){
        serviceService.delete(serviceService.findOne(id));
        return "admin/service/service-view-all";
    }
}
