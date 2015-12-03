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

package com.blogspot.chingovan.customjsp.servicebuilder.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.blogspot.chingovan.customjsp.servicebuilder.service.http.AuthorServiceSoap}.
 *
 * @author chinv
 * @see com.blogspot.chingovan.customjsp.servicebuilder.service.http.AuthorServiceSoap
 * @generated
 */
public class AuthorSoap implements Serializable {
	public static AuthorSoap toSoapModel(Author model) {
		AuthorSoap soapModel = new AuthorSoap();

		soapModel.setAuthorId(model.getAuthorId());
		soapModel.setName(model.getName());
		soapModel.setInstitute(model.getInstitute());
		soapModel.setUrl(model.getUrl());

		return soapModel;
	}

	public static AuthorSoap[] toSoapModels(Author[] models) {
		AuthorSoap[] soapModels = new AuthorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AuthorSoap[][] toSoapModels(Author[][] models) {
		AuthorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AuthorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AuthorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AuthorSoap[] toSoapModels(List<Author> models) {
		List<AuthorSoap> soapModels = new ArrayList<AuthorSoap>(models.size());

		for (Author model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AuthorSoap[soapModels.size()]);
	}

	public AuthorSoap() {
	}

	public long getPrimaryKey() {
		return _authorId;
	}

	public void setPrimaryKey(long pk) {
		setAuthorId(pk);
	}

	public long getAuthorId() {
		return _authorId;
	}

	public void setAuthorId(long authorId) {
		_authorId = authorId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getInstitute() {
		return _institute;
	}

	public void setInstitute(String institute) {
		_institute = institute;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	private long _authorId;
	private String _name;
	private String _institute;
	private String _url;
}