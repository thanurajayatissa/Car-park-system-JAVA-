package com.car_park_management;

//Prepared by EN19379616

public class Van extends Vehicle{
	
	private int NumberofSeats;
	
	public int getNumberofSeats() {
		return NumberofSeats;
	}

	public void setNumberofSeats(int NumberofSeats) {
		this.NumberofSeats = NumberofSeats;
	}
	
     public String getVehicleType() {
    	 return VehicleType;
    	 }
	 
	 public void setVehicleType(String VehicleType) {
		 this.VehicleType = VehicleType;
		 }
	 
	 public String getNumberPlate() {
		 return NumberPlate;
		 }
	 
	 public void setNumberPlate(String NumberPlate) {
		 this.NumberPlate = NumberPlate;
		 }
	 
	 public String getVehicleBrand() {
		 return VehicleBrand;
		 }
	 
	 public void setVehicleBrand(String VehicleBrand) {
		 this.VehicleBrand = VehicleBrand;
		 }
	 
	 public String getDateTime() {
		 return Entry_dateTime;
		 }
	 
	 public void setDateTime(String Entry_dateTime) {
		 this.Entry_dateTime = Entry_dateTime;
		 }
	 
}

