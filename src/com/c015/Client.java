package com.c015;

public class Client {
	public static void main(String[] args) {
		Approver position1,position2,position3,position4,meeting;  // 多个处理者
		position1 = new Director("甲");
		position2 = new PartManager("乙");
		position3 = new ViceManager("丙");
		position4 = new Manager("丁");
		meeting = new Congress("职工大会");
		//创建职责链
		position1.setSuccessor(position2);
		position2.setSuccessor(position3);
		position3.setSuccessor(position4);
		position4.setSuccessor(meeting);
		//创建采购单
		PurchaseRequest pr1 = new PurchaseRequest(5000,10001,"XXX");
		position1.processRequest(pr1);

		PurchaseRequest pr2 = new PurchaseRequest(45000,10002,"XXX");
		position1.processRequest(pr2);

		PurchaseRequest pr3 = new PurchaseRequest(77000,10003,"XXX");
		position1.processRequest(pr3);

		PurchaseRequest pr4 = new PurchaseRequest(150000,10004,"XXX");
		position1.processRequest(pr4);

		PurchaseRequest pr5 = new PurchaseRequest(800000,10005,"XXX");
		position1.processRequest(pr5);
	}
}