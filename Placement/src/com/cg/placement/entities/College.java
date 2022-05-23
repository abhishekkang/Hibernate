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
	private int clid;
	@OneToOne
	@JoinColumn(
            name = "user_Id",
            referencedColumnName = "uid")
	private User User;
	private String collegAdmin;
	private String collegeName;
	private String location;
	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

	@OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
	private Set<Student> student = new HashSet<>();
	@OneToMany(mappedBy = "college")
	private Set<Certificate> certificate = new HashSet<>();
	@OneToMany(mappedBy = "college")
	private Set<Placement> placement = new HashSet<>();
	public int getId() {
		return clid;
	}

	public void setId(int id) {
		this.clid = id;
	}

	public String getCollegAdmin() {
		return collegAdmin;
	}

	public void setCollegAdmin(String collegAdmin) {
		this.collegAdmin = collegAdmin;
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
