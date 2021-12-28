package com.b010;
public class Client
{
	public static void main(String a[])
	{
		AbstractFile obj1,obj2,obj3,obj4,obj5;
		Folder plate1,plate2,plate3;
		obj1=new ImageFile("obj1_ImageFile");
		obj2=new TextFile("obj2_TextFile");
		plate1=new Folder("plate1");
		plate1.add(obj1);
		plate1.add(obj2);

		obj3=new VideoFile("obj3_VideoFile");
		obj4=new VideoFile("obj4_VideoFile");
		plate2=new Folder("plate2");
		plate2.add(obj3);
		plate2.add(obj4);

		obj5=new ImageFile("obj5_ImageFile");
		plate3=new Folder("plate3");
		plate3.add(plate1);
		plate3.add(plate2);
		plate3.add(obj5);

		plate3.display();

	}
}