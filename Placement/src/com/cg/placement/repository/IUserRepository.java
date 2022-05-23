package com.cg.placement.repository;

import com.cg.placement.entities.User;

public interface IUserRepository {
	public User addUser(User user);

	public User updateUser(User user);

	void deleteUser(int id);
	public User loginUser(User user);
	public boolean logOut();

	public abstract void beginTransaction();

	public abstract void commitTrasaction();
}
