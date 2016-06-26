package com.blogspot.chingovan;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

public class CustomConfigurationAction extends DefaultConfigurationAction {

	@Override
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {
		super.processAction(portletConfig, actionRequest, actionResponse);

		// Get current preference of portlet
		String portletResource = ParamUtil.getString(actionRequest, "portletResource");
		PortletPreferences preferences = PortletPreferencesFactoryUtil.getPortletSetup(actionRequest, portletResource);

		// Get value of parameter(s)
		String greeting = ParamUtil.getString(actionRequest, "greeting");

		// Add parameter's value into preference
		preferences.setValue("greeting", greeting);

		// Store
		preferences.store();

		// Send successful message
		SessionMessages.add(actionRequest, "success");
	}

	@Override
	public String render(PortletConfig portletConfig, RenderRequest renderRequest, RenderResponse renderResponse)
			throws Exception {

		return "/html/configuration/edit_configuration.jsp";
	}
}
