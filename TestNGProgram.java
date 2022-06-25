package ExcelReader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestNGProgram {
	@Test
public void readdata()throws IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\Mani\\eclipse-workspace\\Google\\src\\main\\resources\\TestData\\Vara_auto.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f1);
	XSSFSheet ws=wb.getSheet("Twitter");
	XSSFRow row=ws.getRow(2);
	XSSFCell cell=row.getCell(2);
	System.out.println(cell);
}
public static void main(String[]args)throws IOException
{
	TestNGProgram obj=new TestNGProgram();
	obj.readdata();
}
}

