package selLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.BrowserInvoke;


public class CheckBoxes extends BrowserInvoke{


	public static void main(String[] args) throws Exception {


		driver=BrowserInvoke.openBrowser("https://the-internet.herokuapp.com/checkboxes");
		
		
		WebElement chk1=driver.findElement(By.xpath("(//input)[1]"));
		WebElement chk2=driver.findElement(By.xpath("(//input)[2]"));		
		
		
		if(!chk1.isSelected())
		{
			clickElement(driver, chk1, "check box 1");
		}
		if(!chk2.isSelected())
		{
			clickElement(driver, chk2, "check box 2");
		}
		
		Thread.sleep(3000);
		BrowserInvoke.closeBrowser();

	}

}
