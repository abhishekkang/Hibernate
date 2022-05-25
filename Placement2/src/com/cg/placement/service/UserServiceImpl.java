package com.cg.placement.service;

import java.util.Scanner;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.User;
import com.cg.placement.repository.IUserRepository;
import com.cg.placement.repository.UserRepositoryImpl;

public class UserServiceImpl implements IUserService {
 private IUserRepository dao;
 Admin admin = new Admin();
	public UserServiceImpl() {
	dao = new UserRepositoryImpl();
}

	@Override
	public User addNewUser(User user) {
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public User updateNewUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public void deleteUser(int id) {
		dao.beginTransaction();
		dao.deleteUser(id);
		dao.commitTrasaction();
		
	}

	@Override
	public User login(User user) {
		if(admin.getAdmin_id()==user.getUser_id()&&admin.getPassword()==user.getPassword())
		{ dao.beginTransaction();
		Scanner a=new Scanner(System.in);
		/*System.out.println("Enter 1 for adding new user");
		System.out.println("Enter 2 for updating user");
		System.out.println("Enter 3 for deleting user");
		int x = a.nextInt(); ;
		switch(x){
		case 1: dao.addUser(user);
		 break;
		case 2: dao.updateUser(user);
		break;
		case 3:{*/ System.out.println("Enter the Id you Want to delete");
			int y = a.nextInt();
			dao.deleteUser(y);
		/*break;}
		default: System.out.println("Choose a valid option");
		}*/
		dao.commitTrasaction();
		return user;
		}
		else 
		{System.out.println("Invalid Id or Password");	
		return null;}
		
	}

	@Override
	public boolean logout() {
		return false;
	}


}
