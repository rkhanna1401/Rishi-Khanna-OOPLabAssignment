package com.greatlearning.itsupportadministrator.services;

import java.util.Random;

import com.greatlearning.itsupportadministrator.utils.Departments;

public class CredentialService {

	private String password;
	private String email;
	private String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	private String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz"; 
	private String numbers = "0123456789"; 
	private String splCharacter ="!@#$%^&*";

	public String generateRandomAlphaNumericString() {
		String alpha;
		Random random = new Random();
		String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase + numbers + splCharacter; 
		StringBuffer randomString = new StringBuffer(); 
		for (int i = 0; i < 8; i++) { 
			int index = random.nextInt(allCharacters.length()); 
			randomString.append(allCharacters.charAt(index)); 
		} 
		alpha = randomString.toString();
		return alpha;
	}

	public void generatePassword() {
		password = generateRandomAlphaNumericString();
	}

	public void generateEmailAddress(Employee emp,int input) {
		String deptName = null;
		for (Departments dept : Departments.values())  {
			if(dept.value == input) {
				deptName = dept.name();
			}
		}
		email = emp.getFisrtName()+emp.getLastName()+"@"+deptName+".abc.com";

	}

	public void showCredentials(Employee emp) {
		System.out.println("Dear "+emp.getFisrtName() +" " +emp.getLastName()+" your generated credentials are as follows");
		System.out.println("Email -->"+ email);
		System.out.println("Password -->"+ password);
	}

}
