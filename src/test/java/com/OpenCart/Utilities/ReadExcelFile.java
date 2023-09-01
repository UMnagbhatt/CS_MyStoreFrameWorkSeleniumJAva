package com.OpenCart.Utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile 
{
 
	public static FileInputStream inputStream; 
	public static XSSFWorkbook workbook; 
	public static XSSFSheet excelSheet; 
	public static XSSFRow row; 
	public static XSSFCell cell; 
	
	
	public  static String getCellValue(String fileName, String sheetName, int rowNo, int CellNo)
	{
		try
		{
		
		inputStream = new FileInputStream(fileName);
		workbook = new XSSFWorkbook (inputStream);
		excelSheet = workbook.getSheet(sheetName);
		cell = workbook.getSheet(sheetName).getRow(rowNo).getCell(CellNo);
		
		workbook.close();
		
		return  cell.getStringCellValue();
		}
		catch (Exception e)
		{
			return " ";
		}
	}
		
		public static int getRowCount( String fileName, String sheetName)
		{
			try
			{
				
				inputStream = new FileInputStream(fileName);
				workbook = new XSSFWorkbook (inputStream);
				excelSheet = workbook.getSheet(sheetName);
				
				int ttlrow = excelSheet.getLastRowNum() + 1;
				workbook.close();
				return ttlrow;
		}
		
			catch (Exception e)	
			{
				return 0;
			}

		
		}
		
		public static int getColCount( String fileName, String sheetName)
		{
			try
			{
				inputStream = new FileInputStream(fileName);
				workbook = new XSSFWorkbook (inputStream);
				excelSheet = workbook.getSheet(sheetName);
				
				int ttlcol = excelSheet.getRow(0).getLastCellNum();
				workbook.close();
				return ttlcol;
			}
			catch (Exception e)
			{
				return 0;
			}
		}
		
}

