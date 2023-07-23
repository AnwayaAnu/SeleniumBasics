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
		FileOutputStream fout = new FileOutputStream("/Users/anwaya/eclipse-workspace/SeleniumBasics/testdata/countries.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("login");
		
		for(int i =0;i<4;i++)
		{
			XSSFRow row = sheet.createRow(i);
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter data: ");
				data = s.next();
				XSSFCell cell = row.createCell(j);
				cell.setCellValue(data);
			}
		}
		
		workbook.write(fout);
		workbook.close();
		fout.close();
	}
}
