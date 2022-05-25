package com.cg.placement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "User")
public class User {
	@Id
	@Column(name = "User_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int User_id;
	@OneToOne(mappedBy= "collegeAdmin" ,cascade = CascadeType.ALL)
	private College collegeAdmin;
	private String name;
	private String type;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(
            name = "Admin_Id",
            referencedColumnName = "admin_id")
	private Admin admin;

	
	

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		User_id = user_id;
	}

	public College getCollegeAdmin() {
		return collegeAdmin;
	}

	public void setCollegeAdmin(College collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


	
}
