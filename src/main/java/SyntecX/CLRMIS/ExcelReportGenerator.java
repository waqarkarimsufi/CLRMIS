package SyntecX.CLRMIS;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelReportGenerator implements IReporter {
    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        // Create a workbook and sheet
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("TestNG Results");

        // Create header row
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Test Name");
        headerRow.createCell(1).setCellValue("Status");

        // Use an array to store rowNum (mutable)
        final int[] rowNum = {1};

        // Populate the rows with test results
        for (ISuite suite : suites) {
            suite.getResults().forEach((testName, result) -> {
                result.getTestContext().getPassedTests().getAllResults().forEach(testResult -> {
                    Row row = sheet.createRow(rowNum[0]++);
                    row.createCell(0).setCellValue(testResult.getName());
                    row.createCell(1).setCellValue("PASSED");
                });

                result.getTestContext().getFailedTests().getAllResults().forEach(testResult -> {
                    Row row = sheet.createRow(rowNum[0]++);
                    row.createCell(0).setCellValue(testResult.getName());
                    row.createCell(1).setCellValue("FAILED");
                });

                result.getTestContext().getSkippedTests().getAllResults().forEach(testResult -> {
                    Row row = sheet.createRow(rowNum[0]++);
                    row.createCell(0).setCellValue(testResult.getName());
                    row.createCell(1).setCellValue("SKIPPED");
                });
            });
        }

        // Write to Excel file
        try (FileOutputStream fileOut = new FileOutputStream("TestNG_Excel_Report.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
