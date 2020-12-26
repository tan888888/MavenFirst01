package com.lianxi.bean;

public class Dog extends Animal{

	public void watchDoor() {
		System.out.println("狗看门");
	}
	
	
	public void eat() {
		System.out.println("狗啃骨头");
	}
	
	public void eat(String food) {
		System.out.println("狗类中的方法"+food);
	}
	
//	public void drink() {
//		System.out.println("狗类喝水方法");
//	}
	
}
