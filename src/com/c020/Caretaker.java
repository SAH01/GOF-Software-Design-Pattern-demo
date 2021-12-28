package com.c020;

public class Caretaker {
	private Memento memento =new Memento();
	private UserInfoDTO userInfoDTO=new UserInfoDTO();
	public Memento getMemento(){
		userInfoDTO=memento.popMemento();
		Memento memento_flag=new Memento(userInfoDTO.getAccount(),userInfoDTO.getPassword(),userInfoDTO.getTelNo());
		return memento_flag;
	}

	public void setMemento(Memento memento_flag) {
		System.out.printf("存放备忘录："+memento_flag.getAccount()+" "+memento_flag.getPassword()+" "+memento_flag.getTelNo());
		this.memento.saveMementos(memento_flag.getAccount(),memento_flag.getPassword(),memento_flag.getTelNo());
	}
}
