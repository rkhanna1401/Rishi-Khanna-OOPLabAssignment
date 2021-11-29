package com.greatlearning.itsupportadministrator.driver;

import java.util.Scanner;

import com.greatlearning.itsupportadministrator.services.CredentialService;
import com.greatlearning.itsupportadministrator.services.Employee;

public class CreateCredentials {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String fname = scanner.next();
		System.out.println("Please enter your last name: ");
		String lname = scanner.next();
		Employee emp = new Employee(fname, lname);
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int input = scanner.nextInt();
		if(input>4) {
			System.out.println("Please enter valid entry");
			System.out.println();
			input = scanner.nextInt();
		}
		CredentialService creds = new CredentialService();
		creds.generatePassword();
		creds.generateEmailAddress(emp,input);
		creds.showCredentials(emp);
		scanner.close();	

	}
}
