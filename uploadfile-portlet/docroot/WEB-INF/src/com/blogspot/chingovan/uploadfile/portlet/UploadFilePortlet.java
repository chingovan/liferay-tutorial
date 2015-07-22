package com.blogspot.chingovan.uploadfile.portlet;

import java.io.File;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class UploadFilePortlet
 */
public class UploadFilePortlet extends MVCPortlet {

	public void uploadFile(ActionRequest request, ActionResponse response) {

		UploadPortletRequest portletRequest = PortalUtil.getUploadPortletRequest(request);

		File file = portletRequest.getFile("fileData");

		if (file != null && file.getName() != null) {

			System.out.println("File name: " + file.getName());
		} else {

			System.out.println("Cannot get file data");
		}
	}

}
