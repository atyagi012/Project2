package org.testCases.com;

import org.testng.Reporter;
import org.testng.annotations.Test;

import common.utilities.LCB;

public class TC04 extends LCB{

	@Test
	public void testCase03(){
		driver.get("http://www.cricinfo.com");
		Reporter.log(driver.getTitle());
	}
}
