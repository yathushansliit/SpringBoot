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
	Integer id;
	String name;	
	String city;

	

	@OneToOne(cascade = CascadeType.ALL)
	Address address;
	
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	List<Telephone> telephones;
	
	@ManyToMany
	@JoinTable(
				joinColumns = { @JoinColumn(name="eid", referencedColumnName = "id")},
				inverseJoinColumns= {@JoinColumn(name ="pid", referencedColumnName = "id")})
	List<Project>projects;
	
	


	public Employee() {
	
	}




	public Employee(String name, String city, Address address, List<Telephone> telephones, List<Project> projects) {
				this.name = name;
		this.city = city;
		this.address = address;
		this.telephones = telephones;
		this.projects = projects;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
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



}
