package com.blogspot.chingovan.passwordchanger;

import java.util.Date;
import java.util.Properties;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SimpleAction;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.persistence.CompanyUtil;

public class PasswordChanger extends SimpleAction {

	@Override
	public void run(String[] arg0) throws ActionException {

		Properties properties = new Properties();

		try {
			properties.load(this.getClass().getClassLoader().getResourceAsStream("password.changer.properties"));
			String type = properties.getProperty("type");
			String webId = properties.getProperty("webId");
			Company c = CompanyUtil.fetchByWebId(webId);

			User user = null;
			String name = null;

			if ("screenname".equals(type)) {
				String screenName = properties.getProperty("screenname");
				user = UserLocalServiceUtil.getUserByScreenName(c.getCompanyId(), screenName);
				name = screenName;
			} else if ("e-mail".equals(type)) {
				String emailAddress = properties.getProperty("emailaddress");
				user = UserLocalServiceUtil.getUserByEmailAddress(c.getCompanyId(), emailAddress);
				name = emailAddress;
			} else {

				System.err.println("You should set type to screenname or e-mail if you want to use the password updater.");
			}

			String password = properties.getProperty("password");
			UserLocalServiceUtil.updatePasswordManually(user.getUserId(), password, false, true, new Date());
			System.err.println("Password for " + name + " was updated.");
		} catch (Exception exception) {

			System.err.println(exception);
		}
	}

}
