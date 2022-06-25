package ExcelReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperties {
	
Properties prop=new Properties();
@Test
public void read()throws IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\Mani\\eclipse-workspace\\Google\\src\\main\\java\\ExcelReader\\Data.Properties");
	prop.load(f1);
	System.out.println(prop.getProperty("Name"));
	System.out.println(prop.getProperty("SurName"));
	System.out.println(prop.getProperty("Location"));
}
public static void main(String[] args)throws IOException
{
	 ReadProperties obj=new  ReadProperties();
	 obj.read();
}
}


	

