package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelpers {
	
	
	public static WebDriver driver;
	
	public static void clickElement(WebDriver driver, WebElement ele,String desc)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		if(flag)
		{
			ele.click();
		}
		else
		{
			System.out.println("the webElement you are trying "+desc+" is not displayed or enabled");
		}
		
	}
	
	public static void sendDataElement(WebDriver driver, WebElement ele,String data,String desc)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		if(flag)
		{
			ele.clear();
			ele.sendKeys(data);
		}
		else
		{
			System.out.println("the webElement you are trying "+desc+" is not displayed or enabled");
		}
		
	}
	
	
	public static String readTextElement(WebDriver driver, WebElement ele,String desc)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele));
		String data;
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		if(flag)
		{
			return ele.getText();
		}
		else
		{
			System.out.println("the webElement you are trying "+desc+" is not displayed or enabled");
			return null;
			
		}
		
	}
	

}
