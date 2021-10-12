package com.qa.garage;

public class bike extends Vehicle{

	String bikeID;
	String exhaustType;
	
	
	public bike(String make, String model, int productionYear, String bikeID, String exhaustType) {
		super(make, model, productionYear);
		this.bikeID = bikeID;
		this.exhaustType = exhaustType;
	}


	@Override
	public String toString() {
		return "bike [bikeID=" + bikeID + ", exhaustType=" + exhaustType + ", make=" + make + ", model=" + model
				+ ", productionYear=" + productionYear + "]";
	}
	

	
}
