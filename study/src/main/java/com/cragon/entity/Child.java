package com.cragon.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Child {
	@Autowired
	private Parent parent;

	public Child() {
		System.out.println("Child");
	}
}
