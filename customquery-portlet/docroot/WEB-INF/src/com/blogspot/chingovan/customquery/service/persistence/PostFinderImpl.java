/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.customquery.service.persistence;

import java.util.ArrayList;
import java.util.List;

import com.blogspot.chingovan.customquery.model.Post;
import com.blogspot.chingovan.customquery.model.impl.PostImpl;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * @author chinv
 *
 */
public class PostFinderImpl extends BasePersistenceImpl<Post> implements PostFinder {

	public List<Post> findByAuthors(long[] authorIds, int begin, int end) throws SystemException {

		Session session = null;
		try {
			session = openSession();
			String base = "SELECT {ExampleBlog_Post.*} FROM ExampleBlog_Post";

			StringBuffer sqlBuilder = new StringBuffer(base);
			List<String> criteria = new ArrayList<String>();

			if (authorIds != null && authorIds.length > 0) {

				StringBuffer sb = new StringBuffer(" (");

				for (int i = 0; i < authorIds.length; i++) {

					sb.append(i == 0 ? " ?" : ", ?");
				}
				sb.append(" )");

				criteria.add(" AuthorId in " + sb.toString());
			}

			if (!criteria.isEmpty()) {

				sqlBuilder.append(" WHERE ");
				sqlBuilder.append(criteria.remove(0) + " ");

				for (String criterion : criteria) {

					sqlBuilder.append(" AND " + criterion);
				}
			}

			String sql = sqlBuilder.toString();

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("ExampleBlog_Post", PostImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			if (authorIds != null && authorIds.length > 0) {

				qPos.add(authorIds);
			}

			return (List<Post>) QueryUtil.list(q, getDialect(), begin, end);

		} catch (Exception e) {

			throw new SystemException(e);
		} finally {

			closeSession(session);
		}
	}

	public List<Post> findByTitleContentAuthor(String title, String content, String author, int begin, int end) throws SystemException {

		// / This stuff is basic set up
		Session session = null;
		try {
			session = openSession();
			// Here ends the basic set up;

			// now we build the query. Note that we use the name of the tables
			// from the database!
			String base = "SELECT {ExampleBlog_Post.*} FROM ExampleBlog_Post " + "JOIN ExampleBlog_Author "
					+ "ON ExampleBlog_Post.authorId = ExampleBlog_Author.authorId ";
			StringBuffer sqlBuilder = new StringBuffer(base);
			List<String> criteria = new ArrayList<String>();
			if (Validator.isNotNull(title)) {
				criteria.add("ExampleBlog_Post.title like ?");
			}
			if (Validator.isNotNull(content)) {
				criteria.add("ExampleBlog_Post.content like ?");
			}
			if (Validator.isNotNull(author)) {
				criteria.add("ExampleBlog_Author.name like ?");
			}
			if (!criteria.isEmpty()) {
				sqlBuilder.append("WHERE ");
				sqlBuilder.append(criteria.remove(0) + " ");
				for (String criterion : criteria) {
					sqlBuilder.append(" AND " + criterion);
				}
			}
			/*
			 * If all the parameters was given, the "sql" variable content
			 * should be something like SELECT {ExampleBlog_Post.*} FROM
			 * ExampleBlog_Post JOIN ExampleBlog_Author ON
			 * ExampleBlog_Post.authorId = ExampleBlog_Author.authorId WHERE
			 * ExampleBlog_Post.title like ? AND ExampleBlog_Post.content like ?
			 * AND ExampleBlog_Author.name like ?//
			 */
			String sql = sqlBuilder.toString();
			// Now that we have built the query, we can do all the usual stuff.
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("ExampleBlog_Post", PostImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);
			// Setting the positions
			if (Validator.isNotNull(title)) {
				qPos.add("%" + title + "%");
			}
			if (Validator.isNotNull(content)) {
				qPos.add("%" + content + "%");
			}
			if (Validator.isNotNull(author)) {
				qPos.add("%" + author + "%");
			}

			// execute the query and return a list from the db
			return (List<Post>) QueryUtil.list(q, getDialect(), begin, end);
		} catch (Exception e) {

			throw new SystemException(e);
		} finally {

			// must have this to close the hibernate session..
			// if you fail to do this.. you will have a lot of open sessions…
			closeSession(session);
		}
	}
}
