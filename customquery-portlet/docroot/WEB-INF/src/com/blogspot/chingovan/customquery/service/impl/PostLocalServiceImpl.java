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

package com.blogspot.chingovan.customquery.service.impl;

import java.util.List;

import com.blogspot.chingovan.customquery.model.Post;
import com.blogspot.chingovan.customquery.service.base.PostLocalServiceBaseImpl;
import com.blogspot.chingovan.customquery.service.persistence.PostFinderUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the post local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.blogspot.chingovan.customquery.service.PostLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author chinv
 * @see com.blogspot.chingovan.customquery.service.base.PostLocalServiceBaseImpl
 * @see com.blogspot.chingovan.customquery.service.PostLocalServiceUtil
 */
public class PostLocalServiceImpl extends PostLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.blogspot.chingovan.customquery.service.PostLocalServiceUtil} to
	 * access the post local service.
	 */

	public List<Post> findByAuthors(long[] authorIds, int begin, int end) throws SystemException {

		return PostFinderUtil.findByAuthors(authorIds, begin, end);
	}
}