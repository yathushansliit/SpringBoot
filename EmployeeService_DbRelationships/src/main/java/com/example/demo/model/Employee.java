package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;



@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;	
	String city;

	

	@OneToOne(cascade = CascadeType.ALL)
	Address address;
	
	
	@OneToMany(mappedBy = "employee")
	List<Telephone> telephones;
	
	@ManyToMany
	@JoinTable(name = "employee_project",
				joinColumns = @JoinColumn(name="eid", referencedColumnName = "id"),
				inverseJoinColumns=@JoinColumn(name ="pid", referencedColumnName = "id"))
	List<Project>projects;
	
	


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


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public List<Telephone> getTelephones() {
		return telephones;
	}


	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}


	public List<Project> getProjects() {
		return projects;
	}


	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", city=" + city + "]";
	}	

}
