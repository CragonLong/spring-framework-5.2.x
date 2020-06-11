package com.cragon;

import com.cragon.config.AppConfig;
import com.cragon.entity.Child;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//		ac.setAllowCircularReferences(true);
//		ac.register(AppConfig.class);
//		ac.refresh();
//		System.out.println(ac.getBean(Child.class));
	}
}
