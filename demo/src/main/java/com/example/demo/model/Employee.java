package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private int id;
	private String city;

//	public Employee(String name, int id, String city) {
//		this.name = name;
//		this.id = id;
//		this.city = city;
//	}
	
	public Employee(String name) {
		this.name = name;
	}
	
//	public Employee(String name, int id) {
//		this.name = name;
//		this.id = id;
//		
//	}
	
	public Employee() {
		
	}

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	

	public int getId() {
		return id;
	}


//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", id=" + id + ", city=" + city + "]";
//	}	

}
