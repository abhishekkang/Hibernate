package com.cg.placement.service;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;


public interface ICollegeService {
public College addCollege(College college);
public College updateCollege(College college);
public College searchCollege(int id);
void deleteCollege(int id);
public College schedulePlacement(Placement placement);

}
