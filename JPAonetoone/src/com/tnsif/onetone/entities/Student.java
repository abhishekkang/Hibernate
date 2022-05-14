package com.tnsif.onetone.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int sid;
	private String sname;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address_id;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Address getSaddress_id() {
		return address_id;
	}

	public void setSaddress_id(Address saddress_id) {
		this.address_id = saddress_id;
	}
	
	
	
	
	
}