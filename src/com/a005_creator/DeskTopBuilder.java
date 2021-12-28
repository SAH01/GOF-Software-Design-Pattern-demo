package com.a005_creator;

public class DeskTopBuilder extends ComputerBuilder{
	@Override
	public void buildCPU() {
		computer.setCPU("台式电脑CPU");
	}

	@Override
	public void buildHardDisk() {
		computer.setHardDisk("台式电脑HardDisk");
	}

	@Override
	public void buildMainFrame() {
		computer.setMainFrame("台式电脑MainFrame");
	}

	@Override
	public void buildMemory() {
		computer.setMemory("台式电脑Memory");
	}
}
