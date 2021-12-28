package com.a004;

public class Yellow implements Color{
	@Override
	public Man produceMan() {
		return new YellowMan();
	}

	@Override
	public Woman produceWoman() {
		return new YellowWoman();
	}
}
