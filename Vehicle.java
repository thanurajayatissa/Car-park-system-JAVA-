package com.car_park_management;

//Prepared by EN19379616


import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public abstract class Vehicle {
	
	//variables to store common data of a vehicle
	public String VehicleType;
	public String NumberPlate;
	public String VehicleBrand;
	public String Entry_dateTime;
	
	
	public abstract String getVehicleType();
	
	public abstract void setVehicleType(String VehicleType);
	
	public abstract String getNumberPlate();
	
	public abstract void setNumberPlate(String NumberPlate);
	
	public abstract String getVehicleBrand();
	
	public abstract void setVehicleBrand(String VehicleBrand);
	
	public abstract String getDateTime();
	
	public void setDateTime() {
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now(); 
	   this.Entry_dateTime=dtf.format(now);
	  
	   }
	
	@Override
	
	public String toString()   {
		return Entry_dateTime+"/"+getNumberPlate()+"/"+getVehicleBrand();
	}
	
	
	
	

}
