package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	public static Object fetchPropertiesValue(String key) throws IOException {
		
		FileInputStream file =new FileInputStream("./config/config.properties");
		
		Properties prop=new Properties();
		
		prop.load(file);
		
		return prop.get(key);
	}

}
