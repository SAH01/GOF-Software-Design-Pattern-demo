package com.b009;

public class Client {
	public static void main(String[] args) {
		Road road;
		Vehicle vehicle;

		road=(Road)XMLUtil.getBean("road");
		vehicle=(Vehicle)XMLUtil.getBean("vehicle");

		road.setVehicle(vehicle);
		road.createR();

	}
}
