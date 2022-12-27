package com.aritra.customerdatamanagement.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aritra.customerdatamanagement.appConstants.AppConstants;
import com.aritra.customerdatamanagement.entity.Customer;
import com.aritra.customerdatamanagement.util.ConnectionGiver;

//Repository/dao(data accessing object)
public class CustomerRepository {
	//This method saves the customer data to database and the table in database has a id
	public String saveCustomerDetails(Customer customer){
		Connection connection = ConnectionGiver.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement
					("INSERT INTO customer(id, name, email, address, phone_number) VALUES(?,?,?,?,?)");
			preparedStatement.setInt(1, customer.getId());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setString(3, customer.getEmail());
			preparedStatement.setString(4, customer.getAddress());
			preparedStatement.setString(5, customer.getPhoneNumber());
			
			int res = preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			return "Customer data Inserted Successfully";
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "something went wrong";
	}
	
	//This method update the customer data to database and the table in database has a id
	public String updateCustomerDetails(Customer customer) {
		Connection connection = ConnectionGiver.getConnection();
	
		try {
			PreparedStatement preparedStatement = connection.prepareStatement
					("UPDATE customer SET name=?, email=?, address=?, phone_number=? WHERE id=?");
		
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getEmail());
			preparedStatement.setString(3, customer.getAddress());
			preparedStatement.setString(4, customer.getPhoneNumber());
			preparedStatement.setInt(5, customer.getId());
			
			int res = preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			return "Customer data updated successfully";
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return "something went wrong";
	}
	
	//This method delete the customer data to database and the table in database has a id
	public String deleteCustomerDetailsById(int id) {
		Connection connection = ConnectionGiver.getConnection();
	
		try {
			PreparedStatement preparedStatement;
			preparedStatement = connection .prepareStatement("DELETE FROM customer WHERE id=?");
		
			preparedStatement.setInt(1, id);
			int res = preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			return "Customer data deleted successfully";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "something went wrong";
	}
	
	//This method get the customer data to database and the table in database has a id
	public Customer getCustomerDetailsById(int id) {
		try {
		Connection connection = ConnectionGiver.getConnection();
		PreparedStatement preparedStatement = connection .prepareStatement("SELECT * FROM customer WHERE id=?");
		
		preparedStatement.setInt(1, id);
		ResultSet res = preparedStatement.executeQuery();
		Customer customer = new Customer();
		if(res.next()) {
			customer.setId(res.getInt(1));
			customer.setName(res.getString(2));
			customer.setEmail(res.getString(3));
			customer.setAddress(res.getString(4));
			customer.setPhoneNumber(res.getString(5));
		}
		return customer;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//This method get the customer data to database and the table in database has a email
	
	public Customer getCustomerDetailsByEmail(String email) {
		Customer customer = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionGiver.getConnection();
			preparedStatement = connection .prepareStatement("SELECT * FROM customer WHERE email=?");
		
			preparedStatement.setString(1, email);
			ResultSet res = preparedStatement.executeQuery();
			customer = new Customer();
			if(res.next()) {
				customer.setId(res.getInt(1));
				customer.setName(res.getString(2));
				customer.setEmail(res.getString(3));
				customer.setAddress(res.getString(4));
				customer.setPhoneNumber(res.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			return customer;
		}
	}
}
