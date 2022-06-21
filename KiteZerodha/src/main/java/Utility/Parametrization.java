package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {









	public static String getData(String Sheet, int row, int cell) throws EncryptedDocumentException, IOException  
	{
		FileInputStream file=new FileInputStream("E:\\Kalyani\\TestingCourse\\Automation\\KiteZerodha\\src\\test\\resources\\KiteZeordha.xlsx");
		String value=WorkbookFactory.create(file).getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

	
}