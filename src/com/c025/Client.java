package com.c025;

public class Client {
	public static void main(String[] args) {
		Product book=new Book();
		Product apple=new Apple();
		Visitor visitor;

		BuyBasket buyBasket =new BuyBasket();
		buyBasket.addProduct(book);
		buyBasket.addProduct(apple);

		visitor=(Visitor)new Customer();
		visitor.setName("甲");
		buyBasket.accept(visitor);
		System.out.printf("\n");
		visitor=(Visitor)new Saler();
		visitor.setName("乙");
		buyBasket.accept(visitor);
		System.out.printf("\n");
		visitor=(Visitor)new Packer();
		visitor.setName("丙");
		buyBasket.accept(visitor);
		System.out.printf("\n");
	}
}
