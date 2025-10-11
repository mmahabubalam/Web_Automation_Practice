package com.mahabub.project.WebAutomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Wait extends BaseDriver{
	
	String url = "https://www.selenium.dev";
	
	@Test
	public void assertionTest() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(url);
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		//Explicit Wait >> if give this path wrong, it will wait for 30 seconds, after showing an exception message
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//.
		WebElement blog = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Blog1']")));
		blog.click();
		
		Thread.sleep(2000);
		
		
		
		

		
		
		
	}

}
