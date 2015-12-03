/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.blogspot.chingovan.customjsp.servicebuilder.service.persistence;

import com.blogspot.chingovan.customjsp.servicebuilder.NoSuchAuthorException;
import com.blogspot.chingovan.customjsp.servicebuilder.model.Author;
import com.blogspot.chingovan.customjsp.servicebuilder.model.impl.AuthorImpl;
import com.blogspot.chingovan.customjsp.servicebuilder.model.impl.AuthorModelImpl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the author service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chinv
 * @see AuthorPersistence
 * @see AuthorUtil
 * @generated
 */
public class AuthorPersistenceImpl extends BasePersistenceImpl<Author>
	implements AuthorPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AuthorUtil} to access the author persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AuthorImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AuthorModelImpl.ENTITY_CACHE_ENABLED,
			AuthorModelImpl.FINDER_CACHE_ENABLED, AuthorImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AuthorModelImpl.ENTITY_CACHE_ENABLED,
			AuthorModelImpl.FINDER_CACHE_ENABLED, AuthorImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AuthorModelImpl.ENTITY_CACHE_ENABLED,
			AuthorModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AuthorPersistenceImpl() {
		setModelClass(Author.class);
	}

	/**
	 * Caches the author in the entity cache if it is enabled.
	 *
	 * @param author the author
	 */
	@Override
	public void cacheResult(Author author) {
		EntityCacheUtil.putResult(AuthorModelImpl.ENTITY_CACHE_ENABLED,
			AuthorImpl.class, author.getPrimaryKey(), author);

		author.resetOriginalValues();
	}

	/**
	 * Caches the authors in the entity cache if it is enabled.
	 *
	 * @param authors the authors
	 */
	@Override
	public void cacheResult(List<Author> authors) {
		for (Author author : authors) {
			if (EntityCacheUtil.getResult(
						AuthorModelImpl.ENTITY_CACHE_ENABLED, AuthorImpl.class,
						author.getPrimaryKey()) == null) {
				cacheResult(author);
			}
			else {
				author.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all authors.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AuthorImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AuthorImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the author.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Author author) {
		EntityCacheUtil.removeResult(AuthorModelImpl.ENTITY_CACHE_ENABLED,
			AuthorImpl.class, author.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Author> authors) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Author author : authors) {
			EntityCacheUtil.removeResult(AuthorModelImpl.ENTITY_CACHE_ENABLED,
				AuthorImpl.class, author.getPrimaryKey());
		}
	}

	/**
	 * Creates a new author with the primary key. Does not add the author to the database.
	 *
	 * @param authorId the primary key for the new author
	 * @return the new author
	 */
	@Override
	public Author create(long authorId) {
		Author author = new AuthorImpl();

		author.setNew(true);
		author.setPrimaryKey(authorId);

		return author;
	}

	/**
	 * Removes the author with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param authorId the primary key of the author
	 * @return the author that was removed
	 * @throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchAuthorException if a author with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Author remove(long authorId)
		throws NoSuchAuthorException, SystemException {
		return remove((Serializable)authorId);
	}

	/**
	 * Removes the author with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the author
	 * @return the author that was removed
	 * @throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchAuthorException if a author with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Author remove(Serializable primaryKey)
		throws NoSuchAuthorException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Author author = (Author)session.get(AuthorImpl.class, primaryKey);

			if (author == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAuthorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(author);
		}
		catch (NoSuchAuthorException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Author removeImpl(Author author) throws SystemException {
		author = toUnwrappedModel(author);

		authorToBookTableMapper.deleteLeftPrimaryKeyTableMappings(author.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(author)) {
				author = (Author)session.get(AuthorImpl.class,
						author.getPrimaryKeyObj());
			}

			if (author != null) {
				session.delete(author);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (author != null) {
			clearCache(author);
		}

		return author;
	}

	@Override
	public Author updateImpl(
		com.blogspot.chingovan.customjsp.servicebuilder.model.Author author)
		throws SystemException {
		author = toUnwrappedModel(author);

		boolean isNew = author.isNew();

		Session session = null;

		try {
			session = openSession();

			if (author.isNew()) {
				session.save(author);

				author.setNew(false);
			}
			else {
				session.merge(author);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(AuthorModelImpl.ENTITY_CACHE_ENABLED,
			AuthorImpl.class, author.getPrimaryKey(), author);

		return author;
	}

	protected Author toUnwrappedModel(Author author) {
		if (author instanceof AuthorImpl) {
			return author;
		}

		AuthorImpl authorImpl = new AuthorImpl();

		authorImpl.setNew(author.isNew());
		authorImpl.setPrimaryKey(author.getPrimaryKey());

		authorImpl.setAuthorId(author.getAuthorId());
		authorImpl.setName(author.getName());
		authorImpl.setInstitute(author.getInstitute());
		authorImpl.setUrl(author.getUrl());

		return authorImpl;
	}

	/**
	 * Returns the author with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the author
	 * @return the author
	 * @throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchAuthorException if a author with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Author findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAuthorException, SystemException {
		Author author = fetchByPrimaryKey(primaryKey);

		if (author == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAuthorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return author;
	}

	/**
	 * Returns the author with the primary key or throws a {@link com.blogspot.chingovan.customjsp.servicebuilder.NoSuchAuthorException} if it could not be found.
	 *
	 * @param authorId the primary key of the author
	 * @return the author
	 * @throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchAuthorException if a author with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Author findByPrimaryKey(long authorId)
		throws NoSuchAuthorException, SystemException {
		return findByPrimaryKey((Serializable)authorId);
	}

	/**
	 * Returns the author with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the author
	 * @return the author, or <code>null</code> if a author with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Author fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Author author = (Author)EntityCacheUtil.getResult(AuthorModelImpl.ENTITY_CACHE_ENABLED,
				AuthorImpl.class, primaryKey);

		if (author == _nullAuthor) {
			return null;
		}

		if (author == null) {
			Session session = null;

			try {
				session = openSession();

				author = (Author)session.get(AuthorImpl.class, primaryKey);

				if (author != null) {
					cacheResult(author);
				}
				else {
					EntityCacheUtil.putResult(AuthorModelImpl.ENTITY_CACHE_ENABLED,
						AuthorImpl.class, primaryKey, _nullAuthor);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AuthorModelImpl.ENTITY_CACHE_ENABLED,
					AuthorImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return author;
	}

	/**
	 * Returns the author with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param authorId the primary key of the author
	 * @return the author, or <code>null</code> if a author with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Author fetchByPrimaryKey(long authorId) throws SystemException {
		return fetchByPrimaryKey((Serializable)authorId);
	}

	/**
	 * Returns all the authors.
	 *
	 * @return the authors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Author> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the authors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.customjsp.servicebuilder.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @return the range of authors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Author> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the authors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.customjsp.servicebuilder.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of authors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Author> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Author> list = (List<Author>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_AUTHOR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_AUTHOR;

				if (pagination) {
					sql = sql.concat(AuthorModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Author>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Author>(list);
				}
				else {
					list = (List<Author>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the authors from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Author author : findAll()) {
			remove(author);
		}
	}

	/**
	 * Returns the number of authors.
	 *
	 * @return the number of authors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_AUTHOR);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns all the books associated with the author.
	 *
	 * @param pk the primary key of the author
	 * @return the books associated with the author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> getBooks(
		long pk) throws SystemException {
		return getBooks(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the books associated with the author.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.customjsp.servicebuilder.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the author
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @return the range of books associated with the author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> getBooks(
		long pk, int start, int end) throws SystemException {
		return getBooks(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the books associated with the author.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.customjsp.servicebuilder.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the author
	 * @param start the lower bound of the range of authors
	 * @param end the upper bound of the range of authors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of books associated with the author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> getBooks(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return authorToBookTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of books associated with the author.
	 *
	 * @param pk the primary key of the author
	 * @return the number of books associated with the author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getBooksSize(long pk) throws SystemException {
		long[] pks = authorToBookTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the book is associated with the author.
	 *
	 * @param pk the primary key of the author
	 * @param bookPK the primary key of the book
	 * @return <code>true</code> if the book is associated with the author; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsBook(long pk, long bookPK) throws SystemException {
		return authorToBookTableMapper.containsTableMapping(pk, bookPK);
	}

	/**
	 * Returns <code>true</code> if the author has any books associated with it.
	 *
	 * @param pk the primary key of the author to check for associations with books
	 * @return <code>true</code> if the author has any books associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsBooks(long pk) throws SystemException {
		if (getBooksSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the author and the book. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the author
	 * @param bookPK the primary key of the book
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addBook(long pk, long bookPK) throws SystemException {
		authorToBookTableMapper.addTableMapping(pk, bookPK);
	}

	/**
	 * Adds an association between the author and the book. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the author
	 * @param book the book
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addBook(long pk,
		com.blogspot.chingovan.customjsp.servicebuilder.model.Book book)
		throws SystemException {
		authorToBookTableMapper.addTableMapping(pk, book.getPrimaryKey());
	}

	/**
	 * Adds an association between the author and the books. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the author
	 * @param bookPKs the primary keys of the books
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addBooks(long pk, long[] bookPKs) throws SystemException {
		for (long bookPK : bookPKs) {
			authorToBookTableMapper.addTableMapping(pk, bookPK);
		}
	}

	/**
	 * Adds an association between the author and the books. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the author
	 * @param books the books
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addBooks(long pk,
		List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> books)
		throws SystemException {
		for (com.blogspot.chingovan.customjsp.servicebuilder.model.Book book : books) {
			authorToBookTableMapper.addTableMapping(pk, book.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the author and its books. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the author to clear the associated books from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearBooks(long pk) throws SystemException {
		authorToBookTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the author and the book. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the author
	 * @param bookPK the primary key of the book
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBook(long pk, long bookPK) throws SystemException {
		authorToBookTableMapper.deleteTableMapping(pk, bookPK);
	}

	/**
	 * Removes the association between the author and the book. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the author
	 * @param book the book
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBook(long pk,
		com.blogspot.chingovan.customjsp.servicebuilder.model.Book book)
		throws SystemException {
		authorToBookTableMapper.deleteTableMapping(pk, book.getPrimaryKey());
	}

	/**
	 * Removes the association between the author and the books. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the author
	 * @param bookPKs the primary keys of the books
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBooks(long pk, long[] bookPKs) throws SystemException {
		for (long bookPK : bookPKs) {
			authorToBookTableMapper.deleteTableMapping(pk, bookPK);
		}
	}

	/**
	 * Removes the association between the author and the books. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the author
	 * @param books the books
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBooks(long pk,
		List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> books)
		throws SystemException {
		for (com.blogspot.chingovan.customjsp.servicebuilder.model.Book book : books) {
			authorToBookTableMapper.deleteTableMapping(pk, book.getPrimaryKey());
		}
	}

	/**
	 * Sets the books associated with the author, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the author
	 * @param bookPKs the primary keys of the books to be associated with the author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setBooks(long pk, long[] bookPKs) throws SystemException {
		Set<Long> newBookPKsSet = SetUtil.fromArray(bookPKs);
		Set<Long> oldBookPKsSet = SetUtil.fromArray(authorToBookTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeBookPKsSet = new HashSet<Long>(oldBookPKsSet);

		removeBookPKsSet.removeAll(newBookPKsSet);

		for (long removeBookPK : removeBookPKsSet) {
			authorToBookTableMapper.deleteTableMapping(pk, removeBookPK);
		}

		newBookPKsSet.removeAll(oldBookPKsSet);

		for (long newBookPK : newBookPKsSet) {
			authorToBookTableMapper.addTableMapping(pk, newBookPK);
		}
	}

	/**
	 * Sets the books associated with the author, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the author
	 * @param books the books to be associated with the author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setBooks(long pk,
		List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> books)
		throws SystemException {
		try {
			long[] bookPKs = new long[books.size()];

			for (int i = 0; i < books.size(); i++) {
				com.blogspot.chingovan.customjsp.servicebuilder.model.Book book = books.get(i);

				bookPKs[i] = book.getPrimaryKey();
			}

			setBooks(pk, bookPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(AuthorModelImpl.MAPPING_TABLE_BOOKS_AUTHORS_NAME);
		}
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the author persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.blogspot.chingovan.customjsp.servicebuilder.model.Author")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Author>> listenersList = new ArrayList<ModelListener<Author>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Author>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		authorToBookTableMapper = TableMapperFactory.getTableMapper("Books_Authors",
				"AuthorId", "BookId", this, bookPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(AuthorImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = BookPersistence.class)
	protected BookPersistence bookPersistence;
	protected TableMapper<Author, com.blogspot.chingovan.customjsp.servicebuilder.model.Book> authorToBookTableMapper;
	private static final String _SQL_SELECT_AUTHOR = "SELECT author FROM Author author";
	private static final String _SQL_COUNT_AUTHOR = "SELECT COUNT(author) FROM Author author";
	private static final String _ORDER_BY_ENTITY_ALIAS = "author.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Author exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AuthorPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"authorId", "name", "institute", "url"
			});
	private static Author _nullAuthor = new AuthorImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Author> toCacheModel() {
				return _nullAuthorCacheModel;
			}
		};

	private static CacheModel<Author> _nullAuthorCacheModel = new CacheModel<Author>() {
			@Override
			public Author toEntityModel() {
				return _nullAuthor;
			}
		};
}