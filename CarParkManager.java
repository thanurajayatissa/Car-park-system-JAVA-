package com.car_park_management;

//Prepared by EN19379616 

public interface CarParkManager {
	
	final int totalVehicleSlots = 20;
	boolean vehicleEntered();
	void vehicleLeft();
	int getNumEmptySlots();
	int getNumOccupiedSlots();
	
	
	

}
