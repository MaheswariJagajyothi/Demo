package ApacheOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StyleIntroXLSX4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet();
		XSSFRow row = sheet.createRow(0);
		XSSFCellStyle style = wb.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
		style.setFillPattern(FillPatternType.BIG_SPOTS);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("X");
		cell.setCellStyle(style);
		
		style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell = row.createCell(1);
		cell.setCellValue("Y");
		cell.setCellStyle(style);
		
		Font font = wb.createFont();
		font.setFontHeightInPoints((short)24);
		font.setFontName("Courier New");
		font.setItalic(true);
		font.setStrikeout(true);
		
		style = wb.createCellStyle();
		style.setFont(font);
		
		cell = row.createCell(2);
		cell.setCellValue("Z");
		cell.setCellStyle(style);
		
		
		File f = new File(System.getProperty("user.dir")+"//StreamDemo//Text24.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		try
		{
			wb.write(fos);
			System.out.println("Data is Written into Sheet");
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
