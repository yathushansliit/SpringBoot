package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Allocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

    Integer empId;
    String start;
    String end;
    String projectCode;
    
    
    
    
	public Allocation() {
	
	}
	
	public Allocation(Integer empId, String start, String end, String projectCode) {
		this.empId = empId;
		this.start = start;
		this.end = end;
		this.projectCode = projectCode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
    
    
    

}
