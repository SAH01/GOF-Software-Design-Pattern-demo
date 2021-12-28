package com.c019;

import java.util.Hashtable;

public class AddGroup extends AbstractChatroom{
	private Hashtable members=new Hashtable();//存储会员
	public void register(Member member){
		if(!members.contains(members)){
			members.put(member.getName(),member);
			member.setChatroom(this);
		}
	}
	public void sendText(String from,String to,String message){
		Member member=(Member)members.get(to);//得到要接受消息的会员
		if(message.length()>100){
			System.out.printf("文本太长，发送失败\n");
		}else{
			String newMessage=message;
			newMessage=message.replace("日","*");
			member.receiveText(from,newMessage);
		}
	}
	public void sendImage(String from,String to,String image){
		Member member=(Member)members.get(to);
		if(image.length()>20){
			System.out.printf("图片太大，发送失败\n");
		}else{
			member.receiveImage(from,image);
		}
	}
}
