package com.maven.spring.springcoreadvanced.autowiring;

public class Employee {
	
	private Address address;
	
	Employee(Address address){
		this.address=address;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + getAddress() + "]";
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	
	
	

}
