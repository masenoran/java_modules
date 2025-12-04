package com.bpi.helloworld.main;
import java.util.Scanner;

public class HelloMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		
		System.out.println("What is your name?");
		
		name = scanner.nextLine();
		System.out.println("Hello " + name);
		
		scanner.close();
		
	}

}