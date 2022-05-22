package com.cg.placement.repository;


import com.cg.placement.entites.College;

public interface ICollegeRepository {
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(int id);
	public  boolean deleteCollege(int id);
	


	public abstract void beginTransaction();
	public abstract void commitTrasaction();
}
