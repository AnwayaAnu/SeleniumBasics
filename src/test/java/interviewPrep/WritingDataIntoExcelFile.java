package interviewPrep;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcelFile {

	public static void main(String[] args) throws IOException 
	{
		String data;
		Scanner s  = new Scanner(System.in);
		FileOutputStream fout = new FileOutputStream("/Users/anwaya/eclipse-workspace/SeleniumBasics/testdata/cnt.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("data");
		
		for(int i=0;i<5;i++)
		{
			XSSFRow row = sheet.createRow(i);
			for(int j=0;j<1;j++)
			{
				XSSFCell cell = row.createCell(j);
				System.out.println("Enter data");
				data = s.nextLine();
				cell.setCellValue(data);
			}
		}
		
		workbook.write(fout);
		workbook.close();
		fout.close();
	}
}
