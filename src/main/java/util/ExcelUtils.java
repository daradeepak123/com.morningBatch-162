package util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	public static XSSFSheet retSheetData(String path,String sheetName) throws Exception
	{
		File file =new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetName);		
		return sheet;
	}
	
	public static int retLastActiveRow(String path,String sheetName) throws Exception
	{
		File file =new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetName);		
		return sheet.getLastRowNum()+1;
	}
	
	public static String specfData(String path,String sheetName, int row,int col) throws Exception
	{
		File file =new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetName);	
		return sheet.getRow(row).getCell(col).toString();
	}
	
	

}
