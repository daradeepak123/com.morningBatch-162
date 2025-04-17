package selLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.BrowserInvoke;



public class OrangeHRMLogin {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {


		driver=BrowserInvoke.openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement uNameTB= driver.findElement(By.xpath("//input[@name='username']"));
		
		WebElement pwdTB=driver.findElement(By.xpath("//input[@name='password']"));
		
		WebElement lgnBTN=driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		uNameTB.clear();
		uNameTB.sendKeys("Admin");
		
		
		
		pwdTB.clear();
		pwdTB.sendKeys("admin123");
		lgnBTN.click();
		
		WebElement db=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		
		if(db.getText().contains("Dashboard"))
		{
			System.out.println("Testcase pass");
		}
		else
		{
			System.out.println("Testcase failed");
		}
		
		
		Thread.sleep(3000);
		BrowserInvoke.closeBrowser();
		
		

	}

}
