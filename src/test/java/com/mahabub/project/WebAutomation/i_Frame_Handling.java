package com.mahabub.project.WebAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class i_Frame_Handling extends BaseDriver{
	
	String url = "https://demoqa.com/frames";
	
	@Test
	public void iFrame() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		int iFramenum = driver.findElements(By.tagName("iFrame")).size();
		System.out.println("Total iFrame in this page is: " + iFramenum);
		
		//Initially we're in default location, we need to select the frame before locating the iFrame's element.
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.id("sampleHeading")).getSize());
		Thread.sleep(1000);
		
		//After, if we needs to locate another element in other iFrame/outside of iFrame, switch to default location.
		driver.switchTo().defaultContent();
		
		//Switching the iFrame:: frame1 to frame2
		driver.switchTo().frame("frame2");
		System.out.println(driver.findElement(By.id("sampleHeading")).getSize());
		Thread.sleep(1000);
	}

}
