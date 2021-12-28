package com.b011;

public class ComplexPhone extends Changer {
	public ComplexPhone(Phone phone) {
		super(phone);
		System.out.println("变成ComplexPhone!");
	}
	public void blingbling(){
		System.out.println("除了发出声音振动外，还可以灯光闪烁提示！");
	}
}
