package com.c018;

import java.util.*;

public class Client {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("s1",20180001,18));
		list.add(new Student("s2",20190001,19));
		list.add(new Student("s3",20200001,20));
		System.out.printf("按id从小到大：\n");
		Collections.sort(list,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// 返回值为int类型，大于0表示正序，小于0表示逆序
				return (int)(o1.getId()-o2.getId());
			}
		});
		Iterator<Student> listIt = list.iterator();
		while(listIt.hasNext()){
			Student stu=listIt.next();
			System.out.println("姓名："+stu.getName()+" 学号："+stu.getId()+" 年龄："+stu.getAge());
		}
		System.out.printf("按id从大到小：\n");
		Collections.sort(list,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// 返回值为int类型，大于0表示正序，小于0表示逆序
				return (int)(o2.getId()-o1.getId());
			}
		});
		Iterator<Student> listIt2 = list.iterator();
		while(listIt2.hasNext()){
			Student stu=listIt2.next();
			System.out.println("姓名："+stu.getName()+" 学号："+stu.getId()+" 年龄："+stu.getAge());
		}
	}
}
