package com.b013;
//享元类
abstract class IgoChessman {

	public abstract String getColor();
	public void locate(Coordinates coord){
		System.out.println("颜色："+this.getColor()+"；位置："+coord.getX()+","+coord.getY());
	}
}
/**
 * 黑色棋子类：具体享元类
 *
 */
class BlackIgoChessman extends IgoChessman{

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "黑色";
	}

}
/**
 * 白色棋子类：具体享元类
 *
 */
class WhiteIgoChessman extends IgoChessman{

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "白色";
	}
}
