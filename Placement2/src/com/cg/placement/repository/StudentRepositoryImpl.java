package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.Student;

public class StudentRepositoryImpl implements IStudentRepository {

	// Step 1: Start JPA LifeCycle
	private EntityManager entityManager;

	public StudentRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	// Create operation - Repo/DAO
	@Override
	public Student addStudent(Student student) {
		entityManager.persist(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		entityManager.merge(student);
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int hallTicketNo) {
		Student student = entityManager.find(Student.class, hallTicketNo);
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		Student student = entityManager.find(Student.class, id);
		entityManager.remove(student);
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
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