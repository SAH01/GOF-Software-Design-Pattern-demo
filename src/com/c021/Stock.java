package com.c021;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<Observer> observers = new ArrayList<Observer>();
	private String action;
	private String name;
	public Stock(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void Attach(Observer observer) {
		observers.add(observer);
	}

	public void Detch(Observer observer) {
		observers.remove(observer);
	}

	public void Notify() {
		for(Observer o : observers){
			o.update(this);
		}
	}
	public String getStockState() {
		return this.action;
	}

	public void setStockState(String action) {
		this.action=action;
	}
}
