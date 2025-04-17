package readConfigData;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws Exception {
		
		File file=new File(System.getProperty("user.dir")+"/src/main/resources/config.properties");

		FileInputStream fis=new FileInputStream(file);
		
		Properties config=new Properties();
		config.load(fis);
		
		System.out.println(config.getProperty("url"));
		
		

	}

}
