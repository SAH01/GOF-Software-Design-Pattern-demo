package com.c025;

public class Packer extends Visitor{
	@Override
	public void visit(Apple apple) {
		System.out.printf("打包员"+name+"给苹果打包\n");
	}

	@Override
	public void visit(com.c025.Book book) {
		System.out.printf("打包员"+name+"给书打包\n");
	}
}
