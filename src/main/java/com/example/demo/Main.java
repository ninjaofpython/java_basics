package com.example.demo;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		// Primitive types
		byte myAge = 43;
		long viewsCount = 3_123_456_789L;
		float price = 10.99F;
		char letter = 'A';
		boolean isEligible = true;
		// Reference types/ Complex types you have to allocate memory 
		// for the variable.  The JVM will automatically release the variable.
		// Complex has members, what's a member.
		// What's a name space
		Date now = new Date();
		System.out.println(now);
		now.getTime();
		System.out.println("The time is: " + now.getTime() + " " + now);
	}
}
