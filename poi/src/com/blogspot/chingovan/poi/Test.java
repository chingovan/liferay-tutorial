/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.poi;

import java.util.Collections;
import java.util.List;

import com.blogspot.chingovan.poi.model.Student;
import com.blogspot.chingovan.poi.read.ReadUtil;
import com.blogspot.chingovan.poi.write.WriteUtil;

/**
 * @author chinv
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String inputFileName = "resources/data.in.xls";

		List<Student> readingStudents = ReadUtil.readStudents(inputFileName);

		if (readingStudents != null && readingStudents.size() > 0) {

			for (Student student : readingStudents) {

				System.out.println("Name: " + student.getFullName());
			}
		} else {

			System.out.println("NOTHING");
		}

		Collections.reverse(readingStudents);

		String outputFileName = "resources/data.out.xls";

		boolean isWrited = WriteUtil.writeStudents(readingStudents, outputFileName);

		if (isWrited) {

			System.out.println("Writing done");
		} else {

			System.out.println("Writing fail");
		}
	}
}
