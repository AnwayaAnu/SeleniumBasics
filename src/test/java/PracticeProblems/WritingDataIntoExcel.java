package PracticeProblems;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fin = new FileOutputStream("/Users/anwaya/eclipse-workspace/SeleniumBasics/testdata/files.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Newdata");	
		
		//XSSFRow row= sheet.createRow(3);
		
		for(int i=0;i<3;i++)
		{
			XSSFRow row= sheet.createRow(i);
			
			for(int j=0;j<2;j++)
			{
				XSSFCell cell = row.createCell(j);
				System.out.println("Enter data");
				Scanner s = new Scanner(System.in);
				String data = s.next();
				cell.setCellValue(data);
			}
		}
		
		workbook.write(fin);
		workbook.close();
		fin.close();
		
	}

}
