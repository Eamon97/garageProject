package com.qa.garage;

public class truck extends Vehicle {
	float height;
	float weight;
	String loadType;
	
	
	public truck(String make, String model, int productionYear, float height, float weight, String loadType) {
		super(make, model, productionYear);
		this.height = height;
		this.weight = weight;
		this.loadType = loadType;
	}


	@Override
	public String toString() {
		return "truck [height=" + height + ", weight=" + weight + ", loadType=" + loadType + ", make=" + make
				+ ", model=" + model + ", productionYear=" + productionYear + "]";
	}
	
	

}
