package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String projNameString;
	
	@ManyToMany(mappedBy = "projects")
	List<Employee> employees;
	
	

	public Project() {
	
	}
	
	

	public Project(String projNameString) {
	
		this.projNameString = projNameString;
	}



	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getProjNameString() {
		return projNameString;
	}

	public void setProjNameString(String projNameString) {
		this.projNameString = projNameString;
	}
	

}
