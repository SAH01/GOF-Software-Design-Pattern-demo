package com.a004;

public class White implements Color {
	@Override
	public Man produceMan() {
		return new WhiteMan();
	}

	@Override
	public Woman produceWoman() {
		return new WhiteWoman();
	}
}
