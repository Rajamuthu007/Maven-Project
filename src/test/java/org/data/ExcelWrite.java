package org.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws IOException {
	File f = new File("G:\\S.Rajamuthu\\Book1.xslx");
	Workbook w = new XSSFWorkbook();
	Sheet createSheet = w.createSheet("abcd");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("Rajamuthu");
	FileOutputStream stream = new FileOutputStream(f);
	w.write(stream);
	System.out.println("stream");
	
	
}
}
