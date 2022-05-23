package com.cg.placement.service;

import com.cg.placement.entities.Placement;

public interface IPlacementService {

	public Placement addPlacement(Placement placement);

	public Placement updatePlacement(Placement placement);

	public Placement searchPlacement(int id);

	void cancelPlacement(int id);
}
