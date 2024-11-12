package ApacheOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteXLS2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir")+"//StreamDemo//Text2.xls");
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("Employee");
		System.out.println("Sheet "+sheet.getSheetName()+" is Successfully Created");
		
		HSSFRow row1 = sheet.createRow(0);
		HSSFCell cell11 = row1.createCell(0);
		HSSFCell cell12 = row1.createCell(1);
		HSSFCell cell13 = row1.createCell(2);
		cell11.setCellValue("ID");
		cell12.setCellValue("Name");
		cell13.setCellValue("City");
		
		HSSFRow row2 = sheet.createRow(1);
		HSSFCell cell21 = row2.createCell(0);
		HSSFCell cell22 = row2.createCell(1);
		HSSFCell cell23 = row2.createCell(2);
		cell21.setCellValue("101");
		cell22.setCellValue("Vijay");
		cell23.setCellValue("Pune");
		FileOutputStream fos = new FileOutputStream(f);
		try 
		{
			wb.write(fos);
			System.out.println("Data is added to sheet successfully");
			wb.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
