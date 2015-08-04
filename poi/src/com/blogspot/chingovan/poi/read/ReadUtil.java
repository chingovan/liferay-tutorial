/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.poi.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.blogspot.chingovan.poi.model.Student;

/**
 * @author chinv
 *
 */
public class ReadUtil {

	public static List<Student> readStudents(String fileName) {

		if (fileName != null && !fileName.isEmpty()) {

			File file = new File(fileName);

			return readStudents(file);
		}
		return null;
	}

	public static List<Student> readStudents(File file) {

		if (file != null && file.canRead()) {

			try {
				FileInputStream fileInputStream = new FileInputStream(file);

				HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

				if (workbook != null) {

					// Get first sheet
					HSSFSheet sheet = workbook.getSheetAt(0);

					if (sheet != null && sheet.getLastRowNum() > 0) {

						List<Student> students = new ArrayList<Student>();
						// Because first row is header, i index will start at 1
						for (int i = 1; i <= sheet.getLastRowNum(); i++) {

							Row row = sheet.getRow(i);
							if (row != null && row.getLastCellNum() > 0) {

								Student student = new Student();

								// Cell 0: code
								Cell cell = row.getCell(0);
								student.setCode(cell.getStringCellValue());

								// Cell 1: fullname
								cell = row.getCell(1);
								student.setFullName(cell.getStringCellValue());

								// Cell 2: birthday
								cell = row.getCell(2);
								student.setBirthday(cell.getDateCellValue());

								// Cell 3: gender
								cell = row.getCell(3);
								student.setGender((int) cell.getNumericCellValue());

								// Cell 4: address
								cell = row.getCell(4);
								student.setAddress(cell.getStringCellValue());

								students.add(student);
							}
						}

						// Note: You have to close workbook.
						workbook.close();

						return students;
					}

					workbook.close();
				}
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		return null;
	}
}
