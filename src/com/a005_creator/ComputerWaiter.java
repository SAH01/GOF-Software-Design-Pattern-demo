package com.a005_creator;

public class ComputerWaiter {
	private ComputerBuilder cb;
	public void setCb(ComputerBuilder cb){
		this.cb=cb;
	}
	public Computer construct(){
		cb.buildCPU();
		cb.buildHardDisk();
		cb.buildMainFrame();
		cb.buildMemory();
		return cb.getComputer();
	}
}
