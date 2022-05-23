package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
import com.cg.placement.repository.ICertificateRepository;
import com.cg.placement.repository.CertificateRepositoryImpl;

public class CertificateServiceImpl implements ICertificateService {

	// Step 1: Establishing connection between Service and Repo
	private ICertificateRepository dao;

	public CertificateServiceImpl() {
		dao = new CertificateRepositoryImpl();
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTrasaction();
		return certificate;
	}

	// Changes required
	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTrasaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		dao.beginTransaction();
		Certificate certificate = dao.searchCertificate(id);
		dao.commitTrasaction();
		return certificate;
	}

	@Override
	public void deleteCertificate(int id) {
		dao.beginTransaction();
		dao.deleteCertificate(id);
		dao.commitTrasaction();
		
	}

}