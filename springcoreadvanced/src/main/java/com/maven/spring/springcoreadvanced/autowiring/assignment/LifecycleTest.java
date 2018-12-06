package com.maven.spring.springcoreadvanced.autowiring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext(
				"com/maven/spring/springcoreadvanced/autowiring/assignment/Lifecycleconfig.xml");
		Customer em = (Customer) ct.getBean("customer");
		System.out.println(em);

	}

}
