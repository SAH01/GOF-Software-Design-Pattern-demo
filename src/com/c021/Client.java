package com.c021;

public class Client {

	public static void main(String[] args) {
		Stock s1 = new Stock("股票");
		Observer o1 = new Observer("张三");
		s1.setStockState("0.05");
		s1.Attach(o1);
		s1.Notify();
		s1.Detch(o1);
		s1.setStockState("-0.05");
		s1.Attach(o1);
		s1.Notify();
	}
}
