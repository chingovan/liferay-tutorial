/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.tutorial.actions.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * @author chinv
 *
 */
public class StudentDisplayTerms extends DisplayTerms {
	/**
	 * Filter by code of {@link Student}
	 * */
	protected String	code;

	/**
	 * Filter by name of {@link Student}
	 * */
	protected String	name;

	/**
	 * Filter by gender of {@link Student} <br />
	 * gender = 0 --> find all, gender = 1 --> find all male {@link Student} and
	 * gender = 2 --> find all female {@link Student}
	 * */
	protected int		gender;

	/**
	 * @param portletRequest
	 */
	public StudentDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);

		code = ParamUtil.getString(portletRequest, "code");
		name = ParamUtil.getString(portletRequest, "name");
		gender = ParamUtil.getInteger(portletRequest, "gender");
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}

}
