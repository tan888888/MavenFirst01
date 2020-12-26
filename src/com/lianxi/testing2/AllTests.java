package com.lianxi.testing2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LoginJunitTest.class, LoginParamTest.class })
public class AllTests {

}
