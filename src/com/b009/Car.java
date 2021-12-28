package com.b009;

public class Car implements Vehicle{
	@Override
	public void run(String Vtype) {
		System.out.println(Vtype + "汽车在跑！");
	}
}
