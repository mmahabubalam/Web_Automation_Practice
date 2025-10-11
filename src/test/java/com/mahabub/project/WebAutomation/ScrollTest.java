package com.mahabub.project.WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollTest extends BaseDriver{
	
	String url1 = "https://www.arogga.com/";
	
	@Test
	public void scrollHandling() throws InterruptedException {

		driver.manage().window();
	    driver.get(url1);
	    Thread.sleep(5000);
	    
		
	    //Scroll to location
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    	    
//	    WebElement location = driver.findElement(By.xpath("//h2[normalize-space()='Popular Generator Categories']"));
//	    js.executeScript("arguments[0].scrollIntoView(true);", location);
//	    Thread.sleep(1000);
	    
//	    //Scroll By Pixel Size
//	    js.executeAsyncScript("window.scrollBy(0,1050)","");
//	    Thread.sleep(1000);
	    
	    //Scroll to bottom
	    js.executeScript("window.scrollTo(0,0)");
	    Thread.sleep(5000);
	    
	    //Scroll to Top
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");	   
	    Thread.sleep(2000);
	}

}
