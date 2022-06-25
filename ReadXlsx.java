package ExcelReader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXlsx {
	
public void readdata()throws IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\Mani\\Desktop\\Vara\\Vara_auto.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f1);
	XSSFSheet ws=wb.getSheet("Myntra");
	XSSFRow row=ws.getRow(2);
	XSSFCell cell=row.getCell(0);
	System.out.println(cell);
}
public static void main(String[]args)throws IOException
{
	ReadXlsx obj=new ReadXlsx();
	obj.readdata();
}
}
