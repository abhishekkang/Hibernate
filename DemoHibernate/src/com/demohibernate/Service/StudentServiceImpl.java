package com.demohibernate.Service;

import com.demohibernate.dao.StudentDao;
import com.demohibernate.dao.StudentDaoImpl;
import com.demohibernate.entities.student;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao;

	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public void addStudent(student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void updateStudent(student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void removeStudent(student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}

	@Override
	public student findStudentById(int id) {
		// no need of transaction, as it's an read operation
		student student = dao.getStudentById(id);
		return student;
	}
}
