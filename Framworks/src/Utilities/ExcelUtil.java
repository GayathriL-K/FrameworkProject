package Utilities;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static XSSFWorkbook wb;

	public static XSSFSheet sh;

	public static XSSFRow r;

	public static XSSFCell c;

	public static void setexcel(String path,String Sheetname) throws IOException
	{
		FileInputStream fs = new FileInputStream(path);
	    // Access the required test data sheet
	    wb = new XSSFWorkbook(fs);
	    sh = wb.getSheet(Sheetname);
	}

	public static String getcell(int row,int col)
	{
		c=sh.getRow(row).getCell(col);
		
		String value = null;
		
		if(c.getCellType().name().equals("NUMERIC")) {
			int i = (int)c.getNumericCellValue();
			value = String.valueOf(i);
		}
			else if(c.getCellType().name().equals("NUMERIC"))
			{
				long d= (long)c.getNumericCellValue();
				value=String.valueOf(d);
			}
			 else  {
			value = c.getStringCellValue();
			
			}
		
		return value;
	}

	public static void setcell(String result,int rno,int cno) throws IOException
	{
		 r  = sh.getRow(rno);
		 c = r.getCell(cno);
		            if (c == null) {
		                c = r.createCell(cno);
		                c.setCellValue(result);
		                } else {
		                    c.setCellValue(result);
		                }
		         // Constant variables Test Data path and Test Data file name
		            FileOutputStream fileOut = new FileOutputStream(Constant.path_Testdata + Constant.file);
		    	    wb.write(fileOut);
		    	    fileOut.flush();
		    	  fileOut.close();
	}

	public static void setexcel1(String paths,String sheets) throws IOException 

	{
		FileOutputStream fileOut = new FileOutputStream(Constant.path_Testdata + Constant.file);
	    wb.write(fileOut);
	    fileOut.flush();
	  fileOut.close();
	}

}