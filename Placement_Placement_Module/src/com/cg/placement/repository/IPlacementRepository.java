package com.cg.placement.repository;

import com.cg.placement.entities.Placement;

public interface IPlacementRepository {
	public Placement addPlacement(Placement placement);

	public Placement updatePlacement(Placement placement);

	public Placement searchPlacement(int id);
	
	void cancelPlacement(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
