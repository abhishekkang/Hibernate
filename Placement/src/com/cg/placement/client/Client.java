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

public class Client {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		Student student = new Student();
		IStudentService st = new StudentServiceImpl();
		student.setName("Abhishek");
		student.setRoll(6);
		student.setQualification("Graduation");
		student.setCourse("Btech");
		student.setYear(2022);
		student.setHallTicketNo(322);
		
		College college = new College();
		ICollegeService cl = new CollegeServiceImpl();

		
		college.setCollegeName("RGGEC");
		college.setLocation("Kangra");
		
		college.getStudent().add(student);
		student.setCollege(college);
		
		
		Certificate certificate = new Certificate();
		ICertificateService cr = new CertificateServiceImpl();
		
		certificate.setYear(2020);
		
		certificate.setStudent(student);
		student.setCertificate(certificate);
		certificate.setCollege(college);
		college.getCertificate().add(certificate);
		
		Placement placement = new Placement();
		IPlacementService pl = new PlacementServiceImpl();
		
		
		placement.setName("Abhishek");
		placement.setDate(ld);
		placement.setQualification("Graduation");
		placement.setYear(2022);
		
		placement.setCollege(college);
		college.getPlacement().add(placement);
		
		
		User user = new User();
		IUserService us = new UserServiceImpl();
		
		
		user.setName("Abhishek");
		user.setPassword("123456");
		user.setType("Fresher");
		
		user.setCollege(college);
		college.setCollegAdmin("user");
		
		
		Admin admin = new Admin();
		
		admin.setName("Abhishek");
		admin.setPassword("123456");
		
		admin.setUser(user);
		user.setAdmin(admin);
		
		st.addStudent(student);
		cl.addCollege(college);
		cr.addCertificate(certificate);
		pl.addPlacement(placement);
		us.addNewUser(user);
		pl.cancelPlacement(5);
		
		
	}

}
