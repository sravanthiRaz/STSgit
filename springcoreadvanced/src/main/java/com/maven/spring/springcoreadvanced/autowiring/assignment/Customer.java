package com.maven.spring.springcoreadvanced.autowiring.assignment;

public class Customer {
	
	private Reservation reservation;
	private String Name;
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Customer [reservation=" + reservation + ", Name=" + Name + "]";
	}
	
	
	

}
