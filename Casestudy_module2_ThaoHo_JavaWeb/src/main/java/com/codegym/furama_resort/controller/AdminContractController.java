package com.codegym.furama_resort.controller;

import com.codegym.furama_resort.model.contract.AccompaniedService;
import com.codegym.furama_resort.model.contract.Contract;
import com.codegym.furama_resort.model.contract.DetailContract;
import com.codegym.furama_resort.model.customer.Customer;
import com.codegym.furama_resort.model.employee.Employee;
import com.codegym.furama_resort.model.hotelService.Service;
import com.codegym.furama_resort.repository.customer.CustomerRepository;
import com.codegym.furama_resort.service.ContractService;
import com.codegym.furama_resort.service.CustomerService;
import com.codegym.furama_resort.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminContractController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private GenericService<Service,Integer> serviceService;

    @Autowired
    private ContractService contractService;

    @Autowired
    private GenericService<Employee,Long> employeeService;

    //****************************** CONTRACT-ACTION ******************************
    @GetMapping("/action-contract/add-new-contract") //building
    public ModelAndView showAddContractForm(Model model){
        Iterable<Service> listServices = serviceService.findAll();
        Iterable<Customer> listCustomers = customerService.findAll();
        Iterable<Employee> listEmployees = employeeService.findAll();

        model.addAttribute("listServices",listServices);
        model.addAttribute("listCustomers",listCustomers);
        model.addAttribute("listEmployees",listEmployees);
        return new ModelAndView("admin/contract/contract-add-new", "contract",new Contract());
    }

    @PostMapping("/action-contract/add-new-contract") //building
    public String saveContract(@ModelAttribute("contract") Contract contract, RedirectAttributes redirect,
                               HttpServletRequest request, HttpServletResponse response){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = myDateObj.format(myFormatObj);

        contract.setCreatedContractDate(formattedDate);
        contractService.save(contract);

//        Iterable<Contract> listContracts = contractService.findAllByIdCustomer(contract.getCustomer().getIdCustomer());
//        for(Contract contract1 : listContracts){
//            String cookieValue = contract.getIdContract() + "_" +
//        }

        redirect.addFlashAttribute("notify","Saved successfully");
        return "redirect:/admin/action-contract/add-new-contract";
    }

    @GetMapping("/admin/action-contract/add-new-contract-detail") //building
    public ModelAndView showFormAddContractDetail(Model model){
        Iterable<Contract> listContracts = contractService.findAll();
//        Iterable<AccompaniedService> accompaniedServices =

        model.addAttribute("accompaniedService",new AccompaniedService());
        model.addAttribute("detailContract",new DetailContract());
        return new ModelAndView("admin/contract/contract-add-new-detail", "listContracts",listContracts);
    }

    @GetMapping("action-contract/view/page/{pageNumber}") //done
    public String viewAllContracts(HttpServletRequest request, @PathVariable int pageNumber, Model model){
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("listContracts");
        int pagesize = 5;
        List<Contract> list =(List<Contract>) contractService.findAll();

        if (pages == null) {
            pages = new PagedListHolder<>(list);
            pages.setPageSize(pagesize);
        } else {
            final int goToPage = pageNumber - 1;
            if (goToPage <= pages.getPageCount() && goToPage >= 0) {
                pages.setPage(goToPage);
            }
        }
        request.getSession().setAttribute("listContracts", pages);
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
        model.addAttribute("listContracts", pages);

        return "admin/contract/contract-view-all";
    }

    @GetMapping("/action-contract/use-service-today") //done
    public ModelAndView viewUsingServiceToday(){
        Iterable<Contract> listContracts = contractService.findAll();

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = myDateObj.format(myFormatObj);

        return new ModelAndView("admin/contract/contract-using-today", "listContracts",listContracts);
    }

    @GetMapping("/action-contract/delete/{id}") //done
    public ModelAndView showFormDeleteCustomerConfirmation(@PathVariable Long id,Model model){
        model.addAttribute("notifyDelete","Are you sure to delete this contract?");
        return new ModelAndView("admin/contract/contract-view-one", "contract",contractService.findOne(id));
    }

    @PostMapping("/action-contract/delete/{id}") //done
    public String deleteCustomer(@PathVariable Long id,RedirectAttributes redirect){
        contractService.delete(contractService.findOne(id));
        redirect.addFlashAttribute("notify","Deleted contract ID " + contractService.findOne(id).getIdContract() +" successfully!");
        return "redirect:/admin/action-contract/view-all";
    }
}
