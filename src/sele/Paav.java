package sele;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Paav {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./excel2/datadriven.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s = book.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(2);
		String value = c.getStringCellValue();
		System.out.println(value);
	}
}
