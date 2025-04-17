package testNGLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.BrowserInvoke;
import util.ReadPropertyData;
import util.SeleniumHelpers;

public class BaseClass extends BrowserInvoke{
	

	
	
	
	@BeforeClass
	public void invokeBrowser() throws Exception
	{
		openBrowser(ReadPropertyData.readData("/src/main/resources/config.properties", "url"));
	}
	
	
	@BeforeMethod
	public void openBroswer1() throws Exception 
	{
		WebElement tableLink=driver.findElement(By.xpath("//a[text()='Sortable Data Tables']"));
		SeleniumHelpers.clickElement(driver, tableLink, "This is table hyperlink");
	}
	
	@Test
	public void validateTitle()
	{
		WebElement table1=driver.findElement(By.xpath("//table[@id='table1']"));
		String data=SeleniumHelpers.readTextElement(driver, table1, "Reading table 1 data");
		System.out.println(data);
		
	}
	
	@Test
	public void validateURL()
	{
		WebElement table2=driver.findElement(By.xpath("//table[@id='table2']"));
		String data=SeleniumHelpers.readTextElement(driver, table2, "Reading table 2 data");
		System.out.println(data);
	}
	
	
	
	@AfterMethod
	public void closeTheBrowser()
	{
		driver.navigate().back();
	}
	
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}
	
	

}
