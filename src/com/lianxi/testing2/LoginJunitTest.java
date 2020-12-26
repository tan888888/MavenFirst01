package com.lianxi.testing2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginJunitTest {

	public static Login login;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		login = new Login();
		System.out.println("---setUpBeforeClass---");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("---tearDownAfterClass---");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("---setUp---");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("---tearDown---");
	}

	@Test
	public void test1() {
		System.out.println("----1----");
		login.login(null, "123456");
//		assertTrue(login.getResult().contains("为空"));
		assertEquals("用户名密码不能为空！", login.getResult());
//		fail("Not yet implemented");
	}

	@Test
	public void test2() {
		System.out.println("----2----");
		login.login("Roy", "123456");
		assertEquals("恭喜您，登录成功",login.getResult());
//		fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		System.out.println("----3----");
		login.login("roy", "123456");
		assertEquals("用户名或密码错误！",login.getResult());
//		fail("Not yet implemented");
	}
	
	@Test
	public void test4() {
		System.out.println("----4----");
		login.login("royroyroyroyroyroyroy", "12345678");
		assertEquals("用户名密码长度应是3-16位！", login.getResult());
	}
	
	
	
}
