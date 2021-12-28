package com.c019;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddMember extends Member{
	private SimpleDateFormat sdf = new SimpleDateFormat();
	public AddMember(String name){
		super(name);
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
	}
	public void sendText(String to,String message){
		Date date = new Date();// 获取当前时间
		System.out.printf("("+sdf.format(date)+")新增会员发送消息：\n");
		chatroom.sendText(name,to,message);
	}
	public void sendImage(String to,String image){
		Date date = new Date();// 获取当前时间
		System.out.printf("("+sdf.format(date)+")新增会员发送图片：\n");
		chatroom.sendImage(name,to,image);
	}
}
