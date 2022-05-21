package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Placement;

public class PlacementRepositoryImpl implements IPlacementRepository {
	// Step 1: Starting the lifecycle
	private EntityManager entityManager;

	public PlacementRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	// Create Operation
	@Override
	public Placement addPlacement(Placement placement) {
		entityManager.persist(placement);
		return placement;
	}

	// Update Operation
	@Override
	public Placement updatePlacement(Placement placement) {
		entityManager.merge(placement);
		return placement;
	}

	// Search Operation
	@Override
	public Placement searchPlacement(int id) {
		Placement placement = entityManager.find(Placement.class, id);
		return placement;
	}

	@Override
	public void cancelPlacement(int id) {
		Placement placement = entityManager.find(Placement.class, id);
		entityManager.remove(placement);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
