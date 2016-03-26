/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.tutorial.actions.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.blogspot.chingovan.tutorial.actions.model.Student;
import com.liferay.portal.kernel.dao.search.SearchContainer;

/**
 * @author chinv
 *
 */
public class StudentSearchContainer extends SearchContainer<Student> {

	static List<String>			headerNames				= new ArrayList<String>();
	static Map<String, String>	orderableHeaders		= new HashMap<String, String>();

	static {
		headerNames.add("code");
		headerNames.add("name");
		headerNames.add("gender");
		headerNames.add("address");
	}

	public static final String	EMPTY_RESULTS_MESSAGE	= "Khong tim thay ket qua nao";

	/**
	 * @param portletRequest
	 * @param iteratorURL
	 * @param headerNames
	 * @param emptyResultsMessage
	 */
	public StudentSearchContainer(PortletRequest portletRequest, PortletURL iteratorURL) {

		super(portletRequest, new StudentDisplayTerms(portletRequest), new StudentSearchTerms(portletRequest), DEFAULT_CUR_PARAM, DEFAULT_DELTA, iteratorURL,
				headerNames, EMPTY_RESULTS_MESSAGE);

		StudentDisplayTerms displayTerms = (StudentDisplayTerms) getDisplayTerms();

		iteratorURL.setParameter("code", displayTerms.getCode());
		iteratorURL.setParameter("name", displayTerms.getName());
		iteratorURL.setParameter("gender", String.valueOf(displayTerms.getGender()));
	}

}
