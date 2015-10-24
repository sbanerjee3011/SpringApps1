package com.util.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*@WebServlet( 
    name = "SimpleServlet", 
    urlPatterns = {"/home"})
   public class HomeController  extends HttpServlet{
	
	
	// maps to http://localhost:8091/MVCApps1/home?name=Saurabh
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("*****AAPS 1 DEMO********");
		String name = req.getParameter("name");
		System.out.println("name >>>>" + name);
		resp.getWriter().write("Welcome to Servlet 3.0" +" " + name);
	}

}*/
