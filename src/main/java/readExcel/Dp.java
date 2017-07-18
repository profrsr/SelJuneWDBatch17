package readExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Dp {
	
	@Test
	public String[][] readExcel() throws InvalidFormatException, IOException {
		
		
		
		File fis = new File("./data/Login.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][columnCount];
		
		System.out.println(rowCount);
		System.out.println(columnCount);
		
		for (int i = 1; i <=rowCount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < columnCount; j++) {

				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				
				data[i-1][j] = cell.getStringCellValue();

			} 
		}
		return data;
		
		
	}

}
