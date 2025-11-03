package com.mahabub.project.WebAutomation;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class Tab_Handling extends BaseDriver{
	
	String url1 = "https://demoqa.com/";
	String url2 = "https://translate.google.com/";
	String url3 = "https://www.globalsqa.com/";
	
	@Test
	public void TabHandling() throws InterruptedException {
		
		driver.get(url1);
		String originTab = driver.getWindowHandle();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(url2);
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get(url3);
		Thread.sleep(1000);
		
		driver.switchTo().window(originTab);
		Thread.sleep(1000);
		
		
		
	}

}
