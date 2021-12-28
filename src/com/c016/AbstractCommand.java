package com.c016;

public abstract class AbstractCommand {
	public abstract int execute(int value);
	public abstract int undo();
}
