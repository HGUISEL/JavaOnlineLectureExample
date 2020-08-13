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
		System.out.println("You can choose from these");
		System.out.println("1. Ice-coffee / 2. Hot-coffee / 3. fruit juice / ... ");
	}
	public void takeOrder() {
		
		cashier.takeOrder();
		
	}
	public void recieveMoney() {
		
		cashier.recieveMoney();
		
	}
	public void makeDrink() {
		
		barista.makeDrink("drink menu");
		
	}

}
