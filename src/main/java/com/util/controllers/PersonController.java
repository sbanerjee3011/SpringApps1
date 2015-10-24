package com.util.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.util.bean.Person;  

	@Controller  
	public class PersonController {  
	  
	    @RequestMapping(value="/person-form")  
	    public ModelAndView personPage() {  
	        return new ModelAndView("person-page", "person-entity", new Person());  
	    }  
	      
	    @RequestMapping(value="/process-person")  
	    public ModelAndView processPerson(@ModelAttribute("person") Person person,BindingResult result) {  
	        ModelAndView modelAndView = new ModelAndView();  
	        modelAndView.setViewName("person-result-page");  
	          
	        modelAndView.addObject("pers", person);  
	          
	        return modelAndView;  
	    }     
}
