package com.cg.placement.client;

import java.util.Scanner;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.User;
import com.cg.placement.service.IUserService;
import com.cg.placement.service.UserServiceImpl;

public class DeletePLacement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		/*Admin admin = new Admin(); // object for class Admin
		
		//System.out.println("Enter Name");
		//String name= s.nextLine();
		//admin.setName(name);
		System.out.println("Enter the Id to access database");
		admin.setAdmin_id(s.nextInt()) ;
		System.out.println("Enter Password");
		String Password = s.next();
		admin.setPassword(Password);
		
		//User user = new User();  object for class User*/
		IUserService us = new UserServiceImpl(); // object for calling the JPACRUD operations in User
		
		System.out.println("Enter the Id you want to Delete");
		int x = s.nextInt();
		us.deleteUser(x);
		System.out.println("Deletion operation is done" );
		
		
	}
}
