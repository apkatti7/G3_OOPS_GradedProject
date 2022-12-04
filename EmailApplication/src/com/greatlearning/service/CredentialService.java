package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;

public class CredentialService implements ICredentials {

	@Override
	public String generateEmailAddreress(String firstname, String lastname, String department) {
		// TODO Auto-generated method stub
		String atSymbol ="@";
		String emailAddress = firstname+lastname+atSymbol+department+".gl.com";
		return emailAddress;
	}

	@Override
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String allValues = capitalLetters + smallLetters 
				+ numbers + specialCharacters;
		
		
		Random randomObj = new Random();			
		String password="";
		
		for (int i=0; i < 8; i++) {

			int boundValue = allValues.length();
			int randomIndex = randomObj.nextInt(boundValue);	
			char randomChar = allValues.charAt(randomIndex);			
			password += String.valueOf(randomChar);
		}	
		
		return password;
	}
		  
	

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear "+employee.getFirstname() + " your generated credentials are :");
		System.out.println("Email ID : " + employee.getEmail());
		System.out.println("Password : " +employee.getPassword());
		
	}

	
		
	}




