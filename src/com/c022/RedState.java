package com.c022;
public class RedState extends AccountState{
	public RedState(AccountState state){
		this.acc=state.acc;
		this.blance=state.getBlance();
		this.stateName="余额不足!";
	}
	public void checkState(double blance){
		if(blance<0&&blance>=-1000){
			acc.setState(new YellowState(this));
		}else if(blance>=0){
			acc.setState(new GreenState(this));
		}
	}
	public void deposit(double amount){
		this.blance+=amount;
		checkState(this.blance);
		System.out.printf(acc.getOwner()+"存"+amount+"元 | 余额"+this.blance+"元 | 状态:"+acc.getState().getStateName()+"\n");
	}

	public void withdraw(double amount){
		checkState(this.blance);
		System.out.printf(acc.getOwner()+"取"+amount+"元 | 余额"+this.blance+"元 | 状态:"+acc.getState().getStateName()+"\n");
	}
}
