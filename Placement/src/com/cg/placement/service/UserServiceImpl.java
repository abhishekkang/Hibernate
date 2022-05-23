package com.cg.placement.service;

import com.cg.placement.entities.User;
import com.cg.placement.repository.IUserRepository;
import com.cg.placement.repository.UserRepositoryImpl;

public class UserServiceImpl implements IUserService {
 private IUserRepository dao;
 
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
	public User login(User user) {
		dao.beginTransaction();
		dao.loginUser(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public boolean logout() {
		dao.beginTransaction();
		dao.logOut();
		dao.commitTrasaction();
		return false;
	}

}
