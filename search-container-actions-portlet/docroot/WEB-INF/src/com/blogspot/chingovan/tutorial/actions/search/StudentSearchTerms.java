/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.tutorial.actions.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.ParamUtil;

/**
 * @author chinv
 *
 */
public class StudentSearchTerms extends StudentDisplayTerms {

	/**
	 * @param portletRequest
	 */
	public StudentSearchTerms(PortletRequest portletRequest) {
		super(portletRequest);

		code = ParamUtil.getString(portletRequest, "code");
		name = ParamUtil.getString(portletRequest, "name");
		gender = ParamUtil.getInteger(portletRequest, "gender");
	}

}
