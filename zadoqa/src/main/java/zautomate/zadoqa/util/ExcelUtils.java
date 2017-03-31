package zautomate.zadoqa.util;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import zautomate.zadoqa.datadriver.CaseStep;

public class ExcelUtils {

	public List<CaseStep> readTestCase(File readExcel, File orReadExcel) throws InvalidFormatException, IOException {
		Workbook workbook = WorkbookFactory.create(readExcel);
		List<CaseStep> testCaseSteps = new LinkedList<CaseStep>();
		Sheet sheet = workbook.getSheetAt(0);

		Workbook orWorkBook = WorkbookFactory.create(orReadExcel);
		Sheet orSheet = orWorkBook.getSheetAt(0);
		Map<String, String> orMap = readORMap(orSheet);

		Iterator<Row> rows = sheet.rowIterator();
		while (rows.hasNext()) {
			Row row = rows.next();

			if (row.getRowNum() == 0) {
				continue;
			}

			CaseStep eachStep = new CaseStep();

			if (row.getCell(0) != null) {
				eachStep.setStepNo((int) row.getCell(0).getNumericCellValue());
			}

			if (row.getCell(1) != null) {
				row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
				eachStep.setAction(StringUtils.trim(row.getCell(1).getStringCellValue()));
			}
			if (row.getCell(2) != null) {
				row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
				eachStep.setLocateBy((StringUtils.trim(row.getCell(2).getStringCellValue())));
			}

			if (row.getCell(3) != null) {
				row.getCell(3).setCellType(Cell.CELL_TYPE_STRING);
				String orLocator = orMap.get(StringUtils.trim(row.getCell(3).getStringCellValue()));
				if(row.getCell(3).getStringCellValue().isEmpty()){
				}
				else{
				eachStep.setOrLocator(orLocator);
				}	
			}
			if (row.getCell(4) != null) {
				row.getCell(4).setCellType(Cell.CELL_TYPE_STRING);
				if(row.getCell(4).getStringCellValue().isEmpty()){
				}
				else{
				eachStep.setInputData(StringUtils.trim(row.getCell(4).getStringCellValue()));
				}
			}
			if (row.getCell(5) != null) {
				row.getCell(5).setCellType(Cell.CELL_TYPE_STRING);
				eachStep.setDescription(StringUtils.trim(row.getCell(5).getStringCellValue()));
			}
			if (row.getCell(6) != null) {
				row.getCell(6).setCellType(Cell.CELL_TYPE_STRING);
				eachStep.setExpectedResult(StringUtils.trim(row.getCell(6).getStringCellValue()));
			}
			if (row.getCell(7) != null )  {
				row.getCell(7).setCellType(Cell.CELL_TYPE_STRING);
				if(row.getCell(7).getStringCellValue().isEmpty()){
				}
				else{
				eachStep.setReferenceStep(StringUtils.trim(row.getCell(7).getStringCellValue()));
				}
			}
			testCaseSteps.add(eachStep);
		}
		return testCaseSteps;
	}

	private Map<String, String> readORMap(Sheet orSheet) {

		Map<String,String> orMap = new HashMap<String, String>();
		Iterator<Row> rows = orSheet.rowIterator();

		while (rows.hasNext()) {
			Row row = rows.next();

			if (row.getRowNum() == 0) {
				continue;
			}
			if (row.getCell(0) != null && row.getCell(1) != null) {
				row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
				row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
				row.getCell(1).getStringCellValue();
				orMap.put(StringUtils.trim(row.getCell(0).getStringCellValue()), StringUtils.trim(row.getCell(1).getStringCellValue()));
			}		 
		}
		return orMap;
	}

	public Collection<File> readTestCaseFiles(String folderName) {

		File testCaseFolder = new File(folderName);
		File[] matchingFiles = testCaseFolder.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.startsWith("TestCaseExeSheet");
			}
		});

		Collection<File> testCaseList = new LinkedList<File>();
		String [] extensionList = {"xlsx","xls"};
		if(matchingFiles.length==1)
		{
			File testCaseSheet = matchingFiles[0];
			Workbook workbook = null;
			try {
				workbook = WorkbookFactory.create(testCaseSheet);
			} catch (InvalidFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rows = sheet.rowIterator();
			while (rows.hasNext()) {
				Row row = rows.next();

				if (row.getRowNum() == 0) {
					continue;
				}
				if ((row.getCell(1) == null || row.getCell(1).toString().trim().isEmpty() ) && row.getCell(0)!=null ) {
					row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
					String moduleName = row.getCell(0).getStringCellValue();
					File moduleFolder = new File(folderName+"/"+moduleName);
					testCaseList.addAll(FileUtils.listFiles(moduleFolder , extensionList, true));
				}
				else if((row.getCell(1) != null)&& row.getCell(0)!=null){			    
					row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
					row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
					String moduleName = row.getCell(0).getStringCellValue();
					String testCaseName = row.getCell(1).getStringCellValue();
					File testCase = new File(folderName+"/"+moduleName+"/"+testCaseName);
					testCaseList.add(testCase);
				}
			}
		}	  
		return testCaseList;
	}

}
