package com.liferay.tutorial;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class SecondPortlet
 */
public class SecondPortlet extends MVCPortlet {

	@Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {

		String name = ParamUtil.getString(actionRequest, "name");

		String message  = "";
		if ( name == null || name.isEmpty()) {
			
			message = "Hello World";
		} else {
			
			message = "Hello " + name;
		}
		actionResponse.setRenderParameter("message", message);

		super.processAction(actionRequest, actionResponse);
	}

}
