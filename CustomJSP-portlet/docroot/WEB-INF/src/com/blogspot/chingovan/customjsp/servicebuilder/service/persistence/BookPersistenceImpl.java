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

import com.blogspot.chingovan.customjsp.servicebuilder.NoSuchBookException;
import com.blogspot.chingovan.customjsp.servicebuilder.model.Book;
import com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookImpl;
import com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookModelImpl;

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
 * The persistence implementation for the book service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chinv
 * @see BookPersistence
 * @see BookUtil
 * @generated
 */
public class BookPersistenceImpl extends BasePersistenceImpl<Book>
	implements BookPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BookUtil} to access the book persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BookImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookModelImpl.FINDER_CACHE_ENABLED, BookImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookModelImpl.FINDER_CACHE_ENABLED, BookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BookPersistenceImpl() {
		setModelClass(Book.class);
	}

	/**
	 * Caches the book in the entity cache if it is enabled.
	 *
	 * @param book the book
	 */
	@Override
	public void cacheResult(Book book) {
		EntityCacheUtil.putResult(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookImpl.class, book.getPrimaryKey(), book);

		book.resetOriginalValues();
	}

	/**
	 * Caches the books in the entity cache if it is enabled.
	 *
	 * @param books the books
	 */
	@Override
	public void cacheResult(List<Book> books) {
		for (Book book : books) {
			if (EntityCacheUtil.getResult(BookModelImpl.ENTITY_CACHE_ENABLED,
						BookImpl.class, book.getPrimaryKey()) == null) {
				cacheResult(book);
			}
			else {
				book.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all books.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BookImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BookImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the book.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Book book) {
		EntityCacheUtil.removeResult(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookImpl.class, book.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Book> books) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Book book : books) {
			EntityCacheUtil.removeResult(BookModelImpl.ENTITY_CACHE_ENABLED,
				BookImpl.class, book.getPrimaryKey());
		}
	}

	/**
	 * Creates a new book with the primary key. Does not add the book to the database.
	 *
	 * @param bookId the primary key for the new book
	 * @return the new book
	 */
	@Override
	public Book create(long bookId) {
		Book book = new BookImpl();

		book.setNew(true);
		book.setPrimaryKey(bookId);

		return book;
	}

	/**
	 * Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookId the primary key of the book
	 * @return the book that was removed
	 * @throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchBookException if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Book remove(long bookId) throws NoSuchBookException, SystemException {
		return remove((Serializable)bookId);
	}

	/**
	 * Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the book
	 * @return the book that was removed
	 * @throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchBookException if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Book remove(Serializable primaryKey)
		throws NoSuchBookException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Book book = (Book)session.get(BookImpl.class, primaryKey);

			if (book == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBookException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(book);
		}
		catch (NoSuchBookException nsee) {
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
	protected Book removeImpl(Book book) throws SystemException {
		book = toUnwrappedModel(book);

		bookToAuthorTableMapper.deleteLeftPrimaryKeyTableMappings(book.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(book)) {
				book = (Book)session.get(BookImpl.class, book.getPrimaryKeyObj());
			}

			if (book != null) {
				session.delete(book);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (book != null) {
			clearCache(book);
		}

		return book;
	}

	@Override
	public Book updateImpl(
		com.blogspot.chingovan.customjsp.servicebuilder.model.Book book)
		throws SystemException {
		book = toUnwrappedModel(book);

		boolean isNew = book.isNew();

		Session session = null;

		try {
			session = openSession();

			if (book.isNew()) {
				session.save(book);

				book.setNew(false);
			}
			else {
				session.merge(book);
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

		EntityCacheUtil.putResult(BookModelImpl.ENTITY_CACHE_ENABLED,
			BookImpl.class, book.getPrimaryKey(), book);

		return book;
	}

	protected Book toUnwrappedModel(Book book) {
		if (book instanceof BookImpl) {
			return book;
		}

		BookImpl bookImpl = new BookImpl();

		bookImpl.setNew(book.isNew());
		bookImpl.setPrimaryKey(book.getPrimaryKey());

		bookImpl.setBookId(book.getBookId());
		bookImpl.setTitle(book.getTitle());
		bookImpl.setEdition(book.getEdition());
		bookImpl.setIsbn(book.getIsbn());
		bookImpl.setCover(book.getCover());
		bookImpl.setNumberOfPage(book.getNumberOfPage());
		bookImpl.setPublisherName(book.getPublisherName());
		bookImpl.setPublisherURL(book.getPublisherURL());

		return bookImpl;
	}

	/**
	 * Returns the book with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the book
	 * @return the book
	 * @throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchBookException if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Book findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBookException, SystemException {
		Book book = fetchByPrimaryKey(primaryKey);

		if (book == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBookException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return book;
	}

	/**
	 * Returns the book with the primary key or throws a {@link com.blogspot.chingovan.customjsp.servicebuilder.NoSuchBookException} if it could not be found.
	 *
	 * @param bookId the primary key of the book
	 * @return the book
	 * @throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchBookException if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Book findByPrimaryKey(long bookId)
		throws NoSuchBookException, SystemException {
		return findByPrimaryKey((Serializable)bookId);
	}

	/**
	 * Returns the book with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the book
	 * @return the book, or <code>null</code> if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Book fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Book book = (Book)EntityCacheUtil.getResult(BookModelImpl.ENTITY_CACHE_ENABLED,
				BookImpl.class, primaryKey);

		if (book == _nullBook) {
			return null;
		}

		if (book == null) {
			Session session = null;

			try {
				session = openSession();

				book = (Book)session.get(BookImpl.class, primaryKey);

				if (book != null) {
					cacheResult(book);
				}
				else {
					EntityCacheUtil.putResult(BookModelImpl.ENTITY_CACHE_ENABLED,
						BookImpl.class, primaryKey, _nullBook);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BookModelImpl.ENTITY_CACHE_ENABLED,
					BookImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return book;
	}

	/**
	 * Returns the book with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookId the primary key of the book
	 * @return the book, or <code>null</code> if a book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Book fetchByPrimaryKey(long bookId) throws SystemException {
		return fetchByPrimaryKey((Serializable)bookId);
	}

	/**
	 * Returns all the books.
	 *
	 * @return the books
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Book> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the books.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of books
	 * @param end the upper bound of the range of books (not inclusive)
	 * @return the range of books
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Book> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the books.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of books
	 * @param end the upper bound of the range of books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of books
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Book> findAll(int start, int end,
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

		List<Book> list = (List<Book>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BOOK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BOOK;

				if (pagination) {
					sql = sql.concat(BookModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Book>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Book>(list);
				}
				else {
					list = (List<Book>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the books from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Book book : findAll()) {
			remove(book);
		}
	}

	/**
	 * Returns the number of books.
	 *
	 * @return the number of books
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

				Query q = session.createQuery(_SQL_COUNT_BOOK);

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
	 * Returns all the authors associated with the book.
	 *
	 * @param pk the primary key of the book
	 * @return the authors associated with the book
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> getAuthors(
		long pk) throws SystemException {
		return getAuthors(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the authors associated with the book.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the book
	 * @param start the lower bound of the range of books
	 * @param end the upper bound of the range of books (not inclusive)
	 * @return the range of authors associated with the book
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> getAuthors(
		long pk, int start, int end) throws SystemException {
		return getAuthors(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the authors associated with the book.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the book
	 * @param start the lower bound of the range of books
	 * @param end the upper bound of the range of books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of authors associated with the book
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> getAuthors(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return bookToAuthorTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of authors associated with the book.
	 *
	 * @param pk the primary key of the book
	 * @return the number of authors associated with the book
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getAuthorsSize(long pk) throws SystemException {
		long[] pks = bookToAuthorTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the author is associated with the book.
	 *
	 * @param pk the primary key of the book
	 * @param authorPK the primary key of the author
	 * @return <code>true</code> if the author is associated with the book; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsAuthor(long pk, long authorPK)
		throws SystemException {
		return bookToAuthorTableMapper.containsTableMapping(pk, authorPK);
	}

	/**
	 * Returns <code>true</code> if the book has any authors associated with it.
	 *
	 * @param pk the primary key of the book to check for associations with authors
	 * @return <code>true</code> if the book has any authors associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsAuthors(long pk) throws SystemException {
		if (getAuthorsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the book
	 * @param authorPK the primary key of the author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addAuthor(long pk, long authorPK) throws SystemException {
		bookToAuthorTableMapper.addTableMapping(pk, authorPK);
	}

	/**
	 * Adds an association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the book
	 * @param author the author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addAuthor(long pk,
		com.blogspot.chingovan.customjsp.servicebuilder.model.Author author)
		throws SystemException {
		bookToAuthorTableMapper.addTableMapping(pk, author.getPrimaryKey());
	}

	/**
	 * Adds an association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the book
	 * @param authorPKs the primary keys of the authors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addAuthors(long pk, long[] authorPKs) throws SystemException {
		for (long authorPK : authorPKs) {
			bookToAuthorTableMapper.addTableMapping(pk, authorPK);
		}
	}

	/**
	 * Adds an association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the book
	 * @param authors the authors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addAuthors(long pk,
		List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> authors)
		throws SystemException {
		for (com.blogspot.chingovan.customjsp.servicebuilder.model.Author author : authors) {
			bookToAuthorTableMapper.addTableMapping(pk, author.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the book and its authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the book to clear the associated authors from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearAuthors(long pk) throws SystemException {
		bookToAuthorTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the book
	 * @param authorPK the primary key of the author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAuthor(long pk, long authorPK) throws SystemException {
		bookToAuthorTableMapper.deleteTableMapping(pk, authorPK);
	}

	/**
	 * Removes the association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the book
	 * @param author the author
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAuthor(long pk,
		com.blogspot.chingovan.customjsp.servicebuilder.model.Author author)
		throws SystemException {
		bookToAuthorTableMapper.deleteTableMapping(pk, author.getPrimaryKey());
	}

	/**
	 * Removes the association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the book
	 * @param authorPKs the primary keys of the authors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAuthors(long pk, long[] authorPKs)
		throws SystemException {
		for (long authorPK : authorPKs) {
			bookToAuthorTableMapper.deleteTableMapping(pk, authorPK);
		}
	}

	/**
	 * Removes the association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the book
	 * @param authors the authors
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAuthors(long pk,
		List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> authors)
		throws SystemException {
		for (com.blogspot.chingovan.customjsp.servicebuilder.model.Author author : authors) {
			bookToAuthorTableMapper.deleteTableMapping(pk,
				author.getPrimaryKey());
		}
	}

	/**
	 * Sets the authors associated with the book, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the book
	 * @param authorPKs the primary keys of the authors to be associated with the book
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setAuthors(long pk, long[] authorPKs) throws SystemException {
		Set<Long> newAuthorPKsSet = SetUtil.fromArray(authorPKs);
		Set<Long> oldAuthorPKsSet = SetUtil.fromArray(bookToAuthorTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeAuthorPKsSet = new HashSet<Long>(oldAuthorPKsSet);

		removeAuthorPKsSet.removeAll(newAuthorPKsSet);

		for (long removeAuthorPK : removeAuthorPKsSet) {
			bookToAuthorTableMapper.deleteTableMapping(pk, removeAuthorPK);
		}

		newAuthorPKsSet.removeAll(oldAuthorPKsSet);

		for (long newAuthorPK : newAuthorPKsSet) {
			bookToAuthorTableMapper.addTableMapping(pk, newAuthorPK);
		}
	}

	/**
	 * Sets the authors associated with the book, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the book
	 * @param authors the authors to be associated with the book
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setAuthors(long pk,
		List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> authors)
		throws SystemException {
		try {
			long[] authorPKs = new long[authors.size()];

			for (int i = 0; i < authors.size(); i++) {
				com.blogspot.chingovan.customjsp.servicebuilder.model.Author author =
					authors.get(i);

				authorPKs[i] = author.getPrimaryKey();
			}

			setAuthors(pk, authorPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(BookModelImpl.MAPPING_TABLE_BOOKS_AUTHORS_NAME);
		}
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the book persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.blogspot.chingovan.customjsp.servicebuilder.model.Book")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Book>> listenersList = new ArrayList<ModelListener<Book>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Book>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		bookToAuthorTableMapper = TableMapperFactory.getTableMapper("Books_Authors",
				"BookId", "AuthorId", this, authorPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(BookImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = AuthorPersistence.class)
	protected AuthorPersistence authorPersistence;
	protected TableMapper<Book, com.blogspot.chingovan.customjsp.servicebuilder.model.Author> bookToAuthorTableMapper;
	private static final String _SQL_SELECT_BOOK = "SELECT book FROM Book book";
	private static final String _SQL_COUNT_BOOK = "SELECT COUNT(book) FROM Book book";
	private static final String _ORDER_BY_ENTITY_ALIAS = "book.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Book exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BookPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"bookId", "title", "edition", "isbn", "numberOfPage",
				"publisherName", "publisherURL"
			});
	private static Book _nullBook = new BookImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Book> toCacheModel() {
				return _nullBookCacheModel;
			}
		};

	private static CacheModel<Book> _nullBookCacheModel = new CacheModel<Book>() {
			@Override
			public Book toEntityModel() {
				return _nullBook;
			}
		};
}