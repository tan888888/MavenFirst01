package com.lianxi.bean;

public interface Hero {

	
	public static final int ATTACK=30;
	public int AP=0;
	
	public abstract void firstSkill();
	public void secondSkill();
	
	public default void thirdSkill() {
		System.out.println("这是一个大招，超厉害的");
	}
	
	
	
	
}
