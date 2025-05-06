package PracticeProblems;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException  
	{
		FileInputStream fin = new FileInputStream("/Users/anwaya/eclipse-workspace/SeleniumBasics/testdata/files.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		
		XSSFSheet sheet = workbook.getSheet("Newdata");
		
		int rw = sheet.getLastRowNum();
		int cl = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<=rw;i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<cl;j++)
			{
				XSSFCell cell = row.getCell(j);
				System.out.print(cell.toString()+" ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
