package com.pace.springcore.setterinjection.beans;

public class Employee {
	int id;
	String name;
	Address address;
	
	public int getId(){
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
		
	}
	public void setAddress(Address address) {
		this.address = address;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
