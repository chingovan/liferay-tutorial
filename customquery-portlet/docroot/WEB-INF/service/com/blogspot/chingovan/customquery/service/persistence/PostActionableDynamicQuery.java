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

package com.blogspot.chingovan.customquery.service.persistence;

import com.blogspot.chingovan.customquery.model.Post;
import com.blogspot.chingovan.customquery.service.PostLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author chinv
 * @generated
 */
public abstract class PostActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public PostActionableDynamicQuery() throws SystemException {
		setBaseLocalService(PostLocalServiceUtil.getService());
		setClass(Post.class);

		setClassLoader(com.blogspot.chingovan.customquery.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("postId");
	}
}