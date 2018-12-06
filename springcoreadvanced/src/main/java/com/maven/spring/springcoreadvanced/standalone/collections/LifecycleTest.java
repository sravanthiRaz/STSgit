package com.maven.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext(
				"com/maven/spring/springcoreadvanced/standalone/collections/Lifecycleconfig.xml");
		ProductList em = (ProductList) ct.getBean("productList");
		System.out.println(em);

	}

}
