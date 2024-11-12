package ApacheOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadXLS2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir")+"//StreamDemo//Text2.xls");
		FileInputStream fis = new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheet("Employee");
		HSSFRow row1 = sheet.getRow(0);
		HSSFRow row2 = sheet.getRow(1);
		HSSFCell cell11 = row1.getCell(0);
		HSSFCell cell12 = row1.getCell(1);
		HSSFCell cell13 = row1.getCell(2);
		HSSFCell cell21 = row2.getCell(0);
		HSSFCell cell22 = row2.getCell(1);
		HSSFCell cell23 = row2.getCell(2);
		System.out.print(cell11.getStringCellValue()+"\t");
		System.out.print(cell12.getStringCellValue()+"\t");
		System.out.println(cell13.getStringCellValue());
		System.out.print(cell21.getStringCellValue()+"\t");
		System.out.print(cell22.getStringCellValue()+"\t");
		System.out.println(cell23.getStringCellValue());
		
		System.out.println();
		int noofrows = sheet.getPhysicalNumberOfRows();
		System.out.println("No of Rows :: "+noofrows);
		int noofcolumns = row1.getPhysicalNumberOfCells();
		System.out.println("No of Cells in First Row :: "+noofcolumns);
		noofcolumns = row2.getPhysicalNumberOfCells();
		System.out.println("No of Cells in Second Row :: "+noofcolumns);
		for(int i=0;i<noofrows;i++)
		{
			for(int j=0;j<noofcolumns;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"\t");
			}
			System.out.println();
		}
		wb.close();
	}

}
