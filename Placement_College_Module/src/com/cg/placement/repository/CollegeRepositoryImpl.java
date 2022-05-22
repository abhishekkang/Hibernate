package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entites.College;

public class CollegeRepositoryImpl implements ICollegeRepository {

	// Step 1: Start JPA LifeCycle
	private EntityManager entityManager;

	public CollegeRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public College addCollege(College college) {
		entityManager.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		entityManager.merge(college);
		return college;
	}

	@Override
	public College searchCollege(int id) {
		College college = entityManager.find(College.class, id);
		return college;
	}

	@Override
	public boolean deleteCollege(int id) {
		College college = entityManager.find(College.class, id);
		entityManager.remove(college);
		return false;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTrasaction() {
		entityManager.getTransaction().commit();

	}

}
