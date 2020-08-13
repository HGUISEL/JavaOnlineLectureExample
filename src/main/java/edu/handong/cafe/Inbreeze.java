package edu.handong.cafe;

import edu.handong.cafe.person.Chef;

public class Inbreeze extends Cafe implements IRestaurant {
	private Chef chef;
	
	public Inbreeze() {
		System.out.println("Welcome to Inbreeze!!!");
		this.chef = new Chef();
	}
	
	public void givePoint() {
		System.out.println("Points for Inbreeze have been accumulated.");
	}
	public void handOverFood() {
		System.out.println("This is the food you ordered!");
	}
	public void showMenu() {
		super.showMenu();
		System.out.println("Restaurant Menu");
		System.out.println("6. Cream Pasta");
		System.out.println("7. Tomato pasta");
		System.out.println("8. Cream risotto");
		System.out.println("9. Tomato risotto");
		System.out.println("10. Salad\n");
		
	}
	public void cook() {
		chef.cook();
	}
	
}
