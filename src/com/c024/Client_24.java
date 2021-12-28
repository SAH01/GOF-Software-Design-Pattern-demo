package com.c024;

public class Client_24 {
	public static void main(String[] args) {
		DBOperation sqlOperation;
		sqlOperation=new SqlServer();
		sqlOperation.opration();
		sqlOperation=new MySql();
		sqlOperation.opration();
		sqlOperation=new Oracle();
		sqlOperation.opration();
	}
}
