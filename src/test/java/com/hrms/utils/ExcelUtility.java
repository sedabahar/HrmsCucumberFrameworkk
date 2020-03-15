package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	private static Workbook book;
	private static Sheet sheet;
	public static void openExcel(String filePath,String sheetName)  {
		/**
		 * This method will open xlfile specified sheet
		 * @param filePath
		 *  @param sheetName
		 */
	
	try {
		FileInputStream file=new FileInputStream(filePath);
		book=new XSSFWorkbook(file);
		sheet=book.getSheet(sheetName);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}		
			
		public static int rowCount() {
			return sheet.getPhysicalNumberOfRows();
		}
			
		
		public static int colsCount() {
			return sheet.getRow(0).getLastCellNum();
		}
				
		public static String getCellData(int rowIndex,int cellIndex) {
			return sheet.getRow(rowIndex).getCell(cellIndex).toString();
		}
			
		public static Object[][] excelIntoArray(String filePath,String sheetName) {
			
			openExcel(filePath, sheetName);
			
			
			Object [][]data=new Object[rowCount()-1][colsCount()];
			
			for(int i=1;i<rowCount();i++) {
				for(int y=0;y<colsCount();y++) {
					data [i-1][y]=getCellData(i-1,y);
				}
			}
			return data;
		}
		
		
		
		
		
		
}
