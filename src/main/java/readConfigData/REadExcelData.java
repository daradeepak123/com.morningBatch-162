package readConfigData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class REadExcelData {

	public static void main(String[] args) throws Exception {




		File file =new File("C:/demo/employee.xlsx");

		FileInputStream fis=new FileInputStream(file);

		XSSFWorkbook wb=new XSSFWorkbook(fis);

		XSSFSheet sheet=wb.getSheet("Sheet1");

		System.out.println(sheet.getRow(0).getCell(0).toString());

		int row=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum()-1;

		String data[][]=new String[row+1][col+1];


		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{

				data[i][j]=sheet.getRow(i).getCell(j).toString();
				//System.out.print(sheet.getRow(i).getCell(j).toString()+"\t\t");
			}
			//System.out.println();
		}



		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(data[i][j]+"\t\t");
			}
			System.out.println();
		}
	}


}


