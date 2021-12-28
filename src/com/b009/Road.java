package com.b009;

public abstract class Road {
	protected Vehicle vehicle;
	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle=vehicle;
	}
	public abstract void createR();
}
