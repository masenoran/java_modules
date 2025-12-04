package com.bpi.javatraining.main;

public class M2_Exercise1 {
	public static void main(String[] args) {
		Car carA = new Car();		
		Car carB = new Car("BYD", "Sealion 6", "Gray", 2025);
		
		carA.setMake("Nissan");
		carA.setModel("Almera");
		carA.setColor("Black");
		carA.setYear(2018);
		
		carA.returnCarDetails();
		carB.returnCarDetails();
	}	
}