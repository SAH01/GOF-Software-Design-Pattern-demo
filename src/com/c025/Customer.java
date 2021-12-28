package com.c025;

public class Customer extends Visitor{
	public void visit(Apple apple){
		System.out.printf("顾客"+name+"选苹果\n");
	}

	@Override
	public void visit(com.c025.Book book) {
		System.out.printf("顾客"+name+"买书\n");
	}
}
