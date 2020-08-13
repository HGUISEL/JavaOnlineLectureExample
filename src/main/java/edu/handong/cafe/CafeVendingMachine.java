package edu.handong.cafe;

public class CafeVendingMachine extends Cafe implements IUnmannedCafe {
	
	public CafeVendingMachine() {
		System.out.println("This is vending machine.");
	}
	
	public void takeOrderByMachine() {
		System.out.println("Machine takes order from customer.");
	}
	public void recieveMoneyByMachine() {
		System.out.println("Machine recieved money from customer.\n");
	}
	public void handOverDrink(int menuNum) {
		System.out.println("Here is the drink #" + menuNum + " you ordered!");
	}

}
