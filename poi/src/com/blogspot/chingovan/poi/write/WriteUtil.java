/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.poi.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class WriteUtil {

	public static boolean writeStudents(List<Student> students, String fileName) {

		if (fileName != null && !fileName.isEmpty()) {

			File file = new File(fileName);

			return writeStudents(students, file);
		}

		return false;
	}

	public static boolean writeStudents(List<Student> students, File file) {

		if (file != null) {

			try {

				// Create a new workbook
				HSSFWorkbook workbook = new HSSFWorkbook();

				if (workbook != null) {

					// Create a new sheet
					HSSFSheet sheet = workbook.createSheet("Students");

					if (sheet != null) {

						// Create header row
						Row header = sheet.createRow(0);

						// Code
						Cell cell = header.createCell(0);
						cell.setCellValue("Code");

						// FullName
						cell = header.createCell(1);
						cell.setCellValue("FullName");

						// Birthday
						cell = header.createCell(2);
						cell.setCellValue("Birthday");

						// Gender
						cell = header.createCell(3);
						cell.setCellValue("Gender");

						// Address
						cell = header.createCell(4);
						cell.setCellValue("Address");

						// Create content rows
						int length = students != null ? students.size() : 0;
						for (int i = 0; i < length; i++) {

							Student student = students.get(i);

							if (student != null) {

								// Create content row
								Row row = sheet.createRow(i + 1);

								// Code
								cell = row.createCell(0);
								cell.setCellValue(student.getCode());

								// FullName
								cell = row.createCell(1);
								cell.setCellValue(student.getFullName());

								// Birthday
								cell = row.createCell(2);
								cell.setCellValue(student.getBirthday());

								// Gender
								cell = row.createCell(3);
								cell.setCellValue(student.getGender());

								// Address
								cell = row.createCell(4);
								cell.setCellValue(student.getAddress());

							}
						}
					}

					FileOutputStream fileOutputStream = new FileOutputStream(file);

					workbook.write(fileOutputStream);

					workbook.close();

					return true;
				}
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		return false;
	}
}
