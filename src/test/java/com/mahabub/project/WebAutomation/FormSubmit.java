package com.mahabub.project.WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FormSubmit extends BaseDriver{
	
	public String link = "https://demoqa.com/automation-practice-form";
	
	@Test
	public void practiceForm() throws InterruptedException {
	
		driver.manage().window().maximize();
		driver.get(link);
		Thread.sleep(2000);
		
		
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Rehan");
		Thread.sleep(1000);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Rahman");
		Thread.sleep(1000);
		
		WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		userEmail.sendKeys("test@nogmail.com");
		Thread.sleep(1000);
		
		WebElement gender = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		
		if(!gender.isSelected()) {
			gender.click();
			Thread.sleep(1000); 	
		}
		
		WebElement userNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		userNumber.sendKeys("01478520369");
		Thread.sleep(1000);
		
		WebElement Sports = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
		if(!Sports.isSelected()) {
			Sports.click();
			Thread.sleep(1000); 	
		}
		
		WebElement Address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		Address.sendKeys("NYC USA");
		Thread.sleep(1000); 
		
		
		
		WebElement state = driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
		Select select = new Select(state);
		select.selectByIndex(3);
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
		Select select2 = new Select(city);
		select2.selectByIndex(1);
		Thread.sleep(1000);
		
		
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		Thread.sleep(1000); 	
		

	}

}
