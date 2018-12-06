package com.maven.spring.springcoreadvanced.standalone.collections;

import java.util.List;

public class ProductList {
	private List<String> productNames;

	
	@Override
	public String toString() {
		return "ProductList [productnames=" + productNames + "]";
	}

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}
	

}
