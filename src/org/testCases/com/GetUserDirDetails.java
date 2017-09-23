package org.testCases.com;

import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class GetUserDirDetails {

	@Test
	public void testCase01(){
		
		String driverExePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
		System.out.println(driverExePath);
		
	}
}
