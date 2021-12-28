package com.a004;
public class Client {
	public static void main(String[] args) {
		Color color;
		Man man;
		Woman woman;
		color=(Color) XMLUtil.getBean();
//		color=new White();
		woman=color.produceWoman();
		woman.play();
		man=color.produceMan();
		man.play();
	}
}
