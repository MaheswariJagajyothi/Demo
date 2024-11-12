package ApacheOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadXLS1 {
	static File f;
	static FileInputStream fis;
	static HSSFWorkbook wb;
	static HSSFSheet sheet;
	static HSSFRow row;
	static HSSFCell cell1;
	static HSSFCell cell2;
	static HSSFCell cell3;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * Read Data from Excel
		 * Display all data from excel file in console
		 * 
		 * classes needed
		 * File
		 * FileInputStream
		 * 
		 * Get a Workbook --> HSSFWorkbook
		 * Get a Sheet --> HSSFSheet
		 * Get a Row --> HSSFRow
		 * Get a Cell --> HSSFCell
		 * 
		 */
		f = new File(System.getProperty("user.dir")+"//StreamDemo//Text1.xls");
		fis = new FileInputStream(f);
		wb = new HSSFWorkbook(fis);
		sheet = wb.getSheet("LoginCredentials");
		row = sheet.getRow(0);
		cell1 = row.getCell(0);
		cell2 = row.getCell(1);
		cell3 = row.getCell(2);
		System.out.println(cell1.getStringCellValue());
		System.out.println(cell2.getStringCellValue());
		System.out.println(cell3.getStringCellValue());
	}

}
