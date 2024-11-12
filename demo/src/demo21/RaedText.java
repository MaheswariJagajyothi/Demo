package demo21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RaedText {

	static File f ;
	static FileReader fr;
	static BufferedReader br;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		f= new File(System.getProperty("user.dir")+"//StreamDemo//Login.txt");
		//System.out.println("File Name :: "+f.getName());
		fr = new FileReader(f);
		br = new BufferedReader(fr);
		//System.out.println("File is created");
		String line = null;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
	}

}
