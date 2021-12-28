package com.b012;

public class MainFrame {
	private Memory memory;
	private CPU cpu;
	private HardDisk hardDisk;
	private OS os;
	public MainFrame() {
		memory = new Memory();
		cpu = new CPU();
		hardDisk = new HardDisk();
		os = new OS();
	}
	public void on(){
		memory.check();
		cpu.run();
		hardDisk.read();
		os.load();
	}
	public void off(){
		memory.checkOver();
		cpu.runOver();
		hardDisk.readOver();
		os.loadOver();
	}
}
