package com.mahabub.project.WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MouseHandling extends BaseDriver{
	
//	public String link = "https://www.arogga.com/";
	public String link = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
	//public String link = "https://demoqa.com/automation-practice-form";
	
	@Test
	public void mouseHandle() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get(link);
		Thread.sleep(2000);
		
		
		//Selecting the 1st element of the drop-down
		Actions action = new Actions(driver);
		WebElement hobar = driver.findElement(By.xpath("//a[@class='no_border'][contains(text(),'Tester’s Hub')]"));
		action.moveToElement(hobar).perform();
		Thread.sleep(2000);

		
		//Selecting the 2nd element of the drop-down
		WebElement hobar2 = driver.findElement(By.xpath("//li[@id='menu-item-2823']/a[1]/span[1]"));
		action.moveToElement(hobar2).perform();
		Thread.sleep(3000);		
				
		
		//Clicking the selecting element
		WebElement click = driver.findElement(By.xpath("//li[@id='menu-item-2834']//a"));
		click.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		//Select By Index
		WebElement ddown = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		Select select = new Select(ddown);
		select.selectByIndex(4);
		Thread.sleep(1000);
		
		//Select By Visible Text
		select.selectByValue("CAN");
		Thread.sleep(1000);
		
		//Select By Visible Text
		select.selectByVisibleText("Bangladesh");
		Thread.sleep(1000);
		
	}

}
