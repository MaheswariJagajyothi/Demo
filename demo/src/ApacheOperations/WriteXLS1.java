package ApacheOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteXLS1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * HSSF API
		 * create a Workbook --> HSSFWorkbook
		 * create a Sheet --> HSSFSheet
		 * create a Row --> HSSFRow
		 * create a Cell --> HSSFCell
		 */
		
		File f = new File(System.getProperty("user.dir")+"//StreamDemo//Text1.xls");
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("LoginCredentials");
		System.out.println("Name of the Sheet :: "+sheet.getSheetName());
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = row.createCell(0);
		HSSFCell cell1 = row.createCell(1);
		HSSFCell cell2 = row.createCell(2);
		//Set Inputs
		cell.setCellValue("John@gmail.com");
		cell1.setCellValue("123456");
		cell2.setCellValue("Bangaluru");
		
		FileOutputStream fos = new FileOutputStream(f);
		try 
		{
			wb.write(fos);
			System.out.println("Data is Written Successfully");
			wb.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
