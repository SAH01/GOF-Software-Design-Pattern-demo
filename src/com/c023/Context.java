package com.c023;

public class Context {
	private Way way;
	public void getWay(int choice){
		way.myWay(choice);
	}
	public void setWay(Way way)
	{
		this.way=way;
	}
}
