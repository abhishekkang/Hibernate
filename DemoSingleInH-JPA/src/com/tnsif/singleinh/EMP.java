package com.tnsif.singleinh;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity // POJO plain old java object (or) model class
@Table(name = "emp")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // mention only in parent class

@DiscriminatorColumn(name = "emp_type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("EMP")
public class EMP {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	private String empname;
	private double salary;
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}