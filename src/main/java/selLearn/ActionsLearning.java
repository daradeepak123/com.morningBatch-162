package selLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.BrowserInvoke;


public class ActionsLearning {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {


		driver=BrowserInvoke.openBrowser("https://the-internet.herokuapp.com/drag_and_drop");
		
		Actions act=new Actions(driver);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='column-b']")); 
		
		
		
		act.contextClick(drag).build().perform();
		
		act.moveToElement(drop).build().perform();
		
		
		
		act.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(5000);
		
		
		BrowserInvoke.closeBrowser();

	}

}
