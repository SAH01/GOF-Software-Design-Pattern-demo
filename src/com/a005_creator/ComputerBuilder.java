package com.a005_creator;
public abstract class ComputerBuilder {
	protected Computer computer = new Computer();
	public abstract void buildCPU();
	public abstract void buildHardDisk();
	public abstract void buildMainFrame();
	public abstract void buildMemory();
	public Computer getComputer(){
		return computer;
	}
}
