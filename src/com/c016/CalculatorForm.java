package com.c016;

public class CalculatorForm {
	private AbstractCommand command;

	public void setCommand(AbstractCommand command) {
		this.command = command;
	}

	public void compute(int value) {
		int i = command.execute(value);
		System.out.println("计算结果：" + i);
	}
	public void undo(){
		int i=command.undo();
		System.out.println("撤销结果："+i);
	}

}
