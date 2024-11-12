package demo21;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("StreamDemo//Login.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("File is created");
		
		String username = "Username :: John";
		bw.write(username);
		
		bw.newLine();
		
		String password = "Password :: 12345";
		bw.write(password);
		
		bw.close();
		
		
	}

}

		