package com.weekone;

public class BETAlabs {

	public static void main(String[] args) {
		int seats = 10; //flights left on plane
		double groceries = 54.89; //cost of groceries
		char midInitial = 'A'; //middle name initial
		boolean hotweather = true; //if not hot outside, then cold outside
		String customer = "Jack"; //customer's name
		String address = "123  Main St"; // street address
		
		System.out.println(seats + " available seats");
		System.out.println("Cost of groceries: " + groceries + "$");
		System.out.println("Middle Initial: " + midInitial);
		System.out.println("The weather is hot - " + hotweather);
		System.out.println("The first name is " + customer);
		System.out.println("Address: " + address);

		seats = seats -= 2;
		System.out.println(seats + " available seats");
		groceries = groceries += 2.15;
		System.out.println("New cost: " + groceries + "$");
		midInitial = 'K';
		System.out.println("Corrected initial: " + midInitial);
		hotweather = false;
		//hotweather = !hotweather; adding ! makes it the opposite
		System.out.println("The weather is hot - " + hotweather);
		String fullName = "Jack K Liam";
		System.out.println("Hi, my name is " + fullName + "." + " I live at " + address + ".");
		
		
		
	}
}
