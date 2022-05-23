package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.User;

public class UserRepositoryImpl implements IUserRepository {

	// Step 1: Start JPA LifeCycle
	private EntityManager entityManager;
	Admin admin = new Admin();

	public UserRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public User addUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public void deleteUser(int id) {
		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();

	}

	@Override
	public void commitTrasaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public User loginUser(User user) {
		
		if(admin.getName()==user.getName()&&admin.getPassword()==user.getPassword())
		{entityManager.getTransaction().begin();
		return user;}
		else return null;
	}

	@Override
	public boolean logOut() {
		entityManager.close();
		return false;// TODO Auto-generated method stub
		
	}

}
