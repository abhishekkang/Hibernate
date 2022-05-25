package com.cg.placement.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "College")
public class College implements Serializable {
	private static final long serialVersionUID = 1L; 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int College_id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(
            name = "User_Id",
            referencedColumnName = "User_id")
	private User collegeAdmin;
	private String collegeName;
	private String location;
	
	
	

	

	@OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
	private Set<Student> student = new HashSet<>();
	@OneToMany(mappedBy = "college",cascade = CascadeType.ALL)
	private Set<Certificate> certificate = new HashSet<>();
	@OneToMany(mappedBy = "college",cascade = CascadeType.ALL)
	private Set<Placement> placement = new HashSet<>();
	public int getId() {
		return College_id;
	}

	

	public void setCollege_id(int college_id) {
		College_id = college_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public User getCollegeAdmin() {
		return collegeAdmin;
	}

	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public Set<Certificate> getCertificate() {
		return certificate;
	}

	public void setCertificate(Set<Certificate> certificate) {
		this.certificate = certificate;
	}

	public Set<Placement> getPlacement() {
		return placement;
	}

	public void setPlacement(Set<Placement> placement) {
		this.placement = placement;
	}


}
