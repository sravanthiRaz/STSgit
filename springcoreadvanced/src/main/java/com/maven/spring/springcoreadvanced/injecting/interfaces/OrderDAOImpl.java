package com.maven.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl implements OrderDAO {

@Override
	public void createOrder() {
		System.out.println("Inside Order DAO createOrder()");
		

	}

}
