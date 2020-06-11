package com.cragon.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parent {
	@Autowired
	private Child child;

	public Parent() {
		System.out.println("Parent");
	}
}
