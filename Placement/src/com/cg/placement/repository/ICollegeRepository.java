package com.cg.placement.repository;


import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;

public interface ICollegeRepository {
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(int id);
	void deleteCollege(int id);
	public College schedulePlacement(Placement placement);
	


	public abstract void beginTransaction();
	public abstract void commitTrasaction();
}
