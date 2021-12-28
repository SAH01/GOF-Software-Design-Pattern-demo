package com.b009;

public class Bus implements Vehicle{
	@Override
	public void run(String Vtype) {
		System.out.println(Vtype + "公交车在跑！");
	}
}
