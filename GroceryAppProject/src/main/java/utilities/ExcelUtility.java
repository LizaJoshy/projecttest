package utilities;

	import java.io.FileInputStream;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;

		import java.io.IOException;

		//import org.apache.poi.xssf.usermodel.XSSFCell;
		//import org.apache.poi.xssf.usermodel.XSSFRow;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		public class ExcelUtility {
			
			static FileInputStream f;
			static XSSFWorkbook w;
			static XSSFSheet sh;
			public static String readStringData(int row,int col)throws IOException
			{
				f=new  FileInputStream("C:\\Users\\lizaj\\Pictures\\Liza\\Sent\\excel.xlsx");
				w=new XSSFWorkbook(f);
				sh=w.getSheet("Sheet1");
				Row r=sh.getRow(row);
				Cell c=r.getCell(col);
				return c.getStringCellValue();
			
			
				
			}
			public static String readIntegerData(int row,int col)throws IOException
			{
				f=new  FileInputStream("C:\\Users\\lizaj\\Pictures\\Liza\\Sent\\excel.xlsx");
				w=new XSSFWorkbook(f);
				sh=w.getSheet("Sheet1");
				Row r=sh.getRow(row);
				Cell c=r.getCell(col);
				int val=(int) c.getNumericCellValue();
				return  String.valueOf(val);
			//	return c.getStringCellValue();
			
			
				
			}

}
