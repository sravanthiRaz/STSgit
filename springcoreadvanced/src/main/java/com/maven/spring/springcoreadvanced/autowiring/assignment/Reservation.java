package com.maven.spring.springcoreadvanced.autowiring.assignment;

import org.springframework.beans.factory.annotation.Autowired;

public class Reservation {
	@Autowired
	private int id;
	private String time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", time=" + time + "]";
	}
	

}
