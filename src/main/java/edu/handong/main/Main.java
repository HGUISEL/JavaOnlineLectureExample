package edu.handong.main;

import edu.handong.cafe.*;
import edu.handong.cafe.person.*;

public class Main {
	public static final int EDIYA = 1;
	public static final int HISBEANS = 2;
	public static final int ROBOT = 3;
	public static final int VENDINGMACHINE = 4;
	public static final int INBREEZE = 5;
	public int menuNumber;

	public static void main(String args[]) {
		Main runner = new Main();
		runner.run(args);
	}
	
	public void run(String args[]) {
		Customer customer = new Customer();
		/*Barister barister;
		Chef chef;
		Cashier cashier;*/
		
		showCafeList();
		int cafeType = customer.chooseCafe();
		
		switch(cafeType) {
			case EDIYA:
				CafeEdiya ediya = new CafeEdiya();
				
				ediya.showMenu();  // show menu to customer
				ediya.takeOrder();  // cashier take order from customer
				menuNumber = customer.orderMenu();  // customer order menu
				customer.payMoney();  // customer pay money
				ediya.recieveMoney();  // cashier receive money from customer
				ediya.givePoint();  // save cafe Ediya point 
				ediya.makeDrink(menuNumber);  // barista make drink
				
				break;
				
			case HISBEANS:
				CafeHisBeans hisBeans = new CafeHisBeans();
				
				hisBeans.showMenu();  
				hisBeans.takeOrder();
				menuNumber = customer.orderMenu();
				customer.payMoney();
				hisBeans.recieveMoney();
				hisBeans.givePoint();
				hisBeans.makeDrink(menuNumber); 
				
				break;
				
			case ROBOT:
				CafeRobot robot = new CafeRobot();
				
				robot.showMenu();
				robot.takeOrderByMachine();
				menuNumber = customer.orderMenu();
				customer.payMoney();
				robot.recieveMoneyByMachine();
				robot.handOverDrink(menuNumber);
				
				break;
				
			case VENDINGMACHINE:
				CafeVendingMachine vendingMachine = new CafeVendingMachine();
				
				vendingMachine.showMenu();
				vendingMachine.takeOrderByMachine();
				menuNumber = customer.orderMenu();
				customer.payMoney();
				vendingMachine.recieveMoneyByMachine();
				vendingMachine.handOverDrink(menuNumber);
				
				break;
				
			case INBREEZE:
				Inbreeze inbreeze = new Inbreeze();
				
				inbreeze.showMenu();
				inbreeze.takeOrder();
				menuNumber = customer.orderMenu();
				customer.payMoney();
				inbreeze.recieveMoney();
				inbreeze.givePoint();
				if(menuNumber < 6) {
					inbreeze.makeDrink(menuNumber); 
				}else {
					inbreeze.cook();
				}
				
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
