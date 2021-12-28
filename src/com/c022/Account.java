package com.c022;

public class Account {
	private AccountState state;
	private String owner;
	public Account(String owner){
		this.owner=owner;
		this.state=new GreenState(this);
		System.out.printf(this.owner+"已成功开户!");
		System.out.printf("\n");
		System.out.printf("--------------------------------------------------\n");
	}

	public AccountState getState() {
		return state;
	}

	public void setState(AccountState state) {
		this.state = state;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void deposit(double amount){
		state.deposit(amount);
	}
	public void withdraw(double amount){
		state.withdraw(amount);
	}
}
