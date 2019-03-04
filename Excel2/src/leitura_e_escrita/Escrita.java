package leitura_e_escrita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Escrita {

    public static void main(String[] args) throws FileNotFoundException, IOException {
      
        FileOutputStream file = new FileOutputStream(new File("C:\\excel\\teste1.xls"));
        
        Workbook wb = new HSSFWorkbook();
        
        Sheet planilha = wb.createSheet("registro");
        
        Row linha = planilha.createRow(0);
        
        Cell celula = linha.createCell(0);
        
        celula.setCellValue("Pablo");
        
        wb.write(file);
        
        file.close();
        
        
    }
    
}