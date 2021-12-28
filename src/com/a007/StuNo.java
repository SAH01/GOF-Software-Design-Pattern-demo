package com.a007;

public class StuNo
{
	//静态私有成员变量
	private static StuNo instance=null;
	private String no;
	//私有构造方法
	private StuNo()
	{	
	}
	//静态公有工厂方法，返回唯一实例
	public static StuNo getInstance()
	{
		if(instance==null)
		{
			System.out.println("新学号");
		    instance=new StuNo();
		    instance.setStuNo("20194074");
		}
		else
		{
			System.out.println("学号重复，获得旧学号");
		}
		return instance;
	}
	
	private void setStuNo(String no)
	{
	    this.no=no;
	}
	
	public String getStuNo()
	{
		return this.no;
	}
	
}