package com.blogspot.chingovan.formnavi;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class FormNavi
 */
public class FormNavi extends MVCPortlet {

	public void updateStudent(ActionRequest request, ActionResponse response) {

		String name = ParamUtil.getString(request, "name");

		System.out.println("name: " + name);

		int age = ParamUtil.getInteger(request, "age");
		System.out.println("age: " + age);

		boolean gender = ParamUtil.getBoolean(request, "gender");
		System.out.println("gender: " + gender);

		String address = ParamUtil.getString(request, "address");
		System.out.println("address: " + address);

		String telephone = ParamUtil.getString(request, "telephone");
		System.out.println("telephone: " + telephone);

		String homephone = ParamUtil.getString(request, "homephone");
		System.out.println("homephone: " + homephone);

		String universityName = ParamUtil.getString(request, "universityName");
		System.out.println("universityName: " + universityName);

		String universitySubject = ParamUtil.getString(request, "universitySubject");
		System.out.println("universitySubject: " + universitySubject);

		String highSchoolName = ParamUtil.getString(request, "highSchoolName");
		System.out.println("highSchoolName: " + highSchoolName);

		String favoriteSport = ParamUtil.getString(request, "favoriteSport");
		System.out.println("favoriteSport: " + favoriteSport);

		String favoriteMovie = ParamUtil.getString(request, "favoriteMovie");
		System.out.println("favoriteMovie: " + favoriteMovie);

		String favoriteSong = ParamUtil.getString(request, "favoriteSong");
		System.out.println("favoriteSong: " + favoriteSong);

		String favoriteBook = ParamUtil.getString(request, "favoriteBook");
		System.out.println("favoriteBook: " + favoriteBook);
	}
}
