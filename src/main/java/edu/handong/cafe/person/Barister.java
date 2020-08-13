package edu.handong.cafe.person;

public class Barister extends Human {

	public Barister(String name, int age) {
		super(name, age);
	}
	
	public Barister() {
		super("unName", 0);
	}
	
	public void makeDrink(int menu) {
		System.out.println("\nBarister is making the #" + menu + " menu. ");
		System.out.println("please waiting for a sec ...");
		try {
		      Thread.sleep(5000);
		} catch (InterruptedException e) { 
			
		}		
		System.out.println("  Barister : done!!! Here is the drink you ordered~\n");	
	}

	public void cleanCafe() {
		System.out.println("Barister is cleaning the Cafe");
	}

}
