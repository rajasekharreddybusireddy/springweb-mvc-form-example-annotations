package com.blogspot.javabyrajasekhar.springwebmvcfom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.blogspot.javabyrajasekhar.springwebmvcfom")

public class AppConfig {
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {

		return new InternalResourceViewResolver("/WEB-INF/", ".jsp");

	}

}
