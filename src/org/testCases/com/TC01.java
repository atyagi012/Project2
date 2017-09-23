package org.testCases.com;

import org.testng.Reporter;
import org.testng.annotations.Test;

import common.utilities.LCB;

public class TC01 extends LCB{

	@Test
	public void testCase01(){
		driver.get("http://www.google.com");
		Reporter.log(driver.getTitle());
		
		Reporter.log("Hi there");
	}
}
