package com.codegym.furama_resort.controller;

import com.codegym.furama_resort.model.customer.Customer;
import com.codegym.furama_resort.service.CustomerService;
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
public class AdminCustomerController {
    @Autowired
    private CustomerService customerService;

    //****************************** CUSTOMER-ACTION ******************************
    @GetMapping("/action-customer/add-new") //done
    public ModelAndView showAddCustomerForm(Model model){
        model.addAttribute("nameAction","Add New Customer");
        return new ModelAndView("admin/customer/customer-add-new","customer",new Customer());
    }
    @GetMapping("/action-customer/edit/{id}") //building
    public ModelAndView showFormEditCustomer(@PathVariable Long id, Model model){
        model.addAttribute("nameAction","Edit Customer");
        return new ModelAndView("admin/customer/customer-add-new", "customer",customerService.findOne(id));
    }

    @PostMapping("/action-customer/save") //done
    public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, RedirectAttributes redirect){
        if(bindingResult.hasErrors()){
            return "admin/customer/customer-add-new";
        }else{
            customerService.save(customer);
            redirect.addFlashAttribute("notify","Saved successfully");
            return "redirect:/admin/action-customer/add-new";
        }
    }

    @GetMapping("/action-customer/view/page/{pageNumber}") //done
    public String viewAllCustomers(HttpServletRequest request, @PathVariable int pageNumber, Model model){
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("listCustomers");
        int pagesize = 3;
        List<Customer> list =(List<Customer>) customerService.findAll();

        if (pages == null) {
            pages = new PagedListHolder<>(list);
            pages.setPageSize(pagesize);
        } else {
            final int goToPage = pageNumber - 1;
            if (goToPage <= pages.getPageCount() && goToPage >= 0) {
                pages.setPage(goToPage);
            }
        }
        request.getSession().setAttribute("listCustomers", pages);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - list.size());
        int end = Math.min(begin + 5, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        String baseUrl = "/admin/action-customer/view/page/";

        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("listCustomers", pages);

        return "admin/customer/customer-view-all";
    }

    @GetMapping("/action-customer/delete/{id}") //done
    public ModelAndView showFormDeleteCustomerConfirmation(@PathVariable Long id,Model model){
        model.addAttribute("notifyDelete","Are you sure to delete this customer?");
        return new ModelAndView("admin/customer/customer-view-one", "customer",customerService.findOne(id));
    }

    @PostMapping("/action-customer/delete/{id}") //done
    public String deleteCustomer(@PathVariable Long id,RedirectAttributes redirect){
        customerService.delete(customerService.findOne(id));
        redirect.addFlashAttribute("notify","Deleted customer " +customerService.findOne(id).getNameCustomer()+" successfully!");
        return "redirect:/admin/action-customer/view/page/1";
    }

    @GetMapping("/action-customer/view/{id}") //done
    public ModelAndView showFormOneCustomer(@PathVariable Long id,Model model){
        return new ModelAndView("admin/customer/customer-view-one", "customer",customerService.findOne(id));
    }

    @GetMapping("/action-customer/search/{pageNumber}") //done
    public String search(HttpServletRequest request,
//                         @RequestParam(value = "code-customer", required = false, defaultValue = "") String codeCustomer,
                         @RequestParam(value = "name-customer", required = false, defaultValue = "") String nameCustomer,
//                         @RequestParam(value = "birthday-customer", required = false, defaultValue = "") String birthday,
                         @RequestParam(value = "id-card-customer", required = false, defaultValue = "") String idCardNumber,
                         @RequestParam(value = "phone-number-customer", required = false, defaultValue = "") String phoneNumber,
                         @RequestParam(value = "email-customer", required = false, defaultValue = "") String email,
//                         @RequestParam(value = "type-customer", required = false, defaultValue = "") String customerType,
                         @PathVariable int pageNumber,Model model){
//        List<Customer> list2 = customerService.findAllByNameCustomerContaining(nameCustomer);
//        List<Customer> list2 = customerService.search(codeCustomer,nameCustomer,birthday,idCardNumber,phoneNumber,email,customerType);
        if (nameCustomer.equals("") && phoneNumber.equals("") && email.equals("")) {
            return "admin/customer/customer-search";
        }

        List<Customer> listCustomers2 = customerService.findByNamePhoneEmail(nameCustomer,phoneNumber,email);

//        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("listCustomers2");
//        int pagesize = 3;
//        pages = new PagedListHolder<>(list2);
//        pages.setPageSize(pagesize);
//
//        final int goToPage = pageNumber - 1;
//        if (goToPage <= pages.getPageCount() && goToPage >= 0) {
//            pages.setPage(goToPage);
//        }
//        request.getSession().setAttribute("listCustomers2", pages);
//        int current = pages.getPage() + 1;
//        int begin = Math.max(1, current - list2.size());
//        int end = Math.min(begin + 5, pages.getPageCount());
//        int totalPageCount = pages.getPageCount();
//        String baseUrl = "/admin/action-customer/search/";
//        model.addAttribute("beginIndex", begin);
//        model.addAttribute("endIndex", end);
//        model.addAttribute("currentIndex", current);
//        model.addAttribute("totalPageCount", totalPageCount);
//        model.addAttribute("baseUrl", baseUrl);
//        model.addAttribute("listCustomers2", pages);
        model.addAttribute("listCustomers2",listCustomers2);
        return "admin/customer/customer-search";
    }
}
