package snippet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	public void writeData() throws IOException {
		String[][] name = {{"Gokul"},{"Arun"}};
		FileInputStream inputStream = new FileInputStream("data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		for(int i=0; i<name.length;i++) {
			XSSFRow row = sheet.createRow(rowCount+i+1);
			for(int j=0; j<name[i].length;j++) {
				XSSFCell createCell = row.createCell(5);
//				createCell.setCellValue(name[i][j]);
			}
		}
		FileOutputStream outputStream = new FileOutputStream("data.xlsx");
		workbook.write(outputStream);
		workbook.close();
		inputStream.close();
		outputStream.close();
		
	}
	
}
