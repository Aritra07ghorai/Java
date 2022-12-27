package com.aritra.customerdatamanagement.controller;

import java.util.Scanner;

import com.aritra.customerdatamanagement.entity.Customer;
import com.aritra.customerdatamanagement.repository.CustomerRepository;
import com.aritra.customerdatamanagement.service.CustomerService;
import com.aritra.customerdatamanagement.service.CustomerServiceImplementation;

public class CustomerController {

	public static void main(String[] args) {
		
		System.out.println("please choose below option:");
		System.out.println("1. Insert Customer Details");
		System.out.println("2. Update Customer Details");
		System.out.println("3. To get customer details by Id");
		System.out.println("4. To delete customer details");
		
		Scanner scn = new Scanner(System.in);
		int choice = scn.nextInt();
		 switch(choice) {
		 
		 case 1:
		 {
			 System.out.println("Id:");
			 System.out.println("name:");
			 System.out.println("Email ID:");
			 System.out.println("Address:");
			 System.out.println("Phone Number:");
			 
			 int id = scn.nextInt();
			 String name = scn.next();
			 String email = scn.next();
			 String address = scn.next();
			 String phnNumber = scn.next();
			 
			 Customer customer = new Customer();	 
			 customer.setId(id);
			 customer.setName(name);
			 customer.setEmail(email);
			 customer.setAddress(address);
			 customer.setPhoneNumber(phnNumber);
			 
			 CustomerService imp = new CustomerServiceImplementation();
			 System.out.println(imp.saveCustomerDetails(customer));
		 }
		 break;
		 
		 case 2:
		 {
			 System.out.println("Id:");
			 System.out.println("name:");
			 System.out.println("Email ID:");
			 System.out.println("Address:");
			 System.out.println("Phone Number:");
			 
			 int id = scn.nextInt();
			 String name = scn.next();
			 String email = scn.next();
			 String address = scn.next();
			 String phnNumber = scn.next();

			 Customer customer = new Customer();
			 customer.setId(id);
			 customer.setName(name);
			 customer.setEmail(email);
			 customer.setAddress(address);
			 customer.setPhoneNumber(phnNumber);
			 
			 CustomerService imp = new CustomerServiceImplementation();
			 System.out.println(imp.updateCustomerDetails(customer));
		 }
		 break;
		 
		 case 3:
		 {
			 System.out.println("Enter Customer Id:");
			 int id = scn.nextInt();
			 CustomerService imp = new CustomerServiceImplementation();
			 System.out.println(imp.getCustomerDetailsById(id));
		 }
		 break;
		 
		 case 4:
		 {
			 System.out.println("Enter Customer Id:");
			 int id = scn.nextInt();
			 CustomerService imp = new CustomerServiceImplementation();
			 System.out.println(imp.deleteCustomerDetailsById(id)); 
		 }
		 break;
		 default:
		 {
			 System.out.println("Enter correct input");
		 }
		 }
	}
}
