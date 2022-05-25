package com.cg.placement.client;

import java.util.Scanner;

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

public class UpdatePlacement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // input fo Id

		User user = new User(); // object for class User
		IUserService us = new UserServiceImpl(); // object for calling the JPACRUD operations in User

		College college = new College(); // object for class College
		ICollegeService cl = new CollegeServiceImpl(); // object for calling the JPACRUD operations in College

		Student student = new Student();// object for class Student
		IStudentService st = new StudentServiceImpl();// object for calling the JPACRUD operations in Student

		Placement placement = new Placement();// object for class Placement
		IPlacementService pl = new PlacementServiceImpl();// object for calling the JPACRUD operations in Placement

		Certificate certificate = new Certificate();// object for class Certificate
		ICertificateService cr = new CertificateServiceImpl();// object for calling the JPACRUD operations in
																// Certificate

		System.out.println("Eneter 1 for updating Student deatils");
		System.out.println("Eneter 2 for updating Placement deatils");
		System.out.println("Eneter 3for updating  College deatils");
		System.out.println("Eneter 4 for updating Certificate deatils");
		System.out.println("Eneter 5 for  updating All deatils");
		int y = s.nextInt();
		switch (y) {
		case 1: {
			System.out.println("Enter the Id of Student for details");
			int x = s.nextInt();
			student = st.searchStudentById(x);
			student.setCourse("BCA");
			st.updateStudent(student);
			break;
		}
		case 2: {
			System.out.println("Enter the Id of Student for details");
			int x = s.nextInt();
			placement = pl.searchPlacement(x);
			placement.setYear(2020);
			pl.updatePlacement(placement);
			break;
		}
		case 3: {
			System.out.println("Enter the Id of Student for details");
			int x = s.nextInt();
			college = cl.searchCollege(x);
			college.setCollegeName("MU");
			cl.updateCollege(college);
			break;
		}
		case 4: {
			System.out.println("Enter the Id of Student for details");
			int x = s.nextInt();
			certificate = cr.searchCertificate(x);
			certificate.setYear(2021);
			cr.updateCertificate(certificate);
			break;
		}
		case 5: {
			System.out.println("Enter the Id of Student for details");
			int x = s.nextInt();
			certificate = cr.searchCertificate(x);
			certificate.setYear(2021);
			cr.updateCertificate(certificate);
			college = cl.searchCollege(x);
			college.setCollegeName("MU");
			cl.updateCollege(college);
			placement = pl.searchPlacement(x);
			placement.setYear(2020);
			pl.updatePlacement(placement);
			student = st.searchStudentById(x);
			student.setCourse("BCA");
			st.updateStudent(student);
			break;
			
		}
		default:
			System.out.println("Enetr valid Option");

		}
		System.out.println("Update Finished");
	}
}
