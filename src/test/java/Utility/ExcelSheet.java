package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet 
{
public static String ExcelData(int row,int cell) throws EncryptedDocumentException, IOException
{
	String path="C:\\Users\\Hp840G2_2\\Desktop\\Amazon cart testcases.xlsx";
	FileInputStream file=new FileInputStream(path);
	String sheet=WorkbookFactory.create(file).getSheet(path).getRow(0).getCell(0).getStringCellValue();
	return sheet;
}
}
