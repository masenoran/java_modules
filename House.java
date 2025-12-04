package com.bpi.javatraining.main;

public class House {
	String houseAddress = "214 Bangkal, Makati City";
	int floorArea = 100;
	int lotArea = 100;

	void returnAddress() {
		System.out.print("The house address is " + houseAddress);
	}
		
	void returnHouseSize() {
		System.out.print("Floor Area is " + floorArea);
		System.out.print("Lot Area is " + lotArea);
	}
}
