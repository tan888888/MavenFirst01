package com.lianxi.bean;

public class Abc implements Hero {

	@Override
	public void firstSkill() {
		System.out.println("小乔扔了扇子，第一个技能");
	}

	@Override
	public void secondSkill() {
		System.out.println("小乔放了朵花，第二个技能");
	}

	public void thirdSkill() {
		System.out.println("释放大招，星坠落");
	}
	
	
	
	
	
}
