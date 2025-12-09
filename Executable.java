package com.bpi.javatraining.main;

public abstract class Executable {
	void run() {
		System.out.println("Program is running!");
	}
	
	void stop() {
		System.out.println("Program has stopped!");
	}
}