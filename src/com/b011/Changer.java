package com.b011;

public class Changer implements Phone {
	private Phone phone;
	public Changer(Phone phone) {
		this.phone=phone;
	}
	@Override
	public void pickup() {
		phone.pickup();
	}
}
