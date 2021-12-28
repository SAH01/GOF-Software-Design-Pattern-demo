package com.a007;

public class Client
{
	public static void main(String a[])
	{
	   StuNo no1,no2;
	   no1=StuNo.getInstance();
       no2=StuNo.getInstance();
       System.out.println("学号是否一致：" + (no1==no2));
       String str1,str2;
       str1=no1.getStuNo();
       str2=no1.getStuNo();
       System.out.println("第一次学号：" + str1);
       System.out.println("第二次学号：" + str2);
       System.out.println("内容是否相同：" + str1.equalsIgnoreCase(str2));
       System.out.println("是否为相同对象：" + (str1==str2));
	}
}