package com.aritra.projectservlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aritra.projectservlet.dto.Student;

public class StudentDAO {
	public void saveStudents(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/servlet";
			String user="root";
			String psw="root";
			Connection connection = DriverManager.getConnection(url, user, psw);
			
			String query ="INSERT INTO student (name, email, address) VALUES(?,?,?)";
			PreparedStatement preparedstatement = connection.prepareStatement(query);
			preparedstatement.setString(1, student.getName());
			preparedstatement.setString(2, student.getEmail());
			preparedstatement.setString(3, student.getAddress());
			int res = preparedstatement.executeUpdate();
			System.out.println("No of row update=" + res);
			preparedstatement.close();
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
