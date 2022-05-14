package com.demohibernate.Client;

import com.demohibernate.Service.StudentService;
import com.demohibernate.Service.StudentServiceImpl;
import com.demohibernate.entities.student;

public class Client {
	public static void main(String[] args) {
		// Debug this program as Debug -> Debug as Java Application
		StudentService service = new StudentServiceImpl();
		student student = new student();
		// Create Operation
		student.setStudentId(103);
		student.setSname("Ab");
		service.addStudent(student);
		// at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentById(103);
		System.out.print("ID:" + student.getStudentId());
		System.out.println(" Name:" + student.getSname());
		// Update Operation
		student = service.findStudentById(103);
		student.setSname("Ab");
		service.updateStudent(student);
		// at this breakpoint, we have updated record added in first section
		student = service.findStudentById(103);
		System.out.print("ID:" + student.getStudentId());
		System.out.println(" Name:" + student.getSname());
		// at this breakpoint, record is removed from table
		// Delete Operation
		student = service.findStudentById(103);
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed...");
	}

}
