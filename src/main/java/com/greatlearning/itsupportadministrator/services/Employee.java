package com.greatlearning.itsupportadministrator.services;

public class Employee {

	private String fisrtName;
	private String lastName;

	public String getFisrtName() {
		return fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public Employee(String firstName, String lastName) {
		this.fisrtName = firstName;
		this.lastName = lastName;
	}

}
