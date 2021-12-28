package com.b010;

public class VideoFile extends AbstractFile
{
	private String fileName;
	public VideoFile(String filename)
	{
		this.fileName=new String();
		this.fileName=filename;
	}

	public void display()
	{
		System.out.println(fileName);
		System.out.println("VideoFile:display");
	}
}