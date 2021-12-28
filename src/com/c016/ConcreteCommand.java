package com.c016;

import java.util.Stack;

public class ConcreteCommand extends AbstractCommand{
	private Adder adder=new Adder();
	Stack stact = new Stack();
	private int value;

	@Override
	public int execute(int value) {
		this.value=value;
		stact.push(value);
		return adder.add(value);
	}
	public int undo(){
		value=(int)stact.pop();
		return adder.add(-value);
	}
}
