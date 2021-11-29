package com.greatlearning.itsupportadministrator.utils;

public enum Departments {

	tech(1), admin(2), hr(3), legal(4);

	public int value;  
	
	private Departments(int value){  
		this.value=value;  
	}
}
