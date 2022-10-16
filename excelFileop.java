import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class excelFileop {
   /* public static void main(String[]args){
        ReadExcel();
        WriteExcel();
    }

    private static void WriteExcel() {

    }

    private static void ReadExcel() {
    File fp = new File("");
        try {
            FileInputStream in = new FileInputStream(fp);
            XSSFWorkbook wb = new XSSFWorkbook(in);
            XSSFSheet sheet = wb.getSheet(0);
            Iterator<Row> it = sheet.iterator();

            while(it.hasNext()){
                Row r = it.next();
                Iterator<Cell> ci = r.cellIterator();

                while (ci.hasNext()){
                    Cell c = ci.next();
                    switch (c.getCellType()){
                        case STRING:
                            System.out.println(c.getStringCellValue());
                            break;
                    }

                }
            }
            wb.close();
            in.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    }*/
}
