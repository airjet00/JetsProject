package com.skilldistillery.jets;

public class CargoPlans extends Jet implements CargoCarrier{
    
	public CargoPlans(String model, double speed, int range, long price){
    	super(model, speed, range, price);
    }
    public void loadCargo(){
        System.out.println("Cargo is combat loaded and ready for flight.");
    }
}
