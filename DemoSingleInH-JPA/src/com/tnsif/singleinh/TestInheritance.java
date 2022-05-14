package com.tnsif.singleinh;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestInheritance {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fac.createEntityManager();
		em.getTransaction().begin();

		EMP emp = new EMP();
		emp.setEmpname("Abhishek");
		emp.setSalary(100000);
		em.persist(emp);

		Manager mgr = new Manager();
		mgr.setEmpname("Kang");
		mgr.setSalary(100000);
		mgr.setDeptname("Tech");
		em.persist(mgr);

		em.getTransaction().commit();

		System.out.println("added one emp and mgr");

		em.close();
		fac.close();
	}
}
