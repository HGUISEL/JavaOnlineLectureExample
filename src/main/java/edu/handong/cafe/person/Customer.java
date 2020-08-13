package edu.handong.cafe.person;

import java.util.Scanner;

public class Customer extends Human {
	Scanner keyboard;
	
	public Customer() {
		this.keyboard = new Scanner(System.in);
		this.setName();
		this.setAge();
	}
	
	public void setName() {
		System.out.print("Enter Customer's Name :  ");
		String name = keyboard.next();
		super.setName(name);
		
	}

	public void setAge() {
		System.out.print("Enter Customer's age :  ");
		int age;
		
		try {
			age = keyboard.nextInt();
		}catch(Exception e) {
			System.out.println("Wrong Input");
			age = 0;
		}
		super.setAge(age);
	}
	
	public int chooseCafe() {
		System.out.print("Enter Cafe Name that you want go :  ");
		int cafeType;
		
		try {
			cafeType = keyboard.nextInt();
			return cafeType;
		}catch(Exception e) {
			System.out.println("Wrong Input");
			return 0;
		}	
	}
	
	public int orderMenu() {
		int menuNum = 0;
		
		System.out.println("Please Input the Menu Number");
		System.out.print("  Customer : Can I get a ");
		menuNum = keyboard.nextInt();
		
		return menuNum;
	}
	
	public void payMoney() {
		System.out.println("Customer pays the money!\n");
	}
	
}
