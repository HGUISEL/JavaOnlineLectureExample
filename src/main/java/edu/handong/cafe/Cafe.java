package edu.handong.cafe;

import edu.handong.cafe.person.Barister;
import edu.handong.cafe.person.Cashier;

public class Cafe implements ICafe{
	protected Barister barista;
	protected Cashier cashier;
	protected int numberOfSits;
	
	public Cafe(int numberOfSits){
		this.barista = new Barister();
		this.cashier = new Cashier();
		this.numberOfSits = numberOfSits;
	}
	
	public Cafe() {
		this.barista = new Barister();
		this.cashier = new Cashier();
		this.numberOfSits = 0;
	}
	
	public void showMenu() {
		System.out.println("\nYou can choose from these");
		System.out.println("1. Ice-coffee \n2. Hot-coffee \n3. fruit juice  \n4. Ice-tea \n5. Smoothie\n");
	}
	
	public void takeOrder() {
		cashier.takeOrder();
	}
	
	public void recieveMoney() {
		cashier.recieveMoney();
	}
	
	public void makeDrink(int menu) {  
		barista.makeDrink(menu);
	}
}
