package com.b008;

public class Client {
	public static void main(String[] args) {
		//适配器
		Adapter adapter = (Adapter) XMLUtil.getBean("adapterPattern");

		//目标类通过适配器调用适配者方法
		CatTarget concreteCatTarget = (ConcreteCatTarget) XMLUtil.getBean("adapterPatternTarger");
		adapter.setCatTarget(concreteCatTarget);
		adapter.cry();

		//适配者通过适配器调用目标类方法
		DogAdaptee concreteDogAdaptee = (ConcreteDogAdaptee) XMLUtil.getBean("adapterPatternAdaptee");
		adapter.setDogAdaptee(concreteDogAdaptee);
		adapter.catchMouse();
	}
}

