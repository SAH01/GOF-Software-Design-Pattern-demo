package com.b014;
public class Client_b014 {
	public static void main(String[] args) {
		//初始化代理类
		MarriageProxy marriageProxy=new MarriageProxy();
		//level=0
		marriageProxy.ifage_18();
		System.out.println("-------------------");
		//设置level=1
		marriageProxy.setLevel(1);
		marriageProxy.ifage_18();
	}
}
