package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelXlsfile {
	static String text = null;
public  static void writeexcel() throws IOException {
	HSSFWorkbook workbok = new HSSFWorkbook();
	HSSFSheet worksheet = workbok.createSheet("Sheet 1");
	
	int rownum = 0;
	
	for(int i =1;i<=10;i++) {
		
		HSSFRow row = worksheet.createRow(rownum++);
		int colnum=0;
		
		for(int j=1;j<=10;j++) {
			
			HSSFCell cell = row.createCell(colnum++);
			cell.setCellValue("Sumathi Mukkera"+ i +j+1);
			
		}
	}
	
//	String path = System.getProperty(("user.dir")+"/src/test/resources/TestData/Demo1.xls");
//	File Excelfile = new File(path);
	File Excelfile = new File(text + ".xls");
	FileOutputStream FOS = null;
	try {
	 FOS = new FileOutputStream(Excelfile);
	 workbok.write(FOS);
	 workbok.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		
		FOS.close();
	}
}
public  static void readexcel() throws IOException {
	//String path = System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xls";
	File Excelfile = new File(text+".xls");
	
	FileInputStream Fis = new FileInputStream(Excelfile);
	HSSFWorkbook workbook = new HSSFWorkbook(Fis);
	HSSFSheet sheet = workbook.getSheet("Sheet 1");
	
	Iterator<Row> row = sheet.rowIterator();
	//Iterator<HSSFRow> row = sheet.rowIterator();
	
	while(row.hasNext()) {
		Row currRow =  row.next();
		Iterator<Cell> cell = currRow.cellIterator();
		
		while(cell.hasNext()) {
			Cell currCell = cell.next();
			System.out.print(currCell.getStringCellValue()+" ~ ");
		}
		System.out.println();
		
	}
	
	HSSFRow newRow = sheet.createRow(12);
	HSSFCell newCell = newRow.createCell(13);
	newCell.setCellValue("Vijayabharathi");
	FileOutputStream Fos = new FileOutputStream(Excelfile);
	workbook.write(Fos);
	workbook.close();
	
	
}
public static void main(String[] args) throws IOException {
	writeexcel();
	//readexcel();
}
}
