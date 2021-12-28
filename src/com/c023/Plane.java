package com.c023;

public class Plane implements Way {
	@Override
	public void myWay( int choice) {
		if(choice==1){
			System.out.println("选择乘飞机出行！");
		}
	}
}
