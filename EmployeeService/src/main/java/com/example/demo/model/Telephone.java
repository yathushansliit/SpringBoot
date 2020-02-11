package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.criteria.CriteriaBuilder.In;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Telephone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String photnNumber;
	
	@JoinColumn
	@ManyToOne
	@JsonIgnore
	Employee employee;	
	
	public Telephone() {
		
	}
	
	public Telephone(String photnNumber, Employee employee) {
		this.photnNumber = photnNumber;
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhotnNumber() {
		return photnNumber;
	}

	public void setPhotnNumber(String photnNumber) {
		this.photnNumber = photnNumber;
	}

	public String getNumber() {
		return photnNumber;
	}
	public void setNumber(String photnNumber) {
		this.photnNumber = photnNumber;
	}
	
	
}
