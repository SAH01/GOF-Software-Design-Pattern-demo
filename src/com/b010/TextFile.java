package com.b010;

public class TextFile extends AbstractFile
{
	private String fileName;
	public TextFile(String filename)
	{
		this.fileName=new String();
		this.fileName=filename;
	}

	public void display()
	{
		System.out.println(fileName);
		System.out.println("TextFile:display");
	}
}