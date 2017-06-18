/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.blogspot.chingovan.database.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Student service. Represents a row in the &quot;Student&quot; database table, with each column mapped to a property of this class.
 *
 * @author chinv
 * @see StudentModel
 * @see com.blogspot.chingovan.database.model.impl.StudentImpl
 * @see com.blogspot.chingovan.database.model.impl.StudentModelImpl
 * @generated
 */
@ImplementationClassName("com.blogspot.chingovan.database.model.impl.StudentImpl")
@ProviderType
public interface Student extends StudentModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.blogspot.chingovan.database.model.impl.StudentImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Student, Long> STUDENT_ID_ACCESSOR = new Accessor<Student, Long>() {
			@Override
			public Long get(Student student) {
				return student.getStudentId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Student> getTypeClass() {
				return Student.class;
			}
		};
}