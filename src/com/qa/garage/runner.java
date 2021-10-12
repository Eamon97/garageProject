package com.qa.garage;

import java.util.ArrayList;

public class runner {

	public static void main(String[] args) {
		
		
		car bmw=new car("bmw", "m5", 2021, 3256, 189, "Petrol", true);
		car Mercedes=new car("Mercedes","e63", 2021, 1045, 185,"Petrol",true);
		car Audi=new car("Audi","RS6",2020,7433,203,"Diesel",true);
		
		bike Yamaha=new bike("Yamaha","Super sport" ,2017, "Zx800", "Dual pipes");
		bike Kawasaki=new bike("Kawasaki","Ninja",2016,"328p","singular");
		
		truck Volvo=new truck("Volvo","FM" ,2012,4.3f,1456.80f,"Stone and Marble");
		truck Ford=new truck("DAF", "N.V", 2020, 3.7f,1140f ,"Lighweight load");
		
		ArrayList<Vehicle> garage=new ArrayList<>();
		
		
		garage.add(Mercedes);
		garage.add(bmw);
		garage.add(Audi);
		garage.add(Ford);
		garage.add(Volvo);
		garage.add(Yamaha);
		garage.add(Kawasaki);
		
		
		
	}
}




