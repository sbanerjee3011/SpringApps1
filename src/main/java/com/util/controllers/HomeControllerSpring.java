package com.util.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller

public class HomeControllerSpring {
	
	// default handler for the request
	  @RequestMapping(method = RequestMethod.GET)
	    public String sayHello(ModelMap model) {
		  System.out.println("********Default handler****");
	        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
	        return "welcome";
	    }
	  
	  
	  @RequestMapping(value="/method1", method={RequestMethod.GET})
		public String method1(){
		    return "welcome";
		}
		
		@RequestMapping(value="/method2", method={RequestMethod.GET})
		public String method2(){
		    return "welcome";
		}
		
		@RequestMapping(value="/method3", method={RequestMethod.GET})
		public String method3(){
		    return "welcome";
		}

}
