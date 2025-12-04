package com.bpi.helloworld.main;
import java.util.Scanner;

public class HelloMain {

    public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 50; i++){
			sum += i;
		}
		
		System.out.println("Sum of number 1-50: " + sum);
	}
}