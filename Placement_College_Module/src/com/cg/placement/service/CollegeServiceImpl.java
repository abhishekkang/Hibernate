package com.cg.placement.service;

import com.cg.placement.entites.College;
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
	public boolean deleteCollege(int id) {

		dao.deleteCollege(id);

		return false;
	}

	@Override
	public boolean schedulePlacement(String placement) {
		// TODO Auto-generated method stub
		return false;
	}

}
