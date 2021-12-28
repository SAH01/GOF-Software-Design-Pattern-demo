package com.c020;
public class UserInfoDTO {
	private String account;
	private String password;
	private String telNo;
	public String getAccount(){
		return account;
	}
	public void setAccount(String account){
		this.account=account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo=telNo;
	}
	public Memento saveMemento(){
		return new Memento(account,password,telNo);
	}
	public void restoreMemento(Memento memento){
		this.account=memento.getAccount();
		this.password=memento.getPassword();
		this.telNo=memento.getTelNo();
	}
	public void show(){
		System.out.println("用户名:"+this.account+" ");
		System.out.println("密码:"+this.password+" ");
		System.out.println("联系方式:"+this.telNo+" ");
	}
}
