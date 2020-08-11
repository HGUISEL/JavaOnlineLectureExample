package edu.handong.cafe;
import edu.handong.cafe.person.Barister;
import edu.handong.cafe.person.Cashier;


public class Cafe {
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
		
	}
	public void takeOrder() {
		cashier.
		
	}
	public void recieveMoney() {
		
	}
	public void makeDrink() {
		
	}
	public void makeBread() {
		
	}

}
