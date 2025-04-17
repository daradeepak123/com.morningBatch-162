package orangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import util.BrowserInvoke;
import util.ReadPropertyData;
import util.SeleniumHelpers;

public class DashBoardPageTests extends BrowserInvoke{
	
	protected static WebDriver driver;
	
	
	
	@FindBy(xpath="//span[text()='Dashboard']")	WebElement dashboardTab;
	
	@FindBy(xpath = "//input[@name='username']")WebElement uNameTB;

	@FindBy(xpath = "//input[@name='password']")WebElement pwdTB;
	
	@FindBy(xpath="//button[@type='submit']") WebElement lgnBTN;
	
	@FindBy(xpath="//span[text()='Dashboard']") WebElement dashBoardTab;
	

	
	
	LoginPage lp;
	DashBoardPage dp;
	
	
	
	@BeforeTest
	public void invokeBrowser() throws Exception
	{
		driver=openBrowser(ReadPropertyData.readData("/src/main/resources/config.properties", "url"));
		PageFactory.initElements(driver, this);
		lp=new LoginPage(driver);
		dp=new DashBoardPage(driver);
		System.out.println("Driver instance: " + driver);
		System.out.println("Username field: " + uNameTB);
	}
	
	@BeforeClass
	public void login()
	{
		lp.login();		
	}
	
	
	@BeforeMethod
	public void moduleClick()
	{
		SeleniumHelpers.clickElement(driver, dashboardTab, "Click dashBoard tab button");
	}
	
	@Test
	public void headerTest()
	{
		dp.validateHeading();
	}
	
	@Test
	public void validateTexts()
	{
		List<WebElement> ele=driver.findElements(By.xpath("//p[text()='Assign Leave']/../../..//p"));
		for(WebElement e:ele)
		{
			System.out.println(SeleniumHelpers.readTextElement(driver, e, "list of texts"));
		}
	}
	
	
	
	
	@AfterMethod
	public void moduleBeOn()
	{
		SeleniumHelpers.clickElement(driver, dashboardTab, "Click dashBoard tab button");
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
