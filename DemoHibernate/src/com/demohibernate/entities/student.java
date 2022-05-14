package com.demohibernate.entities;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class student implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int StudentId;
	private String sname;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		this.StudentId = studentId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
