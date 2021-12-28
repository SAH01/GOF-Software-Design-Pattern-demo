package com.c020;

import java.util.Stack;

public class Memento {
	private String account;
	private String password;
	private String telNo;
	private UserInfoDTO userInfoDTO;
	private Stack stact = new Stack();
	public Memento(){

	}
	public Memento(String account,String password,String telNo){
		this.account=account;
		this.password=password;
		this.telNo=telNo;
	}
	public UserInfoDTO popMemento(){
		return (UserInfoDTO)stact.pop();
	}
	public void saveMementos(String account,String password,String telNo){//利用栈存放以往状态
		userInfoDTO=new UserInfoDTO();//注意每次new一个userInfoDTO否则之前的会被覆盖
		userInfoDTO.setTelNo(telNo);
		userInfoDTO.setPassword(password);
		userInfoDTO.setAccount(account);
		stact.push(userInfoDTO);
	}

	public String getTelNo() {
		return telNo;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccount() {
		return account;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
}
