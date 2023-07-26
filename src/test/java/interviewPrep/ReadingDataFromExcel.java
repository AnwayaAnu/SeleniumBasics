package interviewPrep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fin = new FileInputStream(System.getProperty("user.dir")+"/testdata/"+"countries.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		
		XSSFSheet sheet = workbook.getSheet("login");
		
		
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<=rows;i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<cols;j++)
			{
				XSSFCell cell = row.getCell(j);
				System.out.print(cell.toString()+"         ");
			}
			System.out.println();
		}
		
		workbook.close();
		fin.close();
		
		
	}

}
