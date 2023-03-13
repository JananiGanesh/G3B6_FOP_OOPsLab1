package com.greatlearning.oops.employee.service;
/*
 * This is the interface which has information about methods to be implemented.
 */
import com.greatlearning.oops.employee.Employee;

public interface CredentialService {
	public String  generateEmailAddress(Employee employee) ;
	public String generatePassword();
	public String showCredential(Employee employee);

}
