package com.lianxi.testing2;

public class LoginTest {

	
	public static void main(String[] args) {
		Login l = new Login();
		boolean result = l.login(null, "123456");
		
//		if(result) {
//			System.out.println("测试成功");
//		}
		
		if(l.getResult().contains("为空")) {
			System.out.println("测试成功");
		}
		
		l.login("r", "123456");
		l.login("ro", "123456");
		l.login("roy", "123456");
		l.login("royroyroyroyroyroyroy", "123456");
		l.login("Roy", "123456");
		l.login("@#@$!@$", "123456");
		
		//针对密码输入设计的白盒测试用例
		l.login("Roy", null);
		l.login("Roy", "r");
		l.login("Roy", "12");
		l.login("Roy", "123");
		l.login("Roy", "123333333333333333333");
	}
	
}
