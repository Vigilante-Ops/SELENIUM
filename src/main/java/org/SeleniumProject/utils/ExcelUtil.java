package org.SeleniumProject.utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtil
{
    private static final String testDataPath="./src/main/java/org/SeleniumProject/utils/Test.xlsx";
    private static Workbook workbook;
    private static Sheet sheet;
    public static void main(String[] args) throws IOException, InvalidFormatException {
        FileInputStream inputStream=new FileInputStream(testDataPath);
        workbook=WorkbookFactory.create(inputStream);
        sheet=  workbook.getSheet("customer");
        System.out.println(sheet.getRow(0).getLastCellNum());

        for (int i=0;i<sheet.getLastRowNum();i++)
        {
            for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
            {
                System.out.print(sheet.getRow(i+1).getCell(j)+" ");
            }
            System.out.println();
        }


    }
}
