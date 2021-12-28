package com.c024;

public abstract class DBOperation {
	public abstract void connDB();
	public void openDB(){
		System.out.printf("打开数据库\n");
	}
	public void useDB(){
		System.out.printf("使用数据库\n");
	}
	public void closeDB(){
		System.out.printf("关闭数据库\n");
	}
	public void opration(){
		this.connDB();
		this.openDB();
		this.useDB();
		this.closeDB();
	}
}
