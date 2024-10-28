package com.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_File_Utility extends WebDriver_Utility {

	/**
	 * 
	 * @param sheet
	 * @param row
	 * @param column
	 * @return
	 * @throworkbooks EncryptedDocumentException
	 * @throworkbooks IOException
	 */
	public static String Excel_Data(String sheet, int row, int column) throws IOException {

		fis = new FileInputStream(Iconstant.Excel_File_Path);

		workbook = WorkbookFactory.create(fis);

		Sheet s = workbook.getSheet(sheet);

		Row r = s.getRow(row);

		Cell c = r.getCell(column);

		String result = c.getStringCellValue();
		
		return result;
	}

	/**
	 * 
	 * @param sheet
	 * @return
	 * @throworkbooks EncryptedDocumentException
	 * @throworkbooks IOException
	 */
	public static int columnsize(String sheet) throws IOException {

		FileInputStream fis = new FileInputStream(Iconstant.Excel_File_Path);

		workbook = WorkbookFactory.create(fis);

		Sheet s = workbook.getSheet(sheet);
		
		Row r = s.getRow(0);
		
		return r.getPhysicalNumberOfCells();

	}

	public static int rowsize(String sheet) throws IOException {

		FileInputStream fis = new FileInputStream(Iconstant.Excel_File_Path);

		workbook = WorkbookFactory.create(fis);

		Sheet s = workbook.getSheet(sheet);

		return s.getPhysicalNumberOfRows();

	}

	/**
	 * This method is used to fetch all the data in the excel sheet it will display
	 * the address of object[][]
	 * 
	 * @param sheetName
	 * @return
	 * @return
	 * @throworkbooks IOException
	 */
	public static Object[][] excelAllData(String sheet) throws IOException {

		fis = new FileInputStream(Iconstant.Excel_File_Path);

		workbook = WorkbookFactory.create(fis);

		Sheet s = workbook.getSheet(sheet);

		Object[][] data = new Object[rowsize(sheet)][columnsize(sheet)];
		
		for (int i = 0; i < rowsize(sheet); i++) {
			
			for (int j = 0; j < columnsize(sheet); j++) {
				
				data[i][j] = s.getRow(i).getCell(j).getStringCellValue();

			}
		}
		return data;
	}

}
