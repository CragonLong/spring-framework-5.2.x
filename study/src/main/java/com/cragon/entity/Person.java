package com.cragon.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person implements ApplicationContextAware {
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Call aware callback");
	}

	@Autowired
	private Child child;

	public Person() {
		System.out.println("Person");
	}

	@PostConstruct
	public void initPerson() {
		System.out.println("Call person lifecycle init callback");
	}
}
