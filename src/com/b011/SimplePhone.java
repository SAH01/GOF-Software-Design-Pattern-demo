package com.b011;

public final class SimplePhone implements Phone{
	@Override
	public void pickup() {
		System.out.println("我接通来电的时候会发出声音提醒主人！");
	}
	public SimplePhone(){
		System.out.println("我是手机！");
	}
}
