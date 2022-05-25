package com.cg.placement.client;

import java.time.LocalDate;


import com.cg.placement.entities.Admin;
import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.entities.Student;
import com.cg.placement.entities.User;
import com.cg.placement.service.CertificateServiceImpl;
import com.cg.placement.service.CollegeServiceImpl;
import com.cg.placement.service.ICertificateService;
import com.cg.placement.service.ICollegeService;
import com.cg.placement.service.IPlacementService;
import com.cg.placement.service.IStudentService;
import com.cg.placement.service.IUserService;
import com.cg.placement.service.PlacementServiceImpl;
import com.cg.placement.service.StudentServiceImpl;
import com.cg.placement.service.UserServiceImpl;

public class CeatePlacement {
public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now(); //using this  for the column date in Table placement , 
		
		Admin admin = new Admin(); // object for class Admin
		
		admin.setName("Abhishek");
		admin.setPassword("123456"); // setting name and password for table Admin 
		

		User user = new User(); // object for class User
		IUserService us = new UserServiceImpl(); // object for calling the JPACRUD operations in User
		

		user.setName("Abhishek");
		user.setPassword("123456");
		user.setType("Fresher"); // setting name password for table User
		
		
		College college = new College(); // object for class College
		ICollegeService cl = new CollegeServiceImpl(); // object for calling the JPACRUD operations in College
		
		college.setCollegeName("RGGEC");
		college.setLocation("Kangra"); //
		
		Student student = new Student();
		IStudentService st = new StudentServiceImpl();
		
		student.setName("Abhishek");
		student.setRoll(5);
		student.setQualification("Graduation");
		student.setCourse("Btech");
		student.setYear(2022);
		student.setHallTicketNo(322);
		
		Placement placement = new Placement();
		IPlacementService pl = new PlacementServiceImpl();
		
		placement.setName("Abhishek");
		placement.setDate(ld);
		placement.setQualification("Graduation");
		placement.setYear(2022);
		
		Certificate certificate = new Certificate();
		ICertificateService cr = new CertificateServiceImpl();
		
		certificate.setYear(2020);
		
		//College
		college.getStudent().add(student);
		student.setCollege(college);
		
		//Certificate
		certificate.setStudent(student);
		student.setCertificate(certificate);
		certificate.setCollege(college);
		college.getCertificate().add(certificate);
		
		//Placement
		placement.setCollege(college);
		college.getPlacement().add(placement);
		
		//User
		user.setCollegeAdmin(college);
		college.setCollegeAdmin(user);
		
		//Admin
		admin.setUser(user);
		user.setAdmin(admin);
		
		//Creating
		st.addStudent(student);
		cl.addCollege(college);
		cr.addCertificate(certificate);
		pl.addPlacement(placement);
		us.addNewUser(user);
}

}
