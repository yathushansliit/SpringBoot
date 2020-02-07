package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", mark=" + id + "]";
	}
	
	
	
	

}
