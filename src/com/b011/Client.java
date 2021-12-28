package com.b011;
public class Client {
	public static void main(String[] args) {
		Phone phone;
		phone=new SimplePhone();
		phone.pickup();
		System.out.println("-----------------------");
		JarPhone jarPhone= new JarPhone(phone);
		jarPhone.pickup();
		jarPhone.quake();
		ComplexPhone complexPhone=new ComplexPhone(phone);
		complexPhone.pickup();
		complexPhone.blingbling();
	}
}
