package com.medsol.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Testutils {
	
	
	static Workbook book;
	static Sheet sheet;
	
	public static String TESTDATA_SHEET_PATH="C:\\Users\\user\\git\\Medsol\\Medsol\\src\\test\\java\\com\\medsol\\testdata\\LoginData.xlsx";
	
	public static Object[][] getTestData(String sheetname) throws InvalidFormatException {
		
		FileInputStream file=null;
		try {
			file= new FileInputStream(TESTDATA_SHEET_PATH);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(file);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		sheet=book.getSheet(sheetname);
		Object[][]data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum();i++) {
			for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
		
	}
	

}
