package com.lianxi.bean;

public class Cat extends Animal {

	public String ear = "三角形的耳朵";
	
	public void catchMouse() {
		System.out.println("猫抓老鼠");
		
	}
	
	public void eat(String food) {
		System.out.println("猫爱吃鱼" + food);
	}
	
	public void eat(String food,int count) {
		System.out.println("猫吃了"+count+"个"+food);
	}
	
	public void animalEat() {
		super.eat("调用父类eat方法");
	}
	
	public String toString() {
		return "这是一只猫";
	}
	
	
}
