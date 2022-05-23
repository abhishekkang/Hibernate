package com.cg.placement.service;
import com.cg.placement.entities.Certificate;

public interface ICertificateService 
{
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(int id);
	 void deleteCertificate(int id);
	
	
}