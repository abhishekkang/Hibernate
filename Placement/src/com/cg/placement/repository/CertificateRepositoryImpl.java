package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Certificate;

public class CertificateRepositoryImpl implements ICertificateRepository {

	// Step 1: Start JPA LifeCycle
	private EntityManager entityManager;

	public CertificateRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	// Next step implement methods
	@Override
	public Certificate addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		return certificate;
	}

	// Next step
	@Override
	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate = entityManager.find(Certificate.class, id);
		return certificate;
	}

	@Override
	public void deleteCertificate(int id) {
		
		Certificate certificate = entityManager.find(Certificate.class, id);
		entityManager.remove(certificate);
		
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