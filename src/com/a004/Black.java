package com.a004;

public class Black implements Color{
	@Override
	public Man produceMan() {
		return new BlackMan();
	}

	@Override
	public Woman produceWoman() {
		return new BlackWoman();
	}
}
