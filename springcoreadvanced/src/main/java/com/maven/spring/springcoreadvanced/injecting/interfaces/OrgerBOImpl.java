package com.maven.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrgerBOImpl implements OrderBo {
	
	@Autowired
	private OrderDAO dao;

	
	@Override
	public void placeOrder() {
		System.out.println("Inside order BO");
		dao.createOrder();
	}


	public OrderDAO getDao() {
		return dao;
	}


	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}


	@Override
	public String toString() {
		return "OrgerBOImpl [dao=" + dao + "]";
	} 
		



}
