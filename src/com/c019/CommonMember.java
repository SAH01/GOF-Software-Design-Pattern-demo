package com.c019;

public class CommonMember extends  Member{
	public CommonMember(String name){
		super(name);
	}
	public void sendText(String to,String message){
		System.out.printf("普通会员发送消息：\n");
		chatroom.sendText(name,to,message);
	}
	public void sendImage(String to,String image){
		System.out.printf("普通会员无法发送图片\n");
	}
}

