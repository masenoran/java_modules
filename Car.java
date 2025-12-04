package com.bpi.javatraining.main;

public class Car {
	private String make;
	private String model;
	private String color;
	private int year;
	
	public void returnCarDetails() {
		System.out.println("Car Details: " + color + " " + make + " " + model + " " + year);
	}
	
	//* no args
	public Car() {
		this.make = "Default";
		this.model = "Default";
		this.color = "Default";
		this.year = 0;
	}
	
	//* parameterized
	public Car(String make, String model, String color, int year) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}
	
	//* getter
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
		
	public String getColor() {
		return color;
	}
	
	public int getYear() {
		return year;
	}
		
	//* setter
	public void setMake(String make) {
		this.make = make;
	}
		
	public void setModel(String model) {
		this.model = model;
	}
		
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
