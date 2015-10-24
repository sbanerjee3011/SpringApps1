package com.util.configurations;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
 
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApplicationInitializerServlet implements WebApplicationInitializer {
 
	
	/*  The onStartup is invoked at the server startUp. This will
	 * (1) Register the view resolver class
	    (2) Registers the front contoller i.e dispatcher servlet*/
    public void onStartup(ServletContext servletContext) throws ServletException {
                                                       System.out.println("*********ON LOAD START UP *****************");
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(ViewResolverConfig.class);
        ctx.setServletContext(servletContext);
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }

}
