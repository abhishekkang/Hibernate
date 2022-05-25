package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.Student;

public interface IStudentService {
	public Student addStudent(Student student);

	public Student updateStudent(Student student);

	public Student searchStudentById(int id);

	public Student searchStudentByHallTicket(int id);

	void deleteStudent(int id);

	public Certificate addCertificate(Certificate certificate);

	public Certificate updateCertificate(Certificate certificate);
}