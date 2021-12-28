package com.b011;

public class JarPhone extends Changer {

	public JarPhone(Phone phone) {
		super(phone);
		System.out.println("变成JarPhone!");
	}
	public void quake(){
		System.out.println("除了发出声音还可以振动！");
	}
}
