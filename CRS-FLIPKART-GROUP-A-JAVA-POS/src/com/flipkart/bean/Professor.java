package com.flipkart.bean;

public class Professor extends User{

	private Integer instructorID;
	private String department;
	private String designation;
	public Integer getInstructorID() {
		return instructorID;
	}
	public void setInstructorID(Integer instructorID) {
		this.instructorID = instructorID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Professor(Integer instructorID, String department, String designation) {
		super();
		this.instructorID = instructorID;
		this.department = department;
		this.designation = designation;
	}
	public Professor() {
		super();
	}
	
}
