package com.c022;

public abstract class AccountState {
	protected Account acc;
	protected double blance;
	protected String stateName;
	public abstract void checkState(double blance);
	public void deposit(double amount){
		this.blance+=amount;
		checkState(this.blance);
		System.out.printf(acc.getOwner()+"存"+amount+"元 | 余额"+this.blance+"元 | 状态:"+acc.getState().getStateName()+"\n");
	}

	public void withdraw(double amount){
		this.blance-=amount;
		checkState(this.blance);
		System.out.printf(acc.getOwner()+"取"+amount+"元 | 余额"+this.blance+"元 | 状态:"+acc.getState().getStateName()+"\n");
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public double getBlance() {
		return blance;
	}

	public void setBlance(double blance) {
		this.blance = blance;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
}
