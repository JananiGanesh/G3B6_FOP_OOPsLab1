package com.greatlearning.oops.employee.service;
/*
 * This class implements the functionalities of CredentialService Interface.
 * The implementation includes
  ----->Generating EmailId for an employee based on employee details given in 
        below syntax format
        "firstNamelastName@department.company.com"
  ----->Generate password for an employee as random password which includes
         1.numbers
         2.capital letter
         3.small letter
         4.special character
  ----->Displaying the generated credentials            
 */

import java.util.Random;

import com.greatlearning.oops.employee.Employee;

public class CredentialServiceClass implements CredentialService {
    private static final String companyName ="gl.in";
    private static final int password_Size=8;
	@Override
	public String generateEmailAddress(Employee employee) {
		// TODO Auto-generated method stub
		String firstName=employee.getFirstName();
		String lastName=employee.getLastName();
		String department=employee.getDepartmentName();
		
		return firstName+lastName+"@"+department+"."+companyName;
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String capitalCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase=capitalCase.toLowerCase();
		String nums="0123456789";
		String specialCharacters="!@#$%^&*";
		
		String passwordCharacters=capitalCase+lowerCase+nums+specialCharacters;
		String password="";
		Random random=new Random();
		
		for(int i=0;i<password_Size;i++) {
			password=password+passwordCharacters.charAt(random.nextInt(passwordCharacters.length()));	
		}
		return password;
				
	}

	@Override
	public String showCredential(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Dear "+employee.getFirstName()+" "+"your generated credentials are");
		System.out.println("Email----->"+employee.getEmailAddress());
		System.out.println("Password---->"+employee.getPassword());
		return null;
	}

	
   
}
