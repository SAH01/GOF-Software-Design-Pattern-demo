package com.c025;

public class Saler extends Visitor{
	@Override
	public void visit(Apple apple) {
		System.out.printf("收银员"+name+"给苹果过称，然后计算价格\n");
	}

	@Override
	public void visit(Book book) {
		System.out.printf("收银员"+name+"计算书的价格\n");
	}
}
