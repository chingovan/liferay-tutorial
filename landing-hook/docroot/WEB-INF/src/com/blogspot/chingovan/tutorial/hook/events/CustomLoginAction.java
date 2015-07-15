/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.tutorial.hook.events;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.User;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

/**
 * @author chinv
 *
 */
public class CustomLoginAction extends Action {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.liferay.portal.kernel.events.Action#run(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) throws ActionException {

		String defaultPath = "/web/guest/welcome";
		String defaultPage = "/welcome";

		String path = "";

		try {

			// Get logined user
			User user = PortalUtil.getUser(request);

			// Get all group of user
			List<Group> groups = GroupLocalServiceUtil.getUserGroups(user.getUserId());

			if (groups != null && groups.size() > 0) {

				// Select a group which matches with your business
				// In this introduce, because each user belong a group, I will
				// select first group
				Group group = groups.get(0);

				path = "/web" + group.getFriendlyURL() + defaultPage;
			}

		} catch (PortalException e) {

			e.printStackTrace();
		} catch (SystemException e) {

			e.printStackTrace();
		}

		if (path == null || path.isEmpty()) {

			path = defaultPath;
		}

		// Navigate to path
		LastPath lastPath = new LastPath(StringPool.BLANK, path);
		HttpSession session = request.getSession();
		session.setAttribute(WebKeys.LAST_PATH, lastPath);
	}

}
