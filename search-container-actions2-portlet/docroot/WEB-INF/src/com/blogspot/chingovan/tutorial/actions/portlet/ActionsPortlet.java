package com.blogspot.chingovan.tutorial.actions.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ActionsPortlet
 */
public class ActionsPortlet extends MVCPortlet {

	public void deleteStudents(ActionRequest request, ActionResponse response) {

		long[] deleteStudentIds = ParamUtil.getLongValues(request, "deleteStudentIds");

		// Delete action
		System.out.println("Delete " + deleteStudentIds.length + " record");
	}
}
