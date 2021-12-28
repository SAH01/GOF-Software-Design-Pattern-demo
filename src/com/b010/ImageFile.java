package com.b010;

public class ImageFile extends AbstractFile
{
	private String fileName;
	public ImageFile(String filename)
	{
		this.fileName=new String();
		this.fileName=filename;
	}

	public void display()
	{
		System.out.println(fileName);
		System.out.println("ImageFile:display");
	}

}