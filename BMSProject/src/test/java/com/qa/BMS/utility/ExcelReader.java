    package com.qa.BMS.utility;

	import java.io.FileInputStream;

	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelReader {
		private Workbook wb;
		private Sheet sheetName;
		private Row row;

		public ExcelReader(String sheetPath) throws IOException {
			FileInputStream fis = new FileInputStream(sheetPath);
			wb = new XSSFWorkbook(fis);
		}

		public int getRowCount(String sheet_name) {
			sheetName = wb.getSheet(sheet_name);
			int lastRowNum = sheetName.getLastRowNum();// 3---0-3=4
//			int firstRowNum = sheetName.getFirstRowNum();//0
//			int ttlRows = lastRowNum-firstRowNum +1;
			// or
			int ttlRows = lastRowNum + 1;
			return ttlRows;
		}

		public int getColCount() {
			row = sheetName.getRow(0);
			short lastCellNum = row.getLastCellNum();//2
			short firstCellNum = row.getFirstCellNum();//0
			int ttlColCount=lastCellNum - firstCellNum;//2-0
			return ttlColCount;
		}
	}
		
//		// to read the data from cell
//		public String getCellData(int rNum,int cNum) {
//			String cellVal = sheetName.getRow(rNum).getCell(cNum).getStringCellValue()
//					.toString();
//			return cellVal;
//	}
//		public static void main(String[] args) throws IOException {
//			// 1. get the path of Excel Sheet
//			String sheetPath = System.getProperty("user.dir") 
//					+ "\\src\\TestData\\TestData.xlsx";
//			ExcelReader xlr = new ExcelReader(sheetPath);
//			// 2. To get Row Count
//			int rCount = xlr.getRowCount("login");
//			System.out.println("Row Count-"+rCount);
//
//			// 3.Count Col nums
//			int cCount = xlr.getColCount();
//			System.out.println("Col Count-"+cCount);
//			String colVal = xlr.getCellData(1,1);
//			System.out.println("CellDaTA-"+colVal);
//		}
//	}
