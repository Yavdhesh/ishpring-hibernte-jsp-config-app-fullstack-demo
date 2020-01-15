package com.yavdhesh.customerDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yavdhesh.customerDemo.DAO.CustomerDAO;
import com.yavdhesh.customerDemo.entity.Customer;
import com.yavdhesh.customerDemo.service.CustomerService;
import com.yavdhesh.customerDemo.service.LicenseService;
import com.yavdhesh.customerDemo.service.SalesService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private SalesService salesService;
	
	@Autowired
	private LicenseService licenseService;
	
	
	//@RequestMapping("/list")
	@GetMapping(value="/list")
	public String lisCustomer (Model model){
	
		
		
		List<Customer> list = customerService.getCustomers();
		
		model.addAttribute("customers", list);
		
		return "list-customer";
	}
	
	@GetMapping(value="/showFormForAdd")
	public String showFormForAdd(Model model){
		
		Customer custNh= new Customer();
		model.addAttribute("graahak", custNh);
		
		return "customer-form";
	}
	
	@PostMapping(value="/jodoCustomer")
	public String jodCustomer( @ModelAttribute("graahak") Customer cust){
		
		customerService.jodoCustomer(cust);
		
		return "redirect:/customer/list";
	}

	@GetMapping("/showForUpdate")
	public String showForUpdate(@RequestParam("customerId") int id , Model model){
		
		Customer graahak = customerService.getCustomer(id);
		model.addAttribute("graahakBadlo", graahak);
		
		return "showFormForUpdate";
		
	}
	
	@PostMapping("/badloCustomer")
	public String badloCustomer(@ModelAttribute("graahakBadlo") Customer customer){
		
		customerService.GraahakJaankaariParvivartan(customer);
		
		return "redirect:/customer/list";
	}
	
	
	@GetMapping("/graahakHataao")
	public String customerHataao(@RequestParam("customerId") int id){
		
		//yahaa par hum hataa denge
		
		customerService.graahakHataao(id);
		
		return "redirect:/customer/list";
	}
	
}
