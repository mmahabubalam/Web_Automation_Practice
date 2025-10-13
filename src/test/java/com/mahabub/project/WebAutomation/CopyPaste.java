package com.mahabub.project.WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyPaste extends BaseDriver{
  
  String url1 = "https://demoqa.com/automation-practice-form";
  
  @Test
  public void Copy_Paste() throws InterruptedException {
    
    driver.manage().window();
    driver.get(url1);
    
    Actions action = new Actions(driver);
    
    WebElement aa = driver.findElement(By.id("firstName"));
    aa.sendKeys("Rehan");
    Thread.sleep(2000);
        
    //Select All = Ctrl + A
    action.keyDown(Keys.CONTROL);
    action.sendKeys("a");
    action.keyUp(Keys.CONTROL);
    action.build().perform();
    
    //Copy
    action.keyDown(Keys.CONTROL);
    action.sendKeys("x");
    action.keyUp(Keys.CONTROL);
    action.build().perform();
    Thread.sleep(2000); 
    
    //Tab
    aa.sendKeys(Keys.TAB);
    action.build().perform();
    Thread.sleep(1000);
    
    action.keyDown(Keys.CONTROL);
    action.sendKeys("v");
    action.keyUp(Keys.CONTROL);
    action.build().perform();
    Thread.sleep(2000);
  }

}
