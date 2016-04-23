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

package com.blogspot.chingovan.validator.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Validator_StudentService}.
 *
 * @author chinv
 * @see Validator_StudentService
 * @generated
 */
public class Validator_StudentServiceWrapper implements Validator_StudentService,
	ServiceWrapper<Validator_StudentService> {
	public Validator_StudentServiceWrapper(
		Validator_StudentService validator_StudentService) {
		_validator_StudentService = validator_StudentService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _validator_StudentService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_validator_StudentService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _validator_StudentService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Validator_StudentService getWrappedValidator_StudentService() {
		return _validator_StudentService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedValidator_StudentService(
		Validator_StudentService validator_StudentService) {
		_validator_StudentService = validator_StudentService;
	}

	@Override
	public Validator_StudentService getWrappedService() {
		return _validator_StudentService;
	}

	@Override
	public void setWrappedService(
		Validator_StudentService validator_StudentService) {
		_validator_StudentService = validator_StudentService;
	}

	private Validator_StudentService _validator_StudentService;
}