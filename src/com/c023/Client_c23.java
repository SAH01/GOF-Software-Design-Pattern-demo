package com.c023;

public class Client_c23 {
	public static void main(String[] args) {
		Way way1=new Plane();
		Way way2=new Train();
		Way way3=new Bicycle();

		Context context=new Context();
		System.out.println("选择方式1:");
		context.setWay(way1);
		context.getWay(1);
		System.out.println("选择方式2:");
		context.setWay(way2);
		context.getWay(2);
		System.out.println("选择方式3:");
		context.setWay(way3);
		context.getWay(3);
	}
}
