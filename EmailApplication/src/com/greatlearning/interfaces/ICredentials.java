package com.greatlearning.interfaces;

import com.greatlearning.model.Employee;

public interface ICredentials {
//generateEmailaddress
	// generate password
	// display credentials

	public String generateEmailAddreress(String firstname, String lastname, String department);

	public String generatePassword();
	
	public void showCredentials(Employee employee);
}
