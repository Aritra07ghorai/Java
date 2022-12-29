package com.aritra.projectservlet.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.aritra.projectservlet.dao.StudentDAO;
import com.aritra.projectservlet.dto.Student;

@WebServlet("/saveStudent")
public class StudentController extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		
		Student student = new Student();
		student.setName(name);
		student.setEmail(email);
		student.setAddress(address);
		
		StudentDAO dao = new StudentDAO();
		dao.saveStudents(student);
	}
}
