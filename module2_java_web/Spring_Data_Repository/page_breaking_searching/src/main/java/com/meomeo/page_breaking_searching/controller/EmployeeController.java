package com.meomeo.page_breaking_searching.controller;

import com.meomeo.page_breaking_searching.model.Employee;
import com.meomeo.page_breaking_searching.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/employee";
	}
	
	@GetMapping("/employee")
	public String index(Model model, HttpServletRequest request
			, RedirectAttributes redirect) {
		request.getSession().setAttribute("employeelist", null);
		
		if(model.asMap().get("success") != null)
			redirect.addFlashAttribute("success",model.asMap().get("success").toString());
		return "redirect:/employee/page/1";
	}

//	PAGE BREAKING
	@GetMapping("/employee/page/{pageNumber}")
	public String showEmployeePage(HttpServletRequest request, @PathVariable int pageNumber, Model model) {
		PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("employeelist");
		int pagesize = 3;
		List<Employee> list =(List<Employee>) employeeService.findAll();
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
		request.getSession().setAttribute("employeelist", pages);
		int current = pages.getPage() + 1;
		int begin = Math.max(1, current - list.size());
		int end = Math.min(begin + 5, pages.getPageCount());
		int totalPageCount = pages.getPageCount();
		String baseUrl = "/employee/page/";

		model.addAttribute("beginIndex", begin);
		model.addAttribute("endIndex", end);
		model.addAttribute("currentIndex", current);
		model.addAttribute("totalPageCount", totalPageCount);
		model.addAttribute("baseUrl", baseUrl);
		model.addAttribute("employees", pages);

		return "list";
	}

	//creat new customer
	@GetMapping("/employee/create")
	public String create(Model model) {
		model.addAttribute("employee", new Employee());
		return "form";
	}

	//edit customer
	@GetMapping("/employee/{id}/edit")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("employee", employeeService.findOne(id));
		return "form";
	}

	//save customer - Used for feature Creating and Editing
	@PostMapping("/employee/save")
	public String save(Employee employee, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) { //nên dùng try catch??? this method from interface Errors
			return "form";
		}
		employeeService.save(employee);
		redirect.addFlashAttribute("success", "Saved employee successfully!");
		return "redirect:/employee";
	}

	//delete customer
	@GetMapping("/employee/{id}/delete")
	public ModelAndView showDeleteForm(@PathVariable Long id) {
		Employee employee = employeeService.findOne(id);
		if(employee != null) {
			ModelAndView modelAndView = new ModelAndView("confirm-delete");
			modelAndView.addObject("employee", employee);
			return modelAndView;
		}else {
			ModelAndView modelAndView = new ModelAndView("/");
			return modelAndView;
		}
	}

	@PostMapping("/employee/{id}/delete")
	public String delete(@PathVariable Long id, RedirectAttributes redirect) {
		Employee emp = employeeService.findOne(id);
		employeeService.delete(emp);
		redirect.addFlashAttribute("success", "Deleted employee successfully!");
		return "redirect:/employee";
	}

	@GetMapping("/employee/search/{pageNumber}")
	public String search(@RequestParam("word_search") String word_search, Model model, HttpServletRequest request,
                         @PathVariable int pageNumber) {
		if (word_search.equals("")) {
			return "redirect:/employee";	
		}	
		List<Employee> list = employeeService.search(word_search);
		if (list == null) {	
			return "redirect:/employee";	
		}	
		PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("employeelist");
		int pagesize = 3;	
		pages = new PagedListHolder<>(list);
		pages.setPageSize(pagesize);	
			
		final int goToPage = pageNumber - 1;	
		if (goToPage <= pages.getPageCount() && goToPage >= 0) {	
			pages.setPage(goToPage);	
		}	
		request.getSession().setAttribute("employeelist", pages);	
		int current = pages.getPage() + 1;	
		int begin = Math.max(1, current - list.size());
		int end = Math.min(begin + 5, pages.getPageCount());
		int totalPageCount = pages.getPageCount();	
		String baseUrl = "/employee/page/";
		model.addAttribute("beginIndex", begin);	
		model.addAttribute("endIndex", end);	
		model.addAttribute("currentIndex", current);	
		model.addAttribute("totalPageCount", totalPageCount);	
		model.addAttribute("baseUrl", baseUrl);	
		model.addAttribute("employees", pages);	
		return "list";	
	}
}
