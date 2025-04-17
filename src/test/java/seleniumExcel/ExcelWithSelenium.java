package seleniumExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.BrowserInvoke;
import util.ExcelUtils;

public class ExcelWithSelenium {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {


		//driver=BrowserInvoke.openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		XSSFSheet sheet=ExcelUtils.retSheetData("C:/demo/employee.xlsx", "URLs");
		
		
		int row=sheet.getLastRowNum()+1;

		int col=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				driver.get(sheet.getRow(i).getCell(j).toString());
				System.out.println(driver.getTitle());
				
			}
		}
		
		
		driver.quit();
		//BrowserInvoke.closeBrowser();

	}

}
