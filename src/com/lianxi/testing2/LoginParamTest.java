package com.lianxi.testing2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//声明这个类使用junit的参数化运行方式
@RunWith(Parameterized.class)
public class LoginParamTest {

	private static Login login;
	private String username;
	private String pwd;
	private String actual;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		login = new Login();
	}

	//构造方法用和@parameters的二维数组中同样的参数列表来接收每一行的数据。
	public LoginParamTest(String user,String password,String actual) {
		username = user;
		pwd = password;
		this.actual = actual;
	}
	
	//@test方法调用成员变量完成执行
	@Test
	public void test() {
		login.login(username, pwd);
		assertEquals(actual, login.getResult());
	}
	
	//返回一个二维数组，二维数组是需要使用的测试数据，即初始化数据。
	@Parameters(name = "输入为 {0}和{1}的时候，结果是{2}")
	public static Object[][] loginDatas(){
		return new Object[][]{
			{null, "123456","用户名密码不能为空！"},
			{"Roy", "123456","恭喜您，登录成功"},
			{"roy", "123456","用户名或密码错误！"},
			{"royroyroyroyroyroyroy", "12345678","用户名密码长度应是3-16位！"}
		};
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	
}
