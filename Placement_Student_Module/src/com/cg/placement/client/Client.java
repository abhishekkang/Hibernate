package com.cg.placement.client;

import com.cg.placement.entities.Student;
import com.cg.placement.service.IStudentService;
import com.cg.placement.service.StudentServiceImpl;

public class Client {
	public static void main(String[] args) {
		Student student = new Student();
		IStudentService service = new StudentServiceImpl();
		student.setCertificate("Ad");
		student.setCollege("Rggec");
		student.setCourse("BCA");
		student.setRoll(10);
		student.setHallTicketNo(321);
		student.setId(100);
		student.setName("Abhi");
		student.setQualification("btech");
		student.setYear(2022);
		service.addStudent(student);
	}
}
