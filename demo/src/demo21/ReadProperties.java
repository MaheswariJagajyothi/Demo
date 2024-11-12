package demo21;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir")+"//StreamDemo//config.properties");
		FileInputStream fis = new FileInputStream(f);
		//System.out.println("File Name is :: "+f.getName());
		
		Properties prop = new Properties();
		System.out.println(prop);
		
		prop.load(fis);
		System.out.println(prop);
		
		String str = prop.getProperty("Browser");
		System.out.println("Browser Name :: "+str);
		String str1 = prop.getProperty("URL");
		System.out.println("URL of the Browser :: "+str1);
		
	}

}
