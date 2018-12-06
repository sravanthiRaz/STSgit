package com.maven.spring.springcoreadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext(
				"com/maven/spring/springcoreadvanced/autowiring/Lifecycleconfig.xml");
		Employee em = (Employee) ct.getBean("employee");
		System.out.println(em);

	}

}
