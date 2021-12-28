package com.c022;

public class YellowState extends AccountState{
	public YellowState(AccountState state){
		this.acc=state.acc;
		this.blance=state.getBlance();
		this.stateName="余额报警！";
	}
	public void checkState(double blance){
		if(blance>=0){
			acc.setState(new GreenState(this));
		}else if(blance<-1000){
			acc.setState(new RedState(this));
		}
	}
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
}
