package ApacheOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteReadXLSX2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir")+"//StreamDemo//Text22.xlsx");
		System.out.println("File is Successfully Created");
		FileOutputStream fos = new FileOutputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Employee Details");
		System.out.println("Sheet is Successfully Created :: "+sheet.getSheetName());
		XSSFRow row = sheet.createRow(0);
		XSSFRow row1 = sheet.createRow(1);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Name");
		cell = row.createCell(1);
		cell.setCellValue("Mail ID");
		cell = row.createCell(2);
		cell.setCellValue("Mob No");
		cell = row.createCell(3);
		cell.setCellValue("Age");
		cell = row.createCell(4);
		cell.setCellValue("Hobby");
		cell = row.createCell(5);
		cell.setCellValue("Gender");
		cell = row.createCell(6);
		cell.setCellValue("State");
		cell = row.createCell(7);
		cell.setCellValue("City");
		
		cell = row1.createCell(0);
		cell.setCellValue("Peter");
		cell = row1.createCell(1);
		cell.setCellValue("peter@gmail.com");
		cell = row1.createCell(2);
		cell.setCellValue("7665354389");
		cell = row1.createCell(3);
		cell.setCellValue("28");
		cell = row1.createCell(4);
		cell.setCellValue("FootBall");
		cell = row1.createCell(5);
		cell.setCellValue("Male");
		cell = row1.createCell(6);
		cell.setCellValue("Karnataka");
		cell = row1.createCell(7);
		cell.setCellValue("Bengaluru");
		
		try 
		{
			wb.write(fos);
			System.out.println("Data is successfully Entered into sheet");
			wb.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("------------------------------------------------------------------");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wbr = new XSSFWorkbook(fis);
		XSSFSheet sheetr = wbr.getSheet("Employee Details");
		int noofrows = sheetr.getPhysicalNumberOfRows();
		System.out.println("No of rows :: "+noofrows);
		XSSFRow rowr1 = sheet.getRow(0);
		int noofcells = rowr1.getPhysicalNumberOfCells();
		System.out.println("No of columns :: "+noofcells);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Displaying Headers in one row :: ");
		for(int i=0;i<noofrows;i++)
		{
			for(int j=0;j<noofcells;j++)
			{
				System.out.print(sheetr.getRow(i).getCell(j).getStringCellValue()+"\t");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Displaying Headers in one Column :: ");
		for(int i=0;i<noofcells;i++)
		{
			for(int j=0;j<noofrows;j++)
			{
				System.out.print(sheetr.getRow(j).getCell(i).getStringCellValue()+"\t");
			}
			System.out.println();
		}
		wbr.close();
	}

}
