package com.demohibernate.dao;

import javax.persistence.EntityManager;

import com.demohibernate.entities.student;

public class StudentDaoImpl implements StudentDao {
	private EntityManager entityManager;

	public StudentDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public student getStudentById(int id) {
		student student = entityManager.find(student.class, id);
		return student;
	}

	@Override
	public void addStudent(student student) {
		entityManager.persist(student);
	}

	@Override
	public void removeStudent(student student) {
		entityManager.remove(student);
	}

	@Override
	public void updateStudent(student student) {
		entityManager.merge(student);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
