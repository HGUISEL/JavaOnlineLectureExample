package edu.handong.cafe.person;

public class Cook extends Human{
	public Cook(String name, int age) {
		super(name, age);
	}
	
	public Cook() {
		super("unName", 0);
	}
	
	public void cook() {
		System.out.println("Cook is cooking!");
		try {
		      Thread.sleep(5000);
		} catch (InterruptedException e) { 
			
		}		
		System.out.println("Cook : done!!! ");	
	}
	public void washDish() {
		System.out.println("Cook wash the dish!");	
	}
	
}
