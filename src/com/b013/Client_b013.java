package com.b013;
public class Client_b013 {
	public static void main(String[] args) {
		IgoChessman black1,black2,black3,white1,white2;
		IgoChessmanFactory factory;
		factory = IgoChessmanFactory.getInstance();
		black1 = factory.getIgoChessman("b");
		black2 = factory.getIgoChessman("b");
		black3 = factory.getIgoChessman("b");
		System.out.println("黑棋判断："+(black1==black2));
		white1 = factory.getIgoChessman("w");
		white2 = factory.getIgoChessman("w");
		System.out.println("白棋判断："+(white1==white2));
		black1.locate(new Coordinates(1, 3));
		black2.locate(new Coordinates(3, 4));
		black3.locate(new Coordinates(1, 3));
		white1.locate(new Coordinates(2, 5));
		white2.locate(new Coordinates(2, 4));
	}
}
