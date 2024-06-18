package com.pace.springcore.setterinjection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pace.springcore.setterinjection.beans.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) context.getBean("emp");
		
		System.out.println( emp.getId() + "-- " + emp.getName());
	    System.out.println("Address of employee");
		
	    
		System.out.println("Flat No : " + emp.getAddress().getFlatno() );
		System.out.println("Appartment Name : " + emp.getAddress().getAppartmentName() );
		System.out.println("Area : " + emp.getAddress().getArea() );
		System.out.println("City : " + emp.getAddress().getCity() );
		
	}
}
		
		
		
		
		
		
		
		
		
		/*
		//Change data through setters
		
		emp.address.setArea("Marathahalli");
		emp.address.setCity("Bengaluru");
		System.out.println("Data after changing area and city");
		System.out.println("Flat No : " + emp.address.getFlatno() );
		System.out.println("Area : " + emp.address.getArea() );
		System.out.println("City : " + emp.address.getCity() );*/
		

