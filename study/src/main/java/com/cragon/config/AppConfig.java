package com.cragon.config;

import com.cragon.entity.Child;
import com.cragon.entity.Parent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Child childMethod() {
		return new Child();
	}

	@Bean
	public Parent parentMethod() {
		childMethod();
		System.out.println("Init Parent");
		return new Parent();
	}
}
