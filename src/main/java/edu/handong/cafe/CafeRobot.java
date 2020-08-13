package edu.handong.cafe;

public class CafeRobot extends Cafe implements IUnmannedCafe {
	
	public CafeRobot() {
		System.out.println("Hello, Human.");
	}

	public void handOverDrink() {
		System.out.println("This is the drink you ordered!");
	}

}
