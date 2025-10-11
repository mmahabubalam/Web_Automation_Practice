package com.mahabub.project.WebAutomation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class AssertionTest extends BaseDriver{
	
	String url = "https://www.selenium.dev";
	
	@Test
	public void assertionTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		
		String title = "Rehan";
		String testtitle = driver.getTitle();
		
		//Hard Assertion, if assertion is failed, bellow code won't execute.
		Assert.assertEquals(testtitle, title);
		
		
		//Soft Assertion
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(testtitle, title);		
		System.out.println("Passed");
		softAssert.assertAll();
		
		Thread.sleep(2000);
		
		
		
	}

}
