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

package com.blogspot.chingovan.validator.service.persistence;

import com.blogspot.chingovan.validator.model.Validator_Student;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the validator_ student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chinv
 * @see Validator_StudentPersistenceImpl
 * @see Validator_StudentUtil
 * @generated
 */
public interface Validator_StudentPersistence extends BasePersistence<Validator_Student> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Validator_StudentUtil} to access the validator_ student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the validator_ student in the entity cache if it is enabled.
	*
	* @param validator_Student the validator_ student
	*/
	public void cacheResult(
		com.blogspot.chingovan.validator.model.Validator_Student validator_Student);

	/**
	* Caches the validator_ students in the entity cache if it is enabled.
	*
	* @param validator_Students the validator_ students
	*/
	public void cacheResult(
		java.util.List<com.blogspot.chingovan.validator.model.Validator_Student> validator_Students);

	/**
	* Creates a new validator_ student with the primary key. Does not add the validator_ student to the database.
	*
	* @param studentId the primary key for the new validator_ student
	* @return the new validator_ student
	*/
	public com.blogspot.chingovan.validator.model.Validator_Student create(
		long studentId);

	/**
	* Removes the validator_ student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the validator_ student
	* @return the validator_ student that was removed
	* @throws com.blogspot.chingovan.validator.NoSuchValidator_StudentException if a validator_ student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.blogspot.chingovan.validator.model.Validator_Student remove(
		long studentId)
		throws com.blogspot.chingovan.validator.NoSuchValidator_StudentException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.blogspot.chingovan.validator.model.Validator_Student updateImpl(
		com.blogspot.chingovan.validator.model.Validator_Student validator_Student)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the validator_ student with the primary key or throws a {@link com.blogspot.chingovan.validator.NoSuchValidator_StudentException} if it could not be found.
	*
	* @param studentId the primary key of the validator_ student
	* @return the validator_ student
	* @throws com.blogspot.chingovan.validator.NoSuchValidator_StudentException if a validator_ student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.blogspot.chingovan.validator.model.Validator_Student findByPrimaryKey(
		long studentId)
		throws com.blogspot.chingovan.validator.NoSuchValidator_StudentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the validator_ student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentId the primary key of the validator_ student
	* @return the validator_ student, or <code>null</code> if a validator_ student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.blogspot.chingovan.validator.model.Validator_Student fetchByPrimaryKey(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the validator_ students.
	*
	* @return the validator_ students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.blogspot.chingovan.validator.model.Validator_Student> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the validator_ students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.validator.model.impl.Validator_StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of validator_ students
	* @param end the upper bound of the range of validator_ students (not inclusive)
	* @return the range of validator_ students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.blogspot.chingovan.validator.model.Validator_Student> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the validator_ students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.validator.model.impl.Validator_StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of validator_ students
	* @param end the upper bound of the range of validator_ students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of validator_ students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.blogspot.chingovan.validator.model.Validator_Student> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the validator_ students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of validator_ students.
	*
	* @return the number of validator_ students
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}