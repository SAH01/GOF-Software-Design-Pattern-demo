package com.c023;

public class Train implements Way {
	@Override
	public void myWay( int choice) {
		if (choice==2){
			System.out.println("选择乘火车出行");
		}
	}
}
