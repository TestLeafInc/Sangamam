package utils;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelForDataProvider {
	
	public static String[][] readExcelData(String sheetName) throws InvalidFormatException, IOException {
		
		// Workbook
		File excelFileName = new File("./data/Leads.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(excelFileName);
		
		// Sheet
		XSSFSheet sheet = wbook.getSheet(sheetName);
		
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum(); // how many columns?
		
		String[][] data = new String[rowCount][columnCount];
			
		for (int i = 1; i <= rowCount; i++) {
			// Row
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				// Column / Cell
				XSSFCell cell = row.getCell(j);
				// Print all the column values
				System.out.println(cell.getStringCellValue());
				data[i-1][j] = cell.getStringCellValue();
			} 
		}
		// Close the workbook
		wbook.close();
		
		return data;
		
	}

}
