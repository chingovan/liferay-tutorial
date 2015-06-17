/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.tutorial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.blogspot.chingovan.tutorial.model.Student;
import com.blogspot.chingovan.tutorial.search.StudentSearchContainer;
import com.blogspot.chingovan.tutorial.search.StudentSearchTerms;

/**
 * @author chinv
 *
 */
public class DemoStudentUtil {

	private static List<Student>	students	= null;

	private static void initData() {

		if (students == null || students.size() == 0) {
			students = new ArrayList<Student>();
			students.add(new Student("SV001", "Nguyen Van Anh", new Date(), true, "Ha Noi"));
			students.add(new Student("SV002", "Le Van Anh", new Date(), false, "Quang Ninh"));
			students.add(new Student("SV003", "Ha Thi My", new Date(), false, "Hoa Binh"));
			students.add(new Student("SV004", "Bui Van Duc", new Date(), true, "Ha Tinh"));
			students.add(new Student("SV005", "Vu Thi Mo", new Date(), false, "Ha Nam"));
			students.add(new Student("SV006", "Tran Hanh Phuc", new Date(), true, "Bac Ninh"));
			students.add(new Student("SV007", "Nguyen Duc Anh", new Date(), true, "Hung Yen"));
			students.add(new Student("SV008", "Tran Le Van Anh", new Date(), false, "Thai Binh"));
			students.add(new Student("SV009", "Nguyen Van Hanh", new Date(), true, "Ha Noi"));
			students.add(new Student("SV010", "Le Van Ngoc Anh", new Date(), false, "Quang Ninh"));
			students.add(new Student("SV011", "Ha Thi Lan", new Date(), false, "Hoa Binh"));
			students.add(new Student("SV012", "Bui Van Tai", new Date(), true, "Ha Tinh"));
			students.add(new Student("SV013", "Vu Thi Man", new Date(), false, "Ha Nam"));
			students.add(new Student("SV014", "Tran Hanh Nguyen", new Date(), true, "Bac Ninh"));
			students.add(new Student("SV015", "Nguyen Duc Trong", new Date(), true, "Hung Yen"));
			students.add(new Student("SV016", "Tran Le Van Nga", new Date(), false, "Thai Binh"));
			students.add(new Student("SV017", "Nguyen Van Tung", new Date(), true, "Ha Noi"));
			students.add(new Student("SV018", "Le Van Manh", new Date(), false, "Quang Ninh"));
			students.add(new Student("SV019", "Ha Thi May", new Date(), false, "Hoa Binh"));
			students.add(new Student("SV020", "Bui Van Tu", new Date(), true, "Ha Tinh"));
			students.add(new Student("SV021", "Vu Thi Dao", new Date(), false, "Ha Nam"));
			students.add(new Student("SV022", "Tran Hanh Trang", new Date(), true, "Bac Ninh"));
			students.add(new Student("SV023", "Nguyen Duc Anh Tai", new Date(), true, "Hung Yen"));
			students.add(new Student("SV024", "Tran Le Van Trang", new Date(), false, "Thai Binh"));
			students.add(new Student("SV025", "Nguyen Van Tri", new Date(), true, "Ha Noi"));
			students.add(new Student("SV026", "Le Van Vinh", new Date(), false, "Quang Ninh"));
			students.add(new Student("SV027", "Ha Thi My Phuong", new Date(), false, "Hoa Binh"));
			students.add(new Student("SV028", "Bui Van Huyen", new Date(), true, "Ha Tinh"));
			students.add(new Student("SV029", "Vu Thi Ha", new Date(), false, "Ha Nam"));
			students.add(new Student("SV030", "Tran Long", new Date(), true, "Bac Ninh"));
			students.add(new Student("SV031", "Nguyen Duc Chuan", new Date(), true, "Hung Yen"));
			students.add(new Student("SV032", "Tran Le Van Tam", new Date(), false, "Thai Binh"));
			students.add(new Student("SV033", "Nguyen Van Dung", new Date(), true, "Ha Noi"));
			students.add(new Student("SV034", "Le Van Gioi", new Date(), false, "Quang Ninh"));
			students.add(new Student("SV035", "Ha Thi Linh", new Date(), false, "Hoa Binh"));
			students.add(new Student("SV036", "Bui Van Quoc", new Date(), true, "Ha Tinh"));
			students.add(new Student("SV037", "Vu Thi Mo Mong", new Date(), false, "Ha Nam"));
			students.add(new Student("SV038", "Tran Thoang", new Date(), true, "Bac Ninh"));
			students.add(new Student("SV039", "Nguyen Duc Anh Vy", new Date(), true, "Hung Yen"));
			students.add(new Student("SV040", "Tran Le Van", new Date(), false, "Thai Binh"));
		}
	}

	public static List<Student> search(StudentSearchContainer studentSearchContainer) {

		List<Student> results = getMatchedStudents(studentSearchContainer);

		if (results != null && !results.isEmpty()) {
			int end = Math.min(studentSearchContainer.getEnd(), results.size());

			return results.subList(studentSearchContainer.getStart(), end);
		}

		return results;
	}

	public static int count(StudentSearchContainer studentSearchContainer) {

		List<Student> results = getMatchedStudents(studentSearchContainer);

		return results != null ? results.size() : 0;
	}

	private static List<Student> getMatchedStudents(StudentSearchContainer studentSearchContainer) {
		initData();
		List<Student> results = new ArrayList<Student>();

		StudentSearchTerms searchTerms = (StudentSearchTerms) studentSearchContainer.getSearchTerms();

		for (Student student : students) {

			boolean isMatched = true;
			if (searchTerms.getCode() != null && !searchTerms.getCode().isEmpty()) {
				if (!student.getCode().contains(searchTerms.getCode())) {

					isMatched = false;
				}
			}

			if (searchTerms.getName() != null && !searchTerms.getName().isEmpty()) {
				if (student.getFullname().contains(searchTerms.getName())) {
					isMatched = false;
				}
			}

			if (searchTerms.getGender() > 0) {
				if (searchTerms.getGender() == 1 && student.isGender() == false) {
					isMatched = false;
				} else if (searchTerms.getGender() == 2 && student.isGender() == true) {
					isMatched = false;
				}
			}

			if (isMatched == true) {

				results.add(student);
			}
		}

		return results;
	}
}
