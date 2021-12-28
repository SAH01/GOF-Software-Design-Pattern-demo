package com.c016;

public class Client {
	public static void main(String[] args) {
		CalculatorForm form=new CalculatorForm();
		AbstractCommand command;
		command=new ConcreteCommand();
		form.setCommand(command);
		form.compute(27);
		form.compute(17);
		form.compute(7);
		System.out.printf("撤销第一次：\n");
		form.undo();
		System.out.printf("撤销第二次：\n");
		form.undo();
		System.out.printf("撤销第三次：\n");
		form.undo();
	}
}
