package com.cg.placement.client;

import java.time.LocalDate;
import java.util.Scanner;

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

public class Client {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		Scanner s=new Scanner(System.in);
		Admin admin = new Admin();
		admin.setName("Abhishek");
		admin.setPassword("123456");

		/*System.out.println("Enter Name");
		String name= s.nextLine();
		admin.setName(name);
		System.out.println("Enter Id");
		int x = s.nextInt();
		System.out.println("Enter Password");
		String Password = s.next();
		admin.setPassword(Password);*/
		
		User user = new User();
		IUserService us = new UserServiceImpl();
		

		user.setName("Abhishek");
		user.setPassword("123456");
		user.setType("Fresher");
		
		
		College college = new College();
		ICollegeService cl = new CollegeServiceImpl();
		
		college.setCollegeName("RGGEC");
		college.setLocation("Kangra");
		
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
		
		/*//Creating
		st.addStudent(student);
		cl.addCollege(college);
		cr.addCertificate(certificate);
		pl.addPlacement(placement);
		us.addNewUser(user);*/
		
		
		//Retrieving
		student = st.searchStudentById(1);
		System.out.println(student.getQualification());
		placement = pl.searchPlacement(1);
		System.out.println(placement.getCollege().getCollegeName()+ " " + placement.getCollege().getLocation());
		
		
		//Updating
		student = st.searchStudentById(1);
		student.setCourse("BCA");
		st.updateStudent(student);
		placement = pl.searchPlacement(1);
		placement.setYear(2020);
		college = cl.searchCollege(1);
		college.setCollegeName("MU");
		cl.updateCollege(college);
		
		
		/*//Deleting
		st.deleteStudent(5);
		//pl.cancelPlacement(x);
		//cl.deleteCollege(x);
		
		//Scheduling Placement
		//cl.schedulePlacement(placement);*/
		
	}

}
