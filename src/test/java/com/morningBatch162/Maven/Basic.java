package com.morningBatch162.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.BrowserInvoke;

public class Basic {


	static WebDriver driver;

	public static void main(String[] args) throws Exception {


		driver=BrowserInvoke.openBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		WebElement alert1=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		

		WebElement alert2=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		

		WebElement alert3=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		
		alert1.click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		
		alert2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		
		alert3.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		
	
	
		BrowserInvoke.closeBrowser();
		
	
	
	
	}

}
