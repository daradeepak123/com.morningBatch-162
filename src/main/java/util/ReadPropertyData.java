package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyData {
	
	public static String readData(String filePath, String propertyValue) throws Exception
	{
		File file=new File(System.getProperty("user.dir")+filePath);

		FileInputStream fis=new FileInputStream(file);
		
		Properties config=new Properties();
		config.load(fis);
		
		return config.getProperty(propertyValue);
	}
	
	
	

}
