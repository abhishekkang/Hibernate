package com.cg.placement.client;

import com.cg.placement.entities.User;
import com.cg.placement.service.IUserService;
import com.cg.placement.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
	User us = new User();
	IUserService ussr = new UserServiceImpl();
	us.setId(100);
	us.setName("Abhishek");
	us.setPassword(null);
	us.setType("Student");
	ussr.addNewUser(us);
	
	

	}

}
