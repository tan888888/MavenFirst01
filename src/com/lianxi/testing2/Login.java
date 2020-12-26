package com.lianxi.testing2;

public class Login {

	public String resultMSG;
	
	public boolean login(String username,String pwd) {
		if(username != null && pwd != null) {
			if(username.length()>2 && username.length()<17 && pwd.length()>2 && pwd.length()<17) {
				if(username.equals("Roy") && pwd.equals("123456")) {
					resultMSG = "恭喜您，登录成功";
					System.out.println("恭喜您，登录成功");
					return true;
				}else {
					resultMSG = "用户名或密码错误！";
					System.out.println("用户名或密码错误！");
					return false;
				}
			}else {
				resultMSG = "用户名密码长度应是3-16位！";
				System.out.println("用户名密码长度应是3-16位！");
				return false;
			}
		}else {
			resultMSG = "用户名密码不能为空！";
			System.out.println("用户名密码不能为空！");
			return false;
		}
	}
	
	public String getResult() {
		return resultMSG;
	}
	
}
