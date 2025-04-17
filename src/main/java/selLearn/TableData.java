package selLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.BrowserInvoke;

public class TableData {
	

	static WebDriver driver;

	public static void main(String[] args) throws Exception {


		driver=BrowserInvoke.openBrowser("https://the-internet.herokuapp.com/tables");
	
		
		String data=driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[1]/td[1]")).getText();
		System.out.println(data);
		
		
		int row=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr")).size();
		int col=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]/td")).size();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				
				
				if(j==2 || j==4) {
				String dataa=driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+i+"]/td["+j+"]")).getText();
				if(dataa.contains("John")) {
					System.out.print(dataa+"\t");
				}
				}
			}
			System.out.println();
		}
		
		
		
		BrowserInvoke.closeBrowser();
		
		
		
	}

}
