package com.c020;

import java.util.Stack;

public class Client {
	public static void main(String[] args) {
		Stack stact = new Stack();
		UserInfoDTO user=new UserInfoDTO();
		Caretaker c=new Caretaker();
		user.setAccount("xiaoli");
		user.setPassword("rainbow_0");
		user.setTelNo("15284206891");
		System.out.println("状态1:");
		user.show();
		c.setMemento(user.saveMemento());
		user.setPassword("rainbow_1");
		user.setTelNo("15284206892");
		System.out.println("状态2:");
		user.show();
		c.setMemento(user.saveMemento());
		user.setPassword("rainbow_3");
		user.setTelNo("15284206893");
		System.out.println("状态3:");
		user.show();
		c.setMemento(user.saveMemento());
		user.setPassword("rainbow_4");
		user.setTelNo("15284206894");
		System.out.println("状态4:");
		user.show();
		c.setMemento(user.saveMemento());
		user.restoreMemento(c.getMemento());
		System.out.println("回到状态3:");
		user.show();
		user.restoreMemento(c.getMemento());
		System.out.println("回到状态2:");
		user.show();
		user.restoreMemento(c.getMemento());
		System.out.println("回到状态1:");
		user.show();
	}
}
