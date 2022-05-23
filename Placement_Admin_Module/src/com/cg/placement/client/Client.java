package com.cg.placement.client;
import java.util.Scanner;

import com.cg.placement.entites.Admin;

public class Client {

	public static void  main (String[] args) {
		Admin admin = new Admin();
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name= s.nextLine();
		admin.setName(name);
		System.out.println("Enter ID");
		int x = s.nextInt();
		admin.setId(x);
		System.out.println("Enter Password");
		String Password = s.next();		
		admin.setPassword(Password);
		System.out.println(admin.getPassword()); 
	}
}
