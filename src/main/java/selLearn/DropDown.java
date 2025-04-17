package selLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.BrowserInvoke;
import util.ReadPropertyData;


public class DropDown extends BrowserInvoke{
	static WebDriver driver;

	public static void main(String[] args) throws Exception {


		driver=BrowserInvoke.openBrowser(ReadPropertyData.readData("/src/main/resources/config.properties", "url"));
		
		WebElement dw=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select sel=new Select(dw);
		
		
		sel.selectByVisibleText("Option 1");
		
		Thread.sleep(3000);
		
		sel.selectByValue("2");
		
		Thread.sleep(3000);
		
		sel.selectByIndex(1);
		
		Thread.sleep(3000);
		BrowserInvoke.closeBrowser();

	}

}
