package com.c021;

public class Observer {
	private String name;
	public Observer(String name) {
		this.name = name;
	}
	public void update(Stock s){
		if(s.getStockState().equals("0.05")){
			System.out.println("股票上涨"+s.getStockState()+"! "+"股民"+this.name+"要买入"+s.getName());
		}
		else{
			System.out.println("股票大跌! "+"股民"+this.name+"大哭一场");
		}
	}
}
