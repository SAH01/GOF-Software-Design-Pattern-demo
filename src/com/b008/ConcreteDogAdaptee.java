package com.b008;
public class ConcreteDogAdaptee implements DogAdaptee {
	@Override
	public void cry() {
		System.out.println("汪汪叫");
	}
}
