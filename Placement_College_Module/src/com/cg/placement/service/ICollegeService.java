package com.cg.placement.service;

import com.cg.placement.entites.College;


public interface ICollegeService {
public College addCollege(College college);
public College updateCollege(College college);
public College searchCollege(int id);
public boolean deleteCollege(int id);
public boolean schedulePlacement(String placement);

}
