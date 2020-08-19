package edu.handong.cafe.person;

public class Chef extends Human{
	public Chef(String name, int age) {
		super(name, age);
	}
	
	public Chef() {
		super("unName", 0);
	}
	
	public void cook() {
		System.out.println("Chef is cooking!");
		System.out.println("please waiting for a sec ...");
		
		try {
		      Thread.sleep(5000);
		} catch (InterruptedException e) { 
			
		}		
		System.out.println("  Chef : done!!! Here is the drink you ordered~\\n");	
	}
	
}
