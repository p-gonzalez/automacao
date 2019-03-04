package escrita;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Escrita {
	public static void main(String []args ) throws Exception{
		
		File src=new File("C:\\excel\\Cadastro1.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		
		FileOutputStream fout=new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
		
	}

}
