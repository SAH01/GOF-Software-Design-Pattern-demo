package com.b014;

public class MarriageProxy implements Abstract
{
	private MarriageReal marriageReal = new MarriageReal();
	private int level=0;

	public void setLevel( int level){
		this.level =level ;
	}
	@Override
	public void ifage_18() {
		if(level==0){
			System.out.println("不满18周岁，无法办理婚介服务！");
		}
		else if(level==1){
			System.out.println("已满18周岁，");
			marriageReal.ifage_18();
		}
	}
}
