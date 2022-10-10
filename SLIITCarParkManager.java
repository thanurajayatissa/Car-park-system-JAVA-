package com.car_park_management;

//prepared by EN19379616

import java.util.ArrayList;

import java.util.*;



public class SLIITCarParkManager implements CarParkManager {
	
	
	static boolean vacant_slots = false; 
	
	Scanner sc = new Scanner(System.in);
	
	static int Number_of_empty_slots = totalVehicleSlots;
	String L_NPlate;
	 ArrayList<Vehicle> Vehicles = new ArrayList<>();
	
	 
	 Vehicle newVehicle;
  
	
	
	public void displayMenu() 
	//Initial menu displaying
	{
		System.out.println();
		System.out.println();
		System.out.println("Enter 1 to enter the main menu:");
		int Return_to_menu=sc.nextInt();
		
		if(Return_to_menu == 1)
		{
		
		
		
		sc = new Scanner(System.in);
		int selectedoption;
		
		
		
		System.out.println("**************************************************");
		System.out.println();
		System.out.println();
		
		System.out.println("1. Enter new vehicle to the park");
		System.out.println("2. Leave a vehicle from the park");
		System.out.println("3. To display list of vehicles currently parked");
		System.out.println("4. Number of occupied slots at present");
		System.out.println("5. Number of empty slots at present"); 
		System.out.println();
		System.out.println();
		System.out.println("**************************************************");
		
		System.out.print("Please enter your option:");
        selectedoption = sc.nextInt();
        
        switch (selectedoption) { //select the service
        case 1:
        	this.addVehicle(vehicleEntered());
        	break;
        case 2:
        	this.vehicleLeft();
        	break;
        case 3:
        	
        	this.vehicleList();
        	break;
        case 4:
        	
        	System.out.println("Occupied Slots:"+this.getNumOccupiedSlots());
        	
        	break;
        case 5:
        	System.out.println("Empty Slots:"+this.getNumEmptySlots());
        	        	
        	break;
        case 0:
        	System.exit(0);
        	
        }

        displayMenu();
		
		}
	}
	
 public boolean vehicleEntered() { // checking vacant slots availability
	if (Number_of_empty_slots > 0 )
	{vacant_slots = true;}
	return vacant_slots;
	
}
 
 void vehicleAdd(Vehicle v) {
	
	 
	 Vehicles.add(v);}
public void addVehicle(boolean vacantVlots){ // Adding vehicle
if(vacantVlots) 
{
	Number_of_empty_slots--                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ;
	 System.out.println("\t 1 - Car");
     System.out.println("\t 2 - Van");
     System.out.println("\t 3 - ThreeWheeler");
     
     System.out.print("Select the type of the vehicle:");
     
    int selectedVehicleType = sc.nextInt();
     
   
     
     switch (selectedVehicleType) {  //vehicle type selection
     case 1:
    	 Car car = new Car();
    	 car.setVehicleType("Car");
    	 
    	 System.out.println("\n\t**** A car entered the park****  ");
    	 
    	 System.out.println("\nEnter the Number Plate number of the Car:");
    	 car.setNumberPlate(sc.next());
    	 
    	 System.out.println("Enter the Brand of the Car:");
    	 car.setVehicleBrand(sc.next());
    	 
    	 System.out.println("Enter the number of Doors of the Car:");
    	 car.setNumberofDoors(sc.nextInt());
    	 
    	 System.out.println("Enter the Color of the Car:");
    	 car.setcarColour(sc.next());
    	 
    	  car.setDateTime();
    	
    	  	 newVehicle=car;
    	  
    	
    	 break;
    
     case 2:
    	 Van van = new Van();
    	 van.setVehicleType("Van");
    	 
    	 System.out.println("\n\t****A van entered the park****");
    	 
    	 System.out.println("\nEnter the Number Plate number of the Van:");
    	 van.setNumberPlate(sc.next());
    	 
    	 System.out.println("Enter the Brand of the Van:");
    	 van.setVehicleBrand(sc.next());
    	 
    	 System.out.println("Enter the number of seats in the van:");
    	 van.setNumberofSeats(sc.nextInt());
    	
    	 van.setDateTime();
    	
      	newVehicle=van;
      	   
      	 
    	 
    	 break;
    	 
     case 3:
    	 ThreeWheeler threewheeler = new ThreeWheeler();
    	 threewheeler.setVehicleType("ThreeWheeler");
    	 
    	 System.out.println("\n\t****A ThreeWheeler entered the park **** ");
    	 
    	 System.out.println("\nEnter the Number Plate number of the ThreeWheeler:");
    	 threewheeler.setNumberPlate(sc.next());
    	 
    	 System.out.println("Enter the Brand of the ThreeWheeler:");
    	 threewheeler.setVehicleBrand(sc.next());
    	 
    	 System.out.println("Hiring status of the ThreeWheeler:");
    	 threewheeler.setHiringStatus(sc.nextBoolean());
    	  
    	 threewheeler.setDateTime();
    	 
    	 
      	   
      	newVehicle=threewheeler;
   	  break;
    	 
     }
     
     Vehicles.add(newVehicle);

     
}
else
{System.out.println("No available slots");}

displayMenu();
}




public void vehicleList(){ // Displaying the vehicle list
	
	for(Vehicle i: Vehicles) {
		System.out.println();
	System.out.print(" Vehicle:"+i.VehicleType);
	System.out.print(" Number Plate:"+i.NumberPlate);
	System.out.print(" Vehicle Brand:"+i.VehicleBrand);
	System.out.print(" Date Time:"+i.Entry_dateTime);
	}

}
public int getNumOccupiedSlots(){return (totalVehicleSlots-Number_of_empty_slots);}
public int getNumEmptySlots(){ return Number_of_empty_slots;}






public void vehicleLeft(){   // Vehicle leaving from the park
	System.out.println("\nEnter the Number Plate number of the leaving vehicle:");
	L_NPlate=sc.next();
	
	int flag=0;
	for(Vehicle i: Vehicles) {
		//System.out.println(i.NumberPlate);
		String NP=i.NumberPlate;
		if(L_NPlate.equalsIgnoreCase(NP)) {
			System.out.println("****One vehicle Left****");
			Vehicles.remove(i);
			flag=1;
			break;
		}}
	
		if(flag==0) {
			System.out.println("!!There is no such a entry please try again with correct number plate!!");
			
		}
	
	
		
     Number_of_empty_slots++;
     
     displayMenu();
	
	
}

	
}




