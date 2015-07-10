/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.blogspot.chingovan.tutorial.combine.service.impl;

import java.util.List;

import com.blogspot.chingovan.tutorial.combine.model.Student;
import com.blogspot.chingovan.tutorial.combine.service.base.StudentLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the student local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.blogspot.chingovan.tutorial.combine.service.StudentLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author chinv
 * @see com.blogspot.chingovan.tutorial.combine.service.base.StudentLocalServiceBaseImpl
 * @see com.blogspot.chingovan.tutorial.combine.service.StudentLocalServiceUtil
 */
public class StudentLocalServiceImpl extends StudentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.blogspot.chingovan.tutorial.combine.service.StudentLocalServiceUtil}
	 * to access the student local service.
	 */

	public List<Student> search(String code, String fullName, int gender, int start, int end) throws SystemException {

		String bufferCode = code != null ? "%" + code + "%" : "%%";
		String bufferFullName = fullName != null ? "%" + fullName + "%" : "%%";

		if (gender == 0) {

			return studentPersistence.findByC_F(bufferCode, bufferFullName, start, end);
		} else {

			return studentPersistence.findByC_F_G(bufferCode, bufferFullName, gender == 1, start, end);
		}
	}

	public int count(String code, String fullName, int gender) throws SystemException {

		String bufferCode = code != null ? "%" + code + "%" : "%%";
		String bufferFullName = fullName != null ? "%" + fullName + "%" : "%%";

		if (gender == 0) {

			return studentPersistence.countByC_F(bufferCode, bufferFullName);
		} else {

			return studentPersistence.countByC_F_G(bufferCode, bufferFullName, gender == 1);
		}

	}
}