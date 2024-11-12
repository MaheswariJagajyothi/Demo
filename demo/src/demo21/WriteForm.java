package demo21;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteForm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("StreamDemo//Form.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw =new BufferedWriter(fw);
		//System.out.println("File is created");
		
		String fn = "FirstName :: Capgemini";
		bw.write(fn);
		bw.newLine();
		String ln = "LastName :: Automation";
		bw.write(ln);
		bw.newLine();
		String jt = "JobTitle :: QA";
		bw.write(jt);
		bw.newLine();
		String city = "City :: Bengaluru";
		bw.write(city);
		
		bw.close();
		
		System.out.println("Data is Written in File");
	}

}
