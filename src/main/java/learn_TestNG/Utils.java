package learn_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class Utils {
	
	public static void XL_Read(String Sheet, int r, int c) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String file = "C:\\Users\\Admin\\eclipse-workspace\\TestNG\\src\\test\\resources\\Input.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(file));
		Sheet sh = wb.getSheet(Sheet);
		Row r1 = sh.getRow(r);
		Cell c1 = r1.getCell(c, MissingCellPolicy.CREATE_NULL_AS_BLANK);
		String v = c1.getStringCellValue(); 
		//int lastnum = sh.getLastRowNum();
		System.out.println(v);
		//System.out.println(lastnum);
		
	}
	
	public static int XL_RowNum(String Sheet) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		String file = "C:\\Users\\Admin\\eclipse-workspace\\TestNG\\src\\test\\resources\\Input.xlsx";
		int lastNum = WorkbookFactory.create(new FileInputStream(file)).getSheet(Sheet).getLastRowNum();
		return lastNum;
	}
	
	public static int XL_ColNum(String Sheet, int row)
	{
		String file = "C:\\Users\\Admin\\eclipse-workspace\\TestNG\\src\\test\\resources\\Input.xlsx";
		int cellNum = WorkbookFactory.create(new FileInputStream(file)).getSheet(Sheet).getRow(row).getLastCellNum();
	}

}
