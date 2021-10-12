package com.qa.garage;

public class car extends Vehicle {

	int mileage;
	int maxSpeed;
	String fuelType;
	boolean turbo;
	
	
	public car(String make, String model, int productionYear, int mileage, int maxSpeed, String fuelType,boolean turbo) {
		super(make, model, productionYear);
		this.mileage = mileage;
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
		this.turbo=turbo;
	}


	@Override
	public String toString() {
		return "car [mileage=" + mileage + ", maxSpeed=" + maxSpeed + ", fuelType=" + fuelType + ", turbo=" + turbo
				+ "]";
	}
	
	
	
	
}
