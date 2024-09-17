import java.io.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Inventory {

    // Reads data from the xls file
    public static String ReadExcel(String sheetName, int rNum, int cNum) {
        String data = "";
        try {
            FileInputStream fis = new 
            FileInputStream("C:\\Users\\Isaac\\VSCode\\Java\\ICS4U1 CPT\\Coffee Shop Simulator\\Coffee House Inventory.xlsx");

            Workbook wb = WorkbookFactory.create(fis);
            Sheet sheet = wb.getSheet(sheetName);
            Row row = sheet.getRow(rNum);
            Cell c = row.getCell(cNum);

            if (c.getCellType()==CellType.STRING)
                data = c.getStringCellValue();

            else if (c.getCellType()==CellType.NUMERIC) 
                data = String.valueOf(c.getNumericCellValue());

            FileOutputStream fos = new
            FileOutputStream("C:\\Users\\Isaac\\VSCode\\Java\\ICS4U1 CPT\\Coffee Shop Simulator\\Coffee House Inventory.xlsx");

            wb.write(fos);
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    // Writes data to the xls file
    public static void WriteExcel(String sheetName, int rNum, int cNum, double data) {
        try {
            FileInputStream fis = new 
            FileInputStream("C:\\Users\\Isaac\\VSCode\\Java\\ICS4U1 CPT\\Coffee Shop Simulator\\Coffee House Inventory.xlsx");

            Workbook wb = WorkbookFactory.create(fis);
            Sheet sheet = wb.getSheet(sheetName);
            Row row = sheet.getRow(rNum);
            Cell c = row.createCell(cNum);
            c.setCellValue(data);

            FileOutputStream fos = new 
            FileOutputStream("C:\\Users\\Isaac\\VSCode\\Java\\ICS4U1 CPT\\Coffee Shop Simulator\\Coffee House Inventory.xlsx");
            wb.write(fos);

        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}