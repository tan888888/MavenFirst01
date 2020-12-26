package com.lianxi.bean;

public class Animal {

	public String kind = "动物";
	public int age = 0;
	
	public void eat(String food) {
		System.out.println("父类动物正在吃" + food);
	}
	
	public void drink() {
		System.out.println("Animal喝水");
		
	}
	
	public String grow() {
		age++;
		if(age<3) {
			return "现在是一只幼年动物";
		}else {
			return "现在是一只成年动物";
		}
	}
	
	
	
}
