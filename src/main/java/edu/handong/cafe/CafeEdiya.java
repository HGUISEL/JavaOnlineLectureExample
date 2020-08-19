package edu.handong.cafe;

import edu.handong.cafe.person.Barister;

public class CafeEdiya extends Cafe {
	private Barister secondBarista;
	
	public CafeEdiya() {
		System.out.println("\nWelcome to Ediya!!!");
		barista.setName("Ediya Staff");
		barista.setAge(25);
		secondBarista.setName("Ediya Assistant");
		secondBarista.setAge(23);
	}
	
	public void givePoint() {
		System.out.println("Points for Ediya have been accumulated.");
	}
	
}
