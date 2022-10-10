package com.car_park_management;

public class ThreeWheeler extends Vehicle {
	
	private boolean Hiringstatus;
	
	public boolean getHiringstatus() {
		return Hiringstatus;
	
	}
	
	public void setHiringStatus(boolean Hiringstatus) {
		this.Hiringstatus = Hiringstatus;
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
