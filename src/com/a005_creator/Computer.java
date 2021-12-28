package com.a005_creator;

import sun.plugin2.gluegen.runtime.CPU;

public class Computer {
	private String CPU;
	private String HardDisk;
	private String MainFrame;
	private String Memory;

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String CPU) {
		this.CPU = CPU;
	}

	public String getHardDisk() {
		return HardDisk;
	}

	public void setHardDisk(String hardDisk) {
		HardDisk = hardDisk;
	}

	public String getMainFrame() {
		return MainFrame;
	}

	public void setMainFrame(String mainFrame) {
		MainFrame = mainFrame;
	}

	public String getMemory() {
		return Memory;
	}

	public void setMemory(String memory) {
		Memory = memory;
	}

	public Computer() {

	}
}


