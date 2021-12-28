package com.a005_creator;

public class LapTopBuilder extends ComputerBuilder {
	@Override
	public void buildCPU() {
		computer.setCPU("笔记本电脑CPU");
	}

	@Override
	public void buildHardDisk() {
		computer.setHardDisk("笔记本电脑HardDisk");
	}

	@Override
	public void buildMainFrame() {
		computer.setMainFrame("笔记本电脑MainFrame");
	}

	@Override
	public void buildMemory() {
		computer.setMemory("笔记本电脑Memory");
	}
}
