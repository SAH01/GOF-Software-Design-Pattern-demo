package com.b013;
//棋子享元工厂类
import java.util.Hashtable;
public class IgoChessmanFactory {
	private static IgoChessmanFactory instance = new IgoChessmanFactory();
	private static Hashtable ht;
	public IgoChessmanFactory() {
		// TODO Auto-generated constructor stub
		ht = new Hashtable();
		IgoChessman black, white;
		black = new BlackIgoChessman();
		ht.put("b", black);
		white = new WhiteIgoChessman();
		ht.put("w", white);
	}

	public static IgoChessmanFactory getInstance() {
		return instance;
	}

	public static IgoChessman getIgoChessman(String color) {
		return (IgoChessman) ht.get(color);
	}
}