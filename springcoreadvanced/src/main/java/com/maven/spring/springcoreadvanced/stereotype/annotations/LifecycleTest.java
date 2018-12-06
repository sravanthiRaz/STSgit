package com.maven.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext(
				"com/maven/spring/springcoreadvanced/stereotype/annotations/Lifecycleconfig.xml");
		Instructor instructor = (Instructor) ct.getBean("inst");
		System.out.println(instructor);

	}

}
