package com.c025;

import java.util.ArrayList;
import java.util.Iterator;

public class BuyBasket {
	private ArrayList list=new ArrayList();
	//购物车的产品依次接受不同的访问者
	public void accept(Visitor visitor){
		Iterator i=list.iterator();
		while(i.hasNext()){
			((Product)i.next()).accept(visitor);
		}
	}
	public void addProduct(Product product){
		list.add(product);
	}
	public void removeProduct(Product product){
		list.remove(product);
	}
}
