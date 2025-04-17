package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LeavePage {

	WebDriver ldriver;
	
	


	public LeavePage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath="//h6[text()='Leave']")
	WebElement leave;
	
	
	public void assertTest()
	{
		String data=leave.getText();
		Assert.assertEquals(data, "Leave");
	}
	



}
