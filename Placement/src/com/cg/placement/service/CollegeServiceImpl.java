package com.cg.placement.service;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.repository.CollegeRepositoryImpl;
import com.cg.placement.repository.ICollegeRepository;

public class CollegeServiceImpl implements ICollegeService {
	private ICollegeRepository dao;

	public CollegeServiceImpl() {
		dao = new CollegeRepositoryImpl();
	}

	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTrasaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTrasaction();
		return college;
	}

	@Override
	public College searchCollege(int id) {
		College college = dao.searchCollege(id);
		return college;
	}

	@Override
	public void deleteCollege(int id) {
		dao.beginTransaction();
		dao.deleteCollege(id);
		dao.commitTrasaction();

		
	}

	@Override
	public College schedulePlacement(Placement placement) {
		dao.beginTransaction();
		dao.schedulePlacement(placement);
		dao.commitTrasaction();
		return addCollege(null);
	}

}
