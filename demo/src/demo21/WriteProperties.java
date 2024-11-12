package demo21;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir")+("//StreamDemo//config.properties"));
		FileOutputStream fos = new FileOutputStream(f);
		//System.out.println("Properties File is created");
		
		Properties prop = new Properties();
		prop.put("Browser", "Chrome");
		prop.put("URL", "https://chrome.com");
		
		prop.store(fos, "Browser Name and URL are added to the file");
		
		System.out.println("Data is written in the Properties File");
	}

}
