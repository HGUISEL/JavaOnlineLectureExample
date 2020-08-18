package edu.handong.cafe;

public class CafeRobot extends Cafe implements IUnmannedCafe {
	
	public CafeRobot() {
		System.out.println("\nHello, Human. This is Cafe Robot.");
	}

	public void takeOrderByMachine() {
		System.out.println("Robot takes order from customer.");
	}
	public void recieveMoneyByMachine() {
		System.out.println("Robot recieved money from customer.\n");
	}
	public void handOverDrink(int menuNum) {
		System.out.println("Here is the drink #" + menuNum + " you ordered~");
	}
	
}
