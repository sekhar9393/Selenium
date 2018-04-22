package data.excel;

import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelImplementation {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workBook = new XSSFWorkbook("./data/createLead.xlsx");
		XSSFSheet sheet = workBook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Rows available "+lastRowNum);
	
		Object[][] data = new Object[lastRowNum][];
		
		for (int j = 1; j <= lastRowNum; j++) {
			XSSFRow row1 = sheet.getRow(j);
			int lastCellNum = row1.getLastCellNum();
		
			
			for (int i = 0; i < lastCellNum; i++) {
				//XSSFRow row = sheet.getRow(j);
				XSSFCell cell = row1.getCell(i);
				System.out.println(cell.getStringCellValue());
			} 
		}


	}

}
