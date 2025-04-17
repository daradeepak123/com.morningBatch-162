package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import util.SeleniumHelpers;

public class DashBoardPage {
	
	WebDriver ldriver;
	
	
	public DashBoardPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy (xpath = "//h6[text()='Dashboard']") WebElement heading;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement dashboardTab;
	
	
	@FindBy(xpath="//p[text()='Assign Leave']/../../button")
	WebElement AssignLeaveBtn;
	
	public void validateHeading()
	{
		String headingData=SeleniumHelpers.readTextElement(ldriver, heading, null);
		assertEquals(headingData, "Dashboard");
	}
	
	
	
	public void dashBoardClick()
	{
		dashboardTab.click();
	}
	
	public void assignLeaveButton()
	{
		AssignLeaveBtn.click();
		
	}
	
	
	

}
