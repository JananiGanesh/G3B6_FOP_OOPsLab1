package com.greatlearning.oops.employee;
/*
 * Employee class which holds the details of an employee like 
    --->Firstname
    --->Lastname
    --->EmailAddress
    --->Password 
    --->Department
 */

public class Employee {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	private String departmentName;
	public Employee(String firstName, String lastName) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
