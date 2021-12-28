package com.a005_creator;

public class Client {
	public static void main(String[] args)
	{
		//确定电脑种类
		ComputerBuilder cb= new LapTopBuilder();
		//开始准备零件
		ComputerWaiter waiter=new ComputerWaiter();
		//开始组装零件
		waiter.setCb(cb);
		//客户获得电脑成品
		Computer computer=waiter.construct();

		//输出组装好的电脑详细信息
		System.out.println("套餐组成：");
		System.out.println(computer.getCPU());
		System.out.println(computer.getHardDisk());
		System.out.println(computer.getMainFrame());
		System.out.println(computer.getMemory());
	}
}
