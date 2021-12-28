package com.c015;

public class AllClass {
}
class PurchaseRequest {
	private double amount;  //采购金额
	private int number;  //采购单编号
	private String purpose;  //采购目的

	public PurchaseRequest(double amount, int number, String purpose) {
		this.amount = amount;
		this.number = number;
		this.purpose = purpose;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getPurpose() {
		return this.purpose;
	}
}

//审批者类：抽象处理者
abstract class Approver {
	protected Approver successor; //定义后继对象
	protected String name; //审批者姓名

	public Approver(String name) {
		this.name = name;
	}

	//设置后继者
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}

	//抽象请求处理方法
	public abstract void processRequest(PurchaseRequest request);
}

//主任类：具体处理者
class Director extends Approver {
	public Director(String name) {
		super(name);
	}

	//具体请求处理方法
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 10000) {
			System.out.println("主任" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求
		}
		else {
			this.successor.processRequest(request);  //转发请求
		}
	}
}

//副董事长类：具体处理者
class PartManager extends Approver {
	public PartManager(String name) {
		super(name);
	}

	//具体请求处理方法
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 50000) {
			System.out.println("部门经理" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求
		}
		else {
			this.successor.processRequest(request);  //转发请求
		}
	}
}

//董事长类：具体处理者
class ViceManager extends Approver {
	public ViceManager(String name) {
		super(name);
	}
	//具体请求处理方法
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 100000) {
			System.out.println("副总经理" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求
		}
		else {
			this.successor.processRequest(request);  //转发请求
		}
	}
}

//总经理 200000
class Manager extends Approver {
	public Manager(String name) {
		super(name);
	}

	//具体请求处理方法
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 200000) {
			System.out.println("总经理" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求
		}
		else {
			this.successor.processRequest(request);  //转发请求
		}
	}
}

//职工大会类：具体处理者
class Congress extends Approver {
	public Congress(String name) {
		super(name);
	}
	//具体请求处理方法
	public void processRequest(PurchaseRequest request) {
		System.out.println("召开职工大会审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");        //处理请求
	}
}