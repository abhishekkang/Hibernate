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

public class ReterivePlacement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		User user = new User(); // object for class User
		IUserService us = new UserServiceImpl(); // object for calling the JPACRUD operations in User

		College college = new College(); // object for class College
		ICollegeService cl = new CollegeServiceImpl(); // object for calling the JPACRUD operations in College

		Student student = new Student();
		IStudentService st = new StudentServiceImpl();

		Placement placement = new Placement();
		IPlacementService pl = new PlacementServiceImpl();

		Certificate certificate = new Certificate();
		ICertificateService cr = new CertificateServiceImpl();

		System.out.println("Eneter 1 for Student deatils");
		System.out.println("Eneter 2 for Placement deatils");
		System.out.println("Eneter 3for College deatils");
		System.out.println("Eneter 4 for Certificate deatils");
		int y = s.nextInt();

		switch (y) {
		case 1: {
			System.out.println("Enter the Id of Student for details");
			int x = s.nextInt();
			student = st.searchStudentById(x);
			System.out.println("Roll No: " + student.getRoll());
			System.out.println("Hall Ticket No: " + student.getHallTicketNo());
			System.out.println("Name: " + student.getName());
			System.out.println("Course: " + student.getCourse());
			System.out.println("Year: " + student.getYear());
			System.out.println("Qualification: " + student.getQualification());
			System.out.println("Certificate Year: " + student.getCertificate().getYear());
			System.out.println(
					"College: " + student.getCollege().getCollegeName() + " " + student.getCollege().getLocation());
			break;
		}
		case 2: {
			System.out.println("Enter the Id of Student for details");
			int x = s.nextInt();
			placement = pl.searchPlacement(x);
			System.out.println(placement.getCollege().getCollegeName() + " " + placement.getCollege().getLocation());
			break;
		}
		case 3: {
			System.out.println("Enter the Id of Student for details");
			int x = s.nextInt();
			college = cl.searchCollege(x);
			System.out.println(college.getCollegeName());
			break;
		}
		case 4: {
			System.out.println("Enter the Id of Student for details");
			int x = s.nextInt();
			certificate = cr.searchCertificate(x);
			System.out.println(certificate.getYear());
			break;
		}
		default:
			System.out.println("Enetr valid Option");
		}
	}
}
