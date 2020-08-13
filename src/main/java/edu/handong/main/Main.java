package edu.handong.main;

import edu.handong.cafe.*;
import edu.handong.cafe.person.*;

public class Main {
	public static final int EDIYA = 1;
	public static final int HISBEANS = 2;
	public static final int ROBOT = 3;
	public static final int VENDINGMACHINE = 4;
	public static final int INBREEZE = 5;

	public static void main(String args[]) {
		Customer customer = new Customer();
		Barister barister;
		Chef chef;
		Cashier cashier;
		
		showCafeList();
		int cafeType = customer.chooseCafe();
		
		switch(cafeType) {
			case EDIYA:
				Cafe ediya = new CafeEdiya();
				break;
			case HISBEANS:
				CafeHisBeans hisBeans = new CafeHisBeans();
				break;
			case ROBOT:
				CafeRobot robot = new CafeRobot();
				break;
			case VENDINGMACHINE:
				CafeVendingMachine vendingMachine = new CafeVendingMachine();
				break;
			case INBREEZE:
				Inbreeze inbreeze = new Inbreeze();
				break;
			default:
				System.out.println("There is no Cafe !!");
		}
		
	}
	
	
	 public static void showCafeList() {
		System.out.println("\n^0^ Cafe List ^0^");
		System.out.println("1. Ediya");
		System.out.println("2. HisBeans");
		System.out.println("3. Robot ");
		System.out.println("4. VendingMachine");
		System.out.println("5. Inbreeze ");
	}

}
