package com.c019;

public class DiamondMember extends Member{
	public DiamondMember(String name){
		super(name);
	}
	public void sendText(String to,String message){
		System.out.printf("钻石会员发送消息：\n");
		chatroom.sendText(name,to,message);
	}
	public void sendImage(String to,String image){
		System.out.printf("钻石会员发送图片：\n");
		chatroom.sendImage(name,to,image);
	}
}
