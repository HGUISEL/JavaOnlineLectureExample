package edu.handong.cafe.person;
import java.util.Scanner;

public class Customer extends Human {
	
	public Customer(String name, int age) {
		super(name, age);
	}
	
	public Customer() {
		super("unName", 0);
	}
	
	public int orderMenu() {
		Scanner keyboard = new Scanner(System.in);
		int menuNum = 0;
		
		System.out.println("Please Input the Menu Number");
		System.out.print("Customer : Can I get a ");
		menuNum = keyboard.nextInt();
		
		return menuNum;
	}
	
	public void payMoney() {
		System.out.println("Customer pays the money!");
	}
	
}
