package com.aritra.customerdatamanagement.service;

import com.aritra.customerdatamanagement.entity.Customer;

public interface CustomerService {
	public String saveCustomerDetails(Customer customer);
	
	public String updateCustomerDetails(Customer customer);
	
	public String deleteCustomerDetailsById(int id);
	
	public Customer getCustomerDetailsById(int id);
	
	public Customer getCustomerDetailsByEmail(String email);
	
}
