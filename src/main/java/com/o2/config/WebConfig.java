package com.o2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.mongodb.MongoClient;

@EnableWebMvc
@Configuration
@ComponentScan({"com.o2"})
public class WebConfig extends WebMvcConfigurerAdapter {

@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/jsp/user/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

@Bean
public MongoDbFactory mongoDbFactory() {
	return  new SimpleMongoDbFactory(new MongoClient("localhost", 27017), "Academy");
	
}

@Bean
public MongoTemplate mongoTemplate() {
	return new MongoTemplate(mongoDbFactory());
}

}
