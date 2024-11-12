package ApacheOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreateFile1XLS {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * Create an Excel file and Set Test Inputs
		 * and perform all  the regarding operations
		 * 
		 * Classes needed
		 * File Class
		 * FileOutputStream
		 */
		File f = new File(System.getProperty("user.dir")+"//StreamDemo//Text1.xls");
		FileOutputStream fos = new FileOutputStream(f);
		System.out.println("File Is Successfully Created");

	}

}
