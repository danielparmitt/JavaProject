package org.exam.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.onlineexam.dto.QuestionDTO;

public class ExcelUpload {
	
	public static ArrayList<QuestionDTO> readExcel(String path) throws IOException {
		int columnCount;
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rows = sheet.rowIterator();
		ArrayList<QuestionDTO> questions = new ArrayList<QuestionDTO>();
		
		while(rows.hasNext()) {
			Row row = rows.next();
			
			
			Iterator<Cell> cells = row.cellIterator(); 
			QuestionDTO dto = new QuestionDTO();
			
			columnCount = 1;
			
			while(cells.hasNext()) {
				Cell cell = cells.next();
				if(cell.getCellType() == CellType.STRING) {
					if(columnCount == 1) {
						dto.setQuestion(cell.getStringCellValue());
					}
					else if(columnCount == 2) {
						dto.setOptiona(cell.getStringCellValue());
					}
					else if(columnCount == 3) {
						dto.setOptionb(cell.getStringCellValue());
					}
					else if(columnCount == 4) {
						dto.setOptionc(cell.getStringCellValue());
					}
					else if(columnCount == 5) {
						dto.setOptiond(cell.getStringCellValue());
					}
				}
				else if(cell.getCellType() == CellType.NUMERIC) {
					if(columnCount == 6) {
//						dto.setId(Double.toString(cell.getNumericCellValue()));
					}
				}
				columnCount++;
			}
			questions.add(dto);
		}
		
		workbook.close();
		fis.close();
		
		return questions;
	}
	
	public static void main(String[] args) throws IOException {
		ArrayList<QuestionDTO> questions = ExcelUpload.readExcel("/Users/vikrant/Documents/Book1.xls");
		
		for(QuestionDTO question:questions) {
			System.out.println(question);
		}
	}
}
