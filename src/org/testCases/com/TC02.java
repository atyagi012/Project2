package org.testCases.com;

import org.testng.Reporter;
import org.testng.annotations.Test;

import common.utilities.LCB;

public class TC02 extends LCB{

	@Test
	public void testCase02(){
		driver.get("http://www.gmail.com");
		Reporter.log(driver.getTitle());
	}
}
