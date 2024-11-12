package ApacheOperations;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WriteReadXLSX {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir")+"//StreamDemo//Text21.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("DepartmentNames");
		System.out.println("Name of the Sheet :: "+sheet.getSheetName());
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("IT Department");
		XSSFRow row1 = sheet.createRow(1);
		cell = row1.createCell(0);
		cell.setCellValue("Finance");
		XSSFRow row2 = sheet.createRow(2);
		cell = row2.createCell(0);
		cell.setCellValue("HR");
		XSSFRow row3 = sheet.createRow(3);
		cell = row3.createCell(0);
		cell.setCellValue("Marketing");
		
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
		
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wbr = new XSSFWorkbook(fis);
		XSSFSheet sheetr = wbr.getSheet("DepartmentNames");
		XSSFRow rowr = sheetr.getRow(0);
		XSSFCell cellr = rowr.getCell(0);
		System.out.println(cellr.getStringCellValue());
		XSSFRow rowr1 = sheetr.getRow(1);
		cellr = rowr1.getCell(0);
		System.out.println(cellr.getStringCellValue());
		XSSFRow rowr2 = sheetr.getRow(2);
		cellr = rowr2.getCell(0);
		System.out.println(cellr.getStringCellValue());
		XSSFRow rowr3 = sheetr.getRow(3);
		cellr = rowr3.getCell(0);
		System.out.println(cellr.getStringCellValue());
		
		wbr.close();
		
	}

}
