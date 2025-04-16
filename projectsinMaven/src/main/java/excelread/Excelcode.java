package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelcode
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;

	public static String readStringData(int row, int col) throws IOException
	      {
		f = new FileInputStream("D:\\JAVA OBSQURA\\data.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		XSSFRow r = sh.getRow(row);
		XSSFCell c = r.getCell(col);
		return c.getStringCellValue();
        	}
	public static String readintegerdata(int row, int col) throws IOException
	        {
		f = new FileInputStream("D:\\JAVA OBSQURA\\data.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");         //getsheet is a  method
		XSSFRow r = sh.getRow(row);
		XSSFCell c = r.getCell(col);
		int value=(int) c.getNumericCellValue();  // datatype of getnumberic cell is double.if we gave as this we got an error so we convert double to int
		return String.valueOf(value);              // convert int to string using valuesof method because we gave  string data type
	    	}
	
	}
	
