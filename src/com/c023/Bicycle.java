package com.c023;

public class Bicycle implements Way {
	@Override
	public void myWay( int choice) {
		if(choice==3)
		{
			System.out.println("选择骑自行车出行！");
		}
	}
}
