package com.aritra.customerdatamanagement.service;

import com.aritra.customerdatamanagement.appConstants.AppConstants;
import com.aritra.customerdatamanagement.entity.Customer;
import com.aritra.customerdatamanagement.repository.CustomerRepository;
import com.aritra.customerdatamanagement.util.AES;

public class CustomerServiceImplementation implements CustomerService{
	CustomerRepository repository = null;
	
	public CustomerServiceImplementation() {
		repository = new CustomerRepository();
	}
	
	@Override
	public String saveCustomerDetails(Customer customer) {
		String encEmail = AES.encrypt(customer.getEmail(), AppConstants.SECRET_KEY);
		String encPhoneNumber = AES.encrypt(customer.getPhoneNumber(), AppConstants.SECRET_KEY);
		String encAddress = AES.encrypt(customer.getAddress(), AppConstants.SECRET_KEY);
		customer.setEmail(encEmail);
		customer.setPhoneNumber(encPhoneNumber);
		customer.setAddress(encAddress);
		return repository.saveCustomerDetails(customer);
	}

	@Override
	public String updateCustomerDetails(Customer customer) {
		String encEmail = AES.encrypt(customer.getEmail(), AppConstants.SECRET_KEY);
		String encPhoneNumber = AES.encrypt(customer.getPhoneNumber(), AppConstants.SECRET_KEY);
		String encAddress = AES.encrypt(customer.getAddress(), AppConstants.SECRET_KEY);
		customer.setEmail(encEmail);
		customer.setPhoneNumber(encPhoneNumber);
		customer.setAddress(encAddress);
		return repository.updateCustomerDetails(customer);
	}

	@Override
	public String deleteCustomerDetailsById(int id) {
		return repository.deleteCustomerDetailsById(id);
	}

	@Override
	public Customer getCustomerDetailsById(int id) {
		Customer customer = repository.getCustomerDetailsById(id);
		String decEmail = AES.decrypt(customer.getEmail(),	AppConstants.SECRET_KEY);
		String decAddress = AES.decrypt(customer.getAddress(), AppConstants.SECRET_KEY);
		String decPhoneNumber = AES.decrypt(customer.getPhoneNumber(), AppConstants.SECRET_KEY);
		customer.setEmail(decEmail);
		customer.setPhoneNumber(decPhoneNumber);
		customer.setAddress(decAddress);
		return customer;
	}

	@Override
	public Customer getCustomerDetailsByEmail(String email) {
//		Customer customer = repository.getCustomerDetailsByEmail(email);
//		String decEmail = AES.decrypt(customer.getEmail(),	AppConstants.SECRET_KEY);
//		String decAddress = AES.decrypt(customer.getAddress(), AppConstants.SECRET_KEY);
//		String decPhoneNumber = AES.decrypt(customer.getPhoneNumber(), AppConstants.SECRET_KEY);
//		customer.setEmail(decEmail);
//		customer.setPhoneNumber(decPhoneNumber);
//		customer.setAddress(decAddress);
		return repository.getCustomerDetailsByEmail(email);
	}
}
