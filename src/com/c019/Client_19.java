package com.c019;

public class Client_19 {
	public static void main(String[] args) {
		AbstractChatroom happyChat =new ChatGroup();
		Member member1,member2,member3,member4,member5;
		member1=new DiamondMember("张三");
		member2=new DiamondMember("李四");
		member3=new DiamondMember("王五");
		member4=new DiamondMember("小芳");
		member5=new DiamondMember("小红");

		happyChat.register(member1);
		happyChat.register(member2);
		happyChat.register(member3);
		happyChat.register(member4);
		happyChat.register(member5);

		System.out.printf("现在正在使用基本聊天室\n");
		member1.sendText("李四","李四，你好！");
		member2.sendText("张三","张三，你好！");
		member1.sendText("李四","今天天气真不错，有日");
		member2.sendText("张三","一个很大的太阳");
		member1.sendImage("李四","太阳");
		member3.sendText("小芳","还有问题吗");
		member3.sendText("小红","还有问题吗");
		member4.sendText("王五","没有了，谢谢");
		member5.sendText("王五","我也没有了");
		member5.sendImage("王五","谢谢");

		System.out.printf("现在正在使用新增聊天室\n");
		AbstractChatroom addChat=new AddGroup();
		Member addMember1,addMember2;
		addMember1=new AddMember("A");
		addMember2=new AddMember("B");
		addChat.register(addMember1);
		addChat.register(addMember2);
		addMember2.sendText("A","B，你好");
		addMember1.sendText("B","A，你好");
		addMember2.sendText("A","吃了没");
		addMember1.sendImage("B","吃了吃了");
		addMember2.sendText("A","777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
		addMember1.sendImage("B","表情包XXX");
	}

}
