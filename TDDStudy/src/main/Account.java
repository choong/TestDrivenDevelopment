package main;

public class Account {

	private int balacne;
	
	public Account(int money) {
		this.balacne = money;
	}
	
	public int getBalance() {
		
		return this.balacne;
	}

	public void deposit(int money) {
		this.balacne += money;
		
	}

	public void withdraw(int money) {
		this.balacne -= money;
		
	}

}
