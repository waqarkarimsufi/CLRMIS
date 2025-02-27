package SyntecX.CLRMIS;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;

public class ExcelUtils {
    public static Object[][] readExcel(String filePath, String sheetName) {
        Object[][] data = null;
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            int rowCount = sheet.getLastRowNum(); 
            int colCount = sheet.getRow(0).getLastCellNum(); 

            data = new Object[rowCount][colCount];
            for (int i = 1; i <= rowCount; i++) { 
                Row row = sheet.getRow(i);
                for (int j = 0; j < colCount; j++) {
                    Cell cell = row.getCell(j);
                    data[i - 1][j] = cell.toString(); 
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
