package readExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcel {

	@DataProvider(name = "getchData")
	public static Object[][] readExcel() throws InvalidFormatException, IOException {

		File fis = new File("./data/Login.xlsx");

		XSSFWorkbook wbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = wbook.getSheetAt(0);

		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();	

		String[][] data = new String[rowCount][columnCount];


		for (int i = 1; i <=rowCount; i++) {			
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);

				String cellValue = "";

				if(cell.getCellTypeEnum()==CellType.STRING){					
					cellValue = cell.getStringCellValue();
				}else if(cell.getCellTypeEnum()==CellType.NUMERIC){
					cellValue = ""+(int)cell.getNumericCellValue();					
				}else if(cell.getCellTypeEnum()==CellType.BLANK){
					System.out.println("");
				}

				data[i-1][j] = cellValue;	
			}
		} 
		wbook.close();
		return data;
	}	
}

