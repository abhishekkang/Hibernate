package com.cg.placement.service;

import com.cg.placement.entities.User;

public interface IUserService {
	public User addNewUser(User user);

	public User updateNewUser(User user);
	void deleteUser(int id);

	public User login(User user);

	public boolean logout();

}
