package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;

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
	public void deleteCollege(int id) {
		College college = entityManager.find(College.class, id);
		entityManager.remove(college);
	}
	@Override
	public College schedulePlacement(Placement placement) {
		College college = entityManager.find(College.class, placement);
		return college;
	}


	@Override
	public College searchCollege(int id) {
		College college = entityManager.find(College.class, id);
		return college;
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
