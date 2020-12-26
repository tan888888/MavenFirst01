package com.lianxi.bean;

public class AbnewTest {

	public static void main(String[] args) {
		
		AbTest ab = new AbTest() {
			
			@Override
			public void drink() {
				// TODO Auto-generated method stub
				System.out.println("--------");
			}
		};
		
		ab.eat();
//		ab.drink();
		
	}
	
	
	
	
	
}
