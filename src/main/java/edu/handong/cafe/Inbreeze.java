package edu.handong.cafe;

public class Inbreeze extends Cafe implements IRestaurant {
	
	public Inbreeze() {
		System.out.println("Welcome to Inbreeze!!!");
	}

	public void handOverFood() {
		System.out.println("This is the food you ordered!");
	}
	
}
