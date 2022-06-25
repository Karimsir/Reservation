package ExcelReader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ReadXls {
	@Test
public void readdata()throws IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\Mani\\Desktop\\Vara\\Mani_auto.xls");
	HSSFWorkbook wb=new HSSFWorkbook(f1);
	HSSFSheet ws=wb.getSheet("Sheet1");
	HSSFRow row=ws.getRow(3);
	HSSFCell cell=row.getCell(0);
	System.out.println(cell);
}
public static void main(String[]args)throws IOException
{
	 ReadXls obj=new  ReadXls();
	 obj.readdata();
}
}

