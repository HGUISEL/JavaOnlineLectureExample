package edu.handong.cafe.person;

public class Cashier extends Human {
	
	public Cashier(String name, int age) {
		super(name, age);
	}
	
	public Cashier() {
		super("unName", 0);
	}
	
	public void takeOrder() {
		System.out.println("Cashier take order from customer. ");
		System.out.println("Cashier : Do you want to oder?? ");
	}
	public void recieveMoney() {
		System.out.println("Cashier recieve money from customer. ");
		System.out.println("Cashier : Thank you for your odering!");
	}
	public void giveFinishSignal() {
		// Vibration bell or Oder Number paper
		System.out.println("Cashier give the customer the ability to confirm that their order has been served.");
		System.out.println("Here you are!");
	}
	

}

