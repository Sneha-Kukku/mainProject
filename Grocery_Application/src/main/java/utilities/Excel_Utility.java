package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.invoke.ConstantBootstraps;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constant;

public class Excel_Utility {
	static FileInputStream f; //class in java to get the details from the file
	static XSSFWorkbook wb; //class to get details from the workbook
	static XSSFSheet sh; //class to get details from excel sheet
	public static String getStringData(int a,int b,String sheet) throws IOException 
	{
		f=new FileInputStream(Constant.EXCELPATH);
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}
	public static String getIntegerData(int a,int b,String sheet) throws IOException
	{
		f=new FileInputStream(Constant.EXCELPATH);
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int s=(int)c.getNumericCellValue();
		return String.valueOf(s) ;
		
	}


}
