package com.javaLive.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import interceptors.LoggingInterceptor;
import interceptors.TransactionInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.javaLive")
public class AppConfig extends WebMvcConfigurerAdapter{
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoggingInterceptor());
		registry.addInterceptor(new TransactionInterceptor()).addPathPatterns("/employee-module/addNew");
	}
	/*
	 * @Bean public MessageSource messageSource() { ResourceBundleMessageSource
	 * messageSource = new ResourceBundleMessageSource();
	 * messageSource.setBasename("messages"); return messageSource; }
	 */
}
