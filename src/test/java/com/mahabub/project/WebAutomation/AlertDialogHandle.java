package com.mahabub.project.WebAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertDialogHandle extends BaseDriver{
	
	String url = "https://demoqa.com/alerts";
	
	@Test
	public void alertDialog() throws InterruptedException {
		
		driver.manage().window();
		driver.get(url);
		Thread.sleep(500);
		
		//confirmButton
		WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertButton.click();
		Thread.sleep(500);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(500);
		
		WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmButton.click();
		Thread.sleep(500);
		alert.accept();
		Thread.sleep(500);
		
		
		WebElement promtButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promtButton.click();
		Thread.sleep(500);
		alert.sendKeys("Rehan Rahman");
		alert.accept();
		Thread.sleep(1000);
	}
}
