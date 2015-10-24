package com.util.controllers;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;

import com.util.bean.Employee;  

@Controller
public class EmployeeController {
	
	   EmployeeController(){
		System.out.println("....>>Inside EmployeeController....>>>>");
	}
	
	@RequestMapping(value = "/setEmployeeData", method = RequestMethod.GET)  
	     public ModelAndView employee() {  
	    return new ModelAndView("employeeForm", "command", new Employee());  
	   }  
	
	
	@RequestMapping(value="/methodtestX1", method={RequestMethod.GET})
	public String method3(){
	    return "welcome";
	}
	
	@RequestMapping(value="/methodtestX2", method={RequestMethod.GET})
	public String method4(){
	    return "welcome";
	}
	
	@RequestMapping(value="/methodtestX3", method={RequestMethod.GET})
	public String method5(){
	    return "welcome";
	}
	      
	  @RequestMapping(method = RequestMethod.POST)  
	  public String addEmployee(@ModelAttribute("SpringWeb")Employee employee, ModelMap model) {
		 System.out.println(">>>>>Adding EMployee");
	     model.addAttribute("name", employee.getName());  
	     model.addAttribute("age", employee.getAge());  
	     model.addAttribute("empId", employee.getEmpId());  
	     model.addAttribute("salary", employee.getSalary());  
	     return "employeeDetail";  
	   }  
}
