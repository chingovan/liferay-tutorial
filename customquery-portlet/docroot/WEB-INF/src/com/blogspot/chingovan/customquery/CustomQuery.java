package com.blogspot.chingovan.customquery;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.blogspot.chingovan.customquery.model.Post;
import com.blogspot.chingovan.customquery.service.PostLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class CustomQuery
 */
public class CustomQuery extends MVCPortlet {

	public void viewPostByAuthors(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException {

		long[] authorIds = new long[] { 1, 3 };

		List<Post> posts = PostLocalServiceUtil.findByAuthors(authorIds, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		if (posts != null) {

			for (Post post : posts) {

				System.out.println(post.getTitle());
			}
		}

	}

}
