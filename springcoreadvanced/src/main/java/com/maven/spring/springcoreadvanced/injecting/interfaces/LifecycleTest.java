package com.maven.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext(
				"com/maven/spring/springcoreadvanced/injecting/interfaces/Lifecycleconfig.xml");
		OrderBo bo = (OrderBo)ct.getBean("bo");
		bo.placeOrder();

	}

}
