package edu.handong.cafe;

public class Inbreeze extends Cafe implements IRestaurant {
	
	public Inbreeze() {
		System.out.println("Welcome to Inbreeze!!!");
	}
	
	public void givePoint() {
		System.out.println("Points for Inbreeze have been accumulated.");
	}
	public void handOverFood() {
		System.out.println("This is the food you ordered!");
	}
	
}
