package readExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String dataSheet) throws InvalidFormatException, IOException {
		
		File fis = new File("./data/"+dataSheet+".xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(rowCount);
		System.out.println(columnCount);
		
		for (int i = 1; i <=rowCount; i++) {			
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				
				if(cell.getCellTypeEnum()==CellType.STRING){					
					System.out.println(cell.getStringCellValue());
				}else if(cell.getCellTypeEnum()==CellType.NUMERIC){
					System.out.println(cell.getNumericCellValue());					
				}else if(cell.getCellTypeEnum()==CellType.BLANK){
					System.out.println("Blank Value");
				}

			} 
		}
		
		
	}

}
