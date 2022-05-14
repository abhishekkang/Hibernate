package com.demohibernate.Service;

import com.demohibernate.entities.student;

public interface StudentService {
	public abstract void addStudent(student student);

	public abstract void updateStudent(student student);

	public abstract void removeStudent(student student);

	public abstract student findStudentById(int id);
}
