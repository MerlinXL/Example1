package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Displays Hello World
 */
public class Class1 {
	/**
	 * something
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");

		Car car1 = new Car();
		/*
		 * Dim car1 as new car
		 */
		car1.speedup(70);
		car1.applyBrake(20);
		System.out.println(car1.getSpeed());
		
		car1.setGear(3);
		int intGear =car1.getGear();
		System.out.println("Gear = " + intGear);
		
		int i = 5;
		double d = 100;
		int x = (int) d;
		
		
		for (int j = 0; j < 100; j++) {
			System.out.println(j);
		}
		
		int result = Maths.factorial(6);
		System.out.println(result);
		
		
		String quote ="The quick brown fox";
		
				
				
		Email email1 = new Email("simon@merlinxl.com","mat@merlinxl.com","Hello World");
		
		System.out.println("Mail character length = " + email1.charactersInMessage());
	}
}
