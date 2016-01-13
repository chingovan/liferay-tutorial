package com.blogspot.chingovan.tutorial.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.blogspot.chingovan.tutorial.ajax.model.Student;
import com.blogspot.chingovan.tutorial.ajax.service.StudentLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AJAXPortlet
 */
public class AJAXPortlet extends MVCPortlet {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.liferay.util.bridges.mvc.MVCPortlet#serveResource(javax.portlet.
	 * ResourceRequest, javax.portlet.ResourceResponse)
	 */
	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {

		String code = ParamUtil.getString(request, "code");

		try {
			Student student = StudentLocalServiceUtil.findStudentByCode(code);

			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

			jsonObject.put("name", student != null ? student.getFullName() : "");
			jsonObject.put("code", student != null ? student.getCode() : "");
			jsonObject.put("gender", student != null && student.getGender() == true ? "Nam" : "Nu");

			response.setContentType("text/javascript");
			response.setCharacterEncoding("UTF-8");

			PrintWriter printWriter;
			printWriter = response.getWriter();
			printWriter.write(jsonObject.toString());

			printWriter.flush();
			printWriter.close();

		} catch (SystemException e) {
			e.printStackTrace();
		}

	}
}
