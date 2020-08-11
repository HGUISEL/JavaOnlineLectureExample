package edu.handong.cafe.person;

public class Barister extends Human {

	public Barister(String name, int age) {
		super(name, age);
	}
	
	public Barister() {
		super("unName", 0);
	}
	
	public void makeDrink(String menu) {
		System.out.println("Barister is making the " + menu);
		try {
		      Thread.sleep(5000);
		} catch (InterruptedException e) { 
			
		}		
		System.out.println("Barister : done!!! ");	
	}

	public void cleanCafe() {
		System.out.println("Barister is cleaning the Cafe");
	}

}
