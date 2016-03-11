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

package com.blogspot.chingovan.tutorial.actions.service.persistence;

import com.blogspot.chingovan.tutorial.actions.model.Student;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the student service. This utility wraps {@link StudentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chinv
 * @see StudentPersistence
 * @see StudentPersistenceImpl
 * @generated
 */
public class StudentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Student student) {
		getPersistence().clearCache(student);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Student> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Student> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Student> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Student update(Student student) throws SystemException {
		return getPersistence().update(student);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Student update(Student student, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(student, serviceContext);
	}

	/**
	* Returns all the students where code LIKE &#63; and fullName LIKE &#63;.
	*
	* @param code the code
	* @param fullName the full name
	* @return the matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.tutorial.actions.model.Student> findByC_F(
		java.lang.String code, java.lang.String fullName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_F(code, fullName);
	}

	/**
	* Returns a range of all the students where code LIKE &#63; and fullName LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.tutorial.actions.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param fullName the full name
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.tutorial.actions.model.Student> findByC_F(
		java.lang.String code, java.lang.String fullName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_F(code, fullName, start, end);
	}

	/**
	* Returns an ordered range of all the students where code LIKE &#63; and fullName LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.tutorial.actions.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param fullName the full name
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.tutorial.actions.model.Student> findByC_F(
		java.lang.String code, java.lang.String fullName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F(code, fullName, start, end, orderByComparator);
	}

	/**
	* Returns the first student in the ordered set where code LIKE &#63; and fullName LIKE &#63;.
	*
	* @param code the code
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student
	* @throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student findByC_F_First(
		java.lang.String code, java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_First(code, fullName, orderByComparator);
	}

	/**
	* Returns the first student in the ordered set where code LIKE &#63; and fullName LIKE &#63;.
	*
	* @param code the code
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student fetchByC_F_First(
		java.lang.String code, java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_F_First(code, fullName, orderByComparator);
	}

	/**
	* Returns the last student in the ordered set where code LIKE &#63; and fullName LIKE &#63;.
	*
	* @param code the code
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student
	* @throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student findByC_F_Last(
		java.lang.String code, java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_F_Last(code, fullName, orderByComparator);
	}

	/**
	* Returns the last student in the ordered set where code LIKE &#63; and fullName LIKE &#63;.
	*
	* @param code the code
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student fetchByC_F_Last(
		java.lang.String code, java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_F_Last(code, fullName, orderByComparator);
	}

	/**
	* Returns the students before and after the current student in the ordered set where code LIKE &#63; and fullName LIKE &#63;.
	*
	* @param studentId the primary key of the current student
	* @param code the code
	* @param fullName the full name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next student
	* @throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student[] findByC_F_PrevAndNext(
		long studentId, java.lang.String code, java.lang.String fullName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_PrevAndNext(studentId, code, fullName,
			orderByComparator);
	}

	/**
	* Removes all the students where code LIKE &#63; and fullName LIKE &#63; from the database.
	*
	* @param code the code
	* @param fullName the full name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_F(java.lang.String code,
		java.lang.String fullName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_F(code, fullName);
	}

	/**
	* Returns the number of students where code LIKE &#63; and fullName LIKE &#63;.
	*
	* @param code the code
	* @param fullName the full name
	* @return the number of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_F(java.lang.String code,
		java.lang.String fullName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_F(code, fullName);
	}

	/**
	* Returns all the students where code LIKE &#63; and fullName LIKE &#63; and gender = &#63;.
	*
	* @param code the code
	* @param fullName the full name
	* @param gender the gender
	* @return the matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.tutorial.actions.model.Student> findByC_F_G(
		java.lang.String code, java.lang.String fullName, boolean gender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_F_G(code, fullName, gender);
	}

	/**
	* Returns a range of all the students where code LIKE &#63; and fullName LIKE &#63; and gender = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.tutorial.actions.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param fullName the full name
	* @param gender the gender
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.tutorial.actions.model.Student> findByC_F_G(
		java.lang.String code, java.lang.String fullName, boolean gender,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_F_G(code, fullName, gender, start, end);
	}

	/**
	* Returns an ordered range of all the students where code LIKE &#63; and fullName LIKE &#63; and gender = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.tutorial.actions.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param fullName the full name
	* @param gender the gender
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.tutorial.actions.model.Student> findByC_F_G(
		java.lang.String code, java.lang.String fullName, boolean gender,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_G(code, fullName, gender, start, end,
			orderByComparator);
	}

	/**
	* Returns the first student in the ordered set where code LIKE &#63; and fullName LIKE &#63; and gender = &#63;.
	*
	* @param code the code
	* @param fullName the full name
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student
	* @throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student findByC_F_G_First(
		java.lang.String code, java.lang.String fullName, boolean gender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_G_First(code, fullName, gender, orderByComparator);
	}

	/**
	* Returns the first student in the ordered set where code LIKE &#63; and fullName LIKE &#63; and gender = &#63;.
	*
	* @param code the code
	* @param fullName the full name
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student fetchByC_F_G_First(
		java.lang.String code, java.lang.String fullName, boolean gender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_F_G_First(code, fullName, gender, orderByComparator);
	}

	/**
	* Returns the last student in the ordered set where code LIKE &#63; and fullName LIKE &#63; and gender = &#63;.
	*
	* @param code the code
	* @param fullName the full name
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student
	* @throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student findByC_F_G_Last(
		java.lang.String code, java.lang.String fullName, boolean gender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_G_Last(code, fullName, gender, orderByComparator);
	}

	/**
	* Returns the last student in the ordered set where code LIKE &#63; and fullName LIKE &#63; and gender = &#63;.
	*
	* @param code the code
	* @param fullName the full name
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student, or <code>null</code> if a matching student could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student fetchByC_F_G_Last(
		java.lang.String code, java.lang.String fullName, boolean gender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_F_G_Last(code, fullName, gender, orderByComparator);
	}

	/**
	* Returns the students before and after the current student in the ordered set where code LIKE &#63; and fullName LIKE &#63; and gender = &#63;.
	*
	* @param studentId the primary key of the current student
	* @param code the code
	* @param fullName the full name
	* @param gender the gender
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next student
	* @throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student[] findByC_F_G_PrevAndNext(
		long studentId, java.lang.String code, java.lang.String fullName,
		boolean gender,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_G_PrevAndNext(studentId, code, fullName, gender,
			orderByComparator);
	}

	/**
	* Removes all the students where code LIKE &#63; and fullName LIKE &#63; and gender = &#63; from the database.
	*
	* @param code the code
	* @param fullName the full name
	* @param gender the gender
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_F_G(java.lang.String code,
		java.lang.String fullName, boolean gender)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_F_G(code, fullName, gender);
	}

	/**
	* Returns the number of students where code LIKE &#63; and fullName LIKE &#63; and gender = &#63;.
	*
	* @param code the code
	* @param fullName the full name
	* @param gender the gender
	* @return the number of matching students
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_F_G(java.lang.String code,
		java.lang.String fullName, boolean gender)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_F_G(code, fullName, gender);
	}

	/**
	* Caches the student in the entity cache if it is enabled.
	*
	* @param student the student
	*/
	public static void cacheResult(
		com.blogspot.chingovan.tutorial.actions.model.Student student) {
		getPersistence().cacheResult(student);
	}

	/**
	* Caches the students in the entity cache if it is enabled.
	*
	* @param students the students
	*/
	public static void cacheResult(
		java.util.List<com.blogspot.chingovan.tutorial.actions.model.Student> students) {
		getPersistence().cacheResult(students);
	}

	/**
	* Creates a new student with the primary key. Does not add the student to the database.
	*
	* @param studentId the primary key for the new student
	* @return the new student
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student create(
		long studentId) {
		return getPersistence().create(studentId);
	}

	/**
	* Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the student
	* @return the student that was removed
	* @throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student remove(
		long studentId)
		throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(studentId);
	}

	public static com.blogspot.chingovan.tutorial.actions.model.Student updateImpl(
		com.blogspot.chingovan.tutorial.actions.model.Student student)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(student);
	}

	/**
	* Returns the student with the primary key or throws a {@link com.blogspot.chingovan.tutorial.actions.NoSuchStudentException} if it could not be found.
	*
	* @param studentId the primary key of the student
	* @return the student
	* @throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student findByPrimaryKey(
		long studentId)
		throws com.blogspot.chingovan.tutorial.actions.NoSuchStudentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(studentId);
	}

	/**
	* Returns the student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentId the primary key of the student
	* @return the student, or <code>null</code> if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.tutorial.actions.model.Student fetchByPrimaryKey(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(studentId);
	}

	/**
	* Returns all the students.
	*
	* @return the students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.tutorial.actions.model.Student> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.tutorial.actions.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.tutorial.actions.model.Student> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.tutorial.actions.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of students
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.tutorial.actions.model.Student> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of students.
	*
	* @return the number of students
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static StudentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (StudentPersistence)PortletBeanLocatorUtil.locate(com.blogspot.chingovan.tutorial.actions.service.ClpSerializer.getServletContextName(),
					StudentPersistence.class.getName());

			ReferenceRegistry.registerReference(StudentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(StudentPersistence persistence) {
	}

	private static StudentPersistence _persistence;
}