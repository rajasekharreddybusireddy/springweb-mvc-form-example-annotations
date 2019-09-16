package com.blogspot.javabyrajasekhar.springwebmvcfom;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc
public class MyConfig implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(AppConfig.class);
        ac.setServletContext(servletContext);
        ac.refresh();

        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet(ac));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
	}

}
