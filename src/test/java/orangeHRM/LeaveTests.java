package orangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.BrowserInvoke;
import util.ReadPropertyData;
import util.SeleniumHelpers;

public class LeaveTests extends BrowserInvoke{
	
	protected static WebDriver driver;
	
	@FindBy(xpath="//span[text()='Leave']")	WebElement leaveTab;
	
	@FindBy(xpath = "//input[@name='username']")WebElement uNameTB;

	@FindBy(xpath = "//input[@name='password']")WebElement pwdTB;
	
	@FindBy(xpath="//button[@type='submit']") WebElement lgnBTN;
	
	
	

	@BeforeTest
	public void invokeBrowser() throws Exception
	{
		driver=openBrowser(ReadPropertyData.readData("/src/main/resources/config.properties", "url"));
		PageFactory.initElements(driver, this);
		
		System.out.println("Driver instance: " + driver);
		System.out.println("Username field: " + uNameTB);
	}
	
	@BeforeClass
	public void login()
	{

		
		SeleniumHelpers.sendDataElement(driver, uNameTB, "Admin", "userName textbox");

		SeleniumHelpers.sendDataElement(driver, pwdTB, "admin123", "password textbox");
		
		SeleniumHelpers.clickElement(driver, lgnBTN, "Click login button");
		
	}
	
	
	@BeforeMethod
	public void moduleClick()
	{
		SeleniumHelpers.clickElement(driver, leaveTab, "Click dashBoard tab button");
	}
	
	@Test
	public void linksCheck() throws InterruptedException
	{
//		Thread.sleep(3000);
//		
//		List<WebElement> links=driver.findElements(By.xpath("//a[text()='Apply']/../..//a"));
//		
//		for(WebElement e:links)
//		{
//			SeleniumHelpers.clickElement(driver, leaveTab, "Click dashBoard tab button");
//			
//			e.click();
//			System.out.println(driver.findElement(By.xpath("//header//h6")).getText());
//		}
		
		driver.findElement(By.xpath("//a[text()='Apply']")).click();
		
		
	}
	
	@AfterMethod
	public void modulePostClick()
	{
		SeleniumHelpers.clickElement(driver, leaveTab, "Click dashBoard tab button");
	}
	
	
	@AfterClass
	public void logOut()
	{
		
	}
	
	
	@AfterTest
	public void tearDown()
	{
		closeBrowser();
	}
	
	
}
