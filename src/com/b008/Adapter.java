package com.b008;

public class Adapter implements CatTarget,DogAdaptee {

	private CatTarget catTarget;
	private DogAdaptee dogAdaptee;

	public Adapter() {
	}

	public void setCatTarget(CatTarget catTarget) {
		this.catTarget = catTarget;
	}

	public void setDogAdaptee(DogAdaptee dogAdaptee) {
		this.dogAdaptee = dogAdaptee;
	}

	public void catchMouse() {
		System.out.print("猫学狗叫，即目标类调用适配者中的方法:");
		dogAdaptee.cry();
	}

	public void cry(){
		System.out.print("狗学猫抓老鼠,即适配者调用目标类中的方法：");
		catTarget.catchMouse();
	}
}
