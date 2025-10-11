package com.mahabub.project.WebAutomation;

import org.testng.annotations.Test;

public class FirstRun extends BaseDriver{
	
	public String link = "https://mvnrepository.com/";
	
	@Test
	public void firstTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(link);
		Thread.sleep(2000);
	}

}
