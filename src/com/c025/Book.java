package com.c025;

public class Book implements Product{
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
