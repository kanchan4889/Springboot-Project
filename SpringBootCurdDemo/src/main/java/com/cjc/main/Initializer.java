package com.cjc.main;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext context) throws ServletException {
		
		AnnotationConfigWebApplicationContext apc=new AnnotationConfigWebApplicationContext();
		apc.register(AppConfig.class);
		apc.setServletContext(context);
		ServletRegistration.Dynamic servlet=context.addServlet("dispatcher", new DispatcherServlet(apc));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
	}
	

}
