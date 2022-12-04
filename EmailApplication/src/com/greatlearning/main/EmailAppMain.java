package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class EmailAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Entry point to the application
		// user input options for departments

		Employee employee = new Employee("Anirudh", "Katti");
		ICredentials credentialsService = new CredentialService();

		// user input options for departments
		System.out.println("Please choose the department from the following options");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");

		Scanner userInput = new Scanner(System.in);
		int option = userInput.nextInt();
		userInput.close();
		String generatedEmail = null;
		String generatedPassword = null;

		switch (option) {
		case 1: {
			generatedEmail = credentialsService.generateEmailAddreress(employee.getFirstname().toLowerCase(),
					employee.getLastname().toLowerCase(), "tech");
			generatedPassword = credentialsService.generatePassword();
			break;
		}
		case 2: {
			generatedEmail = credentialsService.generateEmailAddreress(employee.getFirstname().toLowerCase(),
					employee.getLastname().toLowerCase(), "adm");
			generatedPassword = credentialsService.generatePassword();
			break;
		}
		case 3: {
			generatedEmail = credentialsService.generateEmailAddreress(employee.getFirstname().toLowerCase(),
					employee.getLastname().toLowerCase(), "hr");
			generatedPassword = credentialsService.generatePassword();
			break;
		}
		case 4: {
			generatedEmail = credentialsService.generateEmailAddreress(employee.getFirstname().toLowerCase(),
					employee.getLastname().toLowerCase(), "lg");
			generatedPassword = credentialsService.generatePassword();
			break;
		}
		default: {
			System.out.println("Enter a valid department option");
		}
		}
		employee.setEmail(generatedEmail);
		employee.setPassword(generatedPassword);
		credentialsService.showCredentials(employee);

	}

}
