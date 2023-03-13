package com.greatlearning.oops.employee.driver;
/*
 * This application will collect information about an employee like 
   --->Firstname
   --->Lastname
   and allows the user to choose the department he belongs to
   --->Department.
   It will generate an credentials like Email Id and Password for the new hires.
 */

import java.util.Scanner;
import com.greatlearning.oops.employee.Employee;
import com.greatlearning.oops.employee.service.CredentialService;
import com.greatlearning.oops.employee.service.CredentialServiceClass;

public class EmployeeDriver {

	public static void main(String[] args) {

		 try (Scanner sc = new Scanner(System.in)) {
			 CredentialService service=new CredentialServiceClass();
			 System.out.println("Please Enter Employee FirstName ");
			 String empFirstName=sc.next();
			 System.out.println("Please Enter Employee LastName");
			 String empLastName=sc.next();
			 Employee user=new Employee(empFirstName,empLastName);
			 System.out.println("Please Enter the department from the following options ");
			 System.out.println("1.Technical");
			 System.out.println("2.Admin");
			 System.out.println("3.Human Resource");
			 System.out.println("4.Legal");
			 int option;
			 option=sc.nextInt();
			 String department=null;
			 switch(option){
			 case 1:
				 department="Tech";
				 break;
			 case 2:
				 department="Admin";
				 break;
			 case 3:
				 department="Hr";
				 break;
			 case 4:
				 department="Legal";
				 break;
			 default:
				 System.out.println("Please enter the valid options ! ");
				    	 
			 }
			 if(department!=null) {
				 user.setDepartmentName(department);
				 String emailAddress=service.generateEmailAddress(user);
				 user.setEmailAddress(emailAddress);
				 String password=service.generatePassword();
				 user.setPassword(password);
				 service.showCredential(user);
			 }
		}
        	 
         
         
	}

}
