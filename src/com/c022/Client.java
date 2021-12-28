package com.c022;

public class Client {
	public static void main(String[] args) {
		Account account=new Account("用户Z");
		account.deposit(1000);
		account.deposit(10000);
		account.withdraw(10000);
		account.withdraw(1100);
		account.withdraw(1000);
		account.withdraw(100);
	}
}
