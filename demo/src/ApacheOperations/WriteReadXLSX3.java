package ApacheOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteReadXLSX3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Employee Data");
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
		data.put("2", new Object[] {1, "Amit", "Shukla"});
		data.put("3", new Object[] {2, "Lokesh", "Gupta"});
		data.put("4", new Object[] {3, "John", "Adwards"});
		data.put("5", new Object[] {4, "Brian", "Schultz"});
		Set<String> keyset = data.keySet();
		int rownum=0;
		for(String key:keyset)
		{
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum =0 ;
			for(Object obj:objArr)
			{
				Cell cell=row.createCell(cellnum++);
				if(obj instanceof String)
					cell.setCellValue((String)obj);
				else if(obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
		}
		File f = new File("StreamDemo//Text23.xlsx");
		try
		{
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			fos.close();
			System.out.println("Map data is written successfully on to the sheet");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wbr = new XSSFWorkbook(fis);
		XSSFSheet sheetr = wb.getSheet("Employee Data");
		
		int noofrows = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<noofrows;i++)
		{
			Row row = sheet.getRow(i);
			int noofcells = row.getPhysicalNumberOfCells();
			for(int j=0;j<noofcells;j++)
			{
				System.out.print(row.getCell(j)+"\t");
			}
			System.out.println();
		}
	}

}
