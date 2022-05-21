package com.cg.placement.client;

import java.time.LocalDate;

import com.cg.placement.entities.Placement;
import com.cg.placement.service.IPlacementService;
import com.cg.placement.service.PlacementServiceImpl;

public class Client {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		Placement placement = new Placement();
		IPlacementService service = new PlacementServiceImpl();

		placement.setId(100);
		placement.setName("Abhishek");
		placement.setCollege("RGGEC");
		placement.setDate(ld);
		placement.setQualification("Btech");
		placement.setYear(2022);
		service.addPlacement(placement);
		placement = service.searchPlacement(100);
		System.out.println(placement.getCollege());
		placement = service.searchPlacement(100);
		placement.setCollege("JNGEC");
		service.updatePlacement(placement);
		System.out.println("done");
		service.cancelPlacement(100);
		
		

	}

}
