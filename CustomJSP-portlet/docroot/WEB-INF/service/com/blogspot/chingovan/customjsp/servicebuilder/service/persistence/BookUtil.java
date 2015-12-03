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

import com.blogspot.chingovan.customjsp.servicebuilder.model.Book;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the book service. This utility wraps {@link BookPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chinv
 * @see BookPersistence
 * @see BookPersistenceImpl
 * @generated
 */
public class BookUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Book book) {
		getPersistence().clearCache(book);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Book update(Book book) throws SystemException {
		return getPersistence().update(book);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Book update(Book book, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(book, serviceContext);
	}

	/**
	* Caches the book in the entity cache if it is enabled.
	*
	* @param book the book
	*/
	public static void cacheResult(
		com.blogspot.chingovan.customjsp.servicebuilder.model.Book book) {
		getPersistence().cacheResult(book);
	}

	/**
	* Caches the books in the entity cache if it is enabled.
	*
	* @param books the books
	*/
	public static void cacheResult(
		java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> books) {
		getPersistence().cacheResult(books);
	}

	/**
	* Creates a new book with the primary key. Does not add the book to the database.
	*
	* @param bookId the primary key for the new book
	* @return the new book
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Book create(
		long bookId) {
		return getPersistence().create(bookId);
	}

	/**
	* Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the book
	* @return the book that was removed
	* @throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchBookException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Book remove(
		long bookId)
		throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(bookId);
	}

	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Book updateImpl(
		com.blogspot.chingovan.customjsp.servicebuilder.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(book);
	}

	/**
	* Returns the book with the primary key or throws a {@link com.blogspot.chingovan.customjsp.servicebuilder.NoSuchBookException} if it could not be found.
	*
	* @param bookId the primary key of the book
	* @return the book
	* @throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchBookException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Book findByPrimaryKey(
		long bookId)
		throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(bookId);
	}

	/**
	* Returns the book with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookId the primary key of the book
	* @return the book, or <code>null</code> if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Book fetchByPrimaryKey(
		long bookId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(bookId);
	}

	/**
	* Returns all the books.
	*
	* @return the books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the books from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of books.
	*
	* @return the number of books
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the authors associated with the book.
	*
	* @param pk the primary key of the book
	* @return the authors associated with the book
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> getAuthors(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getAuthors(pk);
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
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> getAuthors(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getAuthors(pk, start, end);
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
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> getAuthors(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getAuthors(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of authors associated with the book.
	*
	* @param pk the primary key of the book
	* @return the number of authors associated with the book
	* @throws SystemException if a system exception occurred
	*/
	public static int getAuthorsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getAuthorsSize(pk);
	}

	/**
	* Returns <code>true</code> if the author is associated with the book.
	*
	* @param pk the primary key of the book
	* @param authorPK the primary key of the author
	* @return <code>true</code> if the author is associated with the book; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsAuthor(long pk, long authorPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsAuthor(pk, authorPK);
	}

	/**
	* Returns <code>true</code> if the book has any authors associated with it.
	*
	* @param pk the primary key of the book to check for associations with authors
	* @return <code>true</code> if the book has any authors associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsAuthors(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsAuthors(pk);
	}

	/**
	* Adds an association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authorPK the primary key of the author
	* @throws SystemException if a system exception occurred
	*/
	public static void addAuthor(long pk, long authorPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addAuthor(pk, authorPK);
	}

	/**
	* Adds an association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param author the author
	* @throws SystemException if a system exception occurred
	*/
	public static void addAuthor(long pk,
		com.blogspot.chingovan.customjsp.servicebuilder.model.Author author)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addAuthor(pk, author);
	}

	/**
	* Adds an association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authorPKs the primary keys of the authors
	* @throws SystemException if a system exception occurred
	*/
	public static void addAuthors(long pk, long[] authorPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addAuthors(pk, authorPKs);
	}

	/**
	* Adds an association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authors the authors
	* @throws SystemException if a system exception occurred
	*/
	public static void addAuthors(long pk,
		java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> authors)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addAuthors(pk, authors);
	}

	/**
	* Clears all associations between the book and its authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book to clear the associated authors from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearAuthors(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearAuthors(pk);
	}

	/**
	* Removes the association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authorPK the primary key of the author
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAuthor(long pk, long authorPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAuthor(pk, authorPK);
	}

	/**
	* Removes the association between the book and the author. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param author the author
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAuthor(long pk,
		com.blogspot.chingovan.customjsp.servicebuilder.model.Author author)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAuthor(pk, author);
	}

	/**
	* Removes the association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authorPKs the primary keys of the authors
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAuthors(long pk, long[] authorPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAuthors(pk, authorPKs);
	}

	/**
	* Removes the association between the book and the authors. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authors the authors
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAuthors(long pk,
		java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> authors)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAuthors(pk, authors);
	}

	/**
	* Sets the authors associated with the book, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authorPKs the primary keys of the authors to be associated with the book
	* @throws SystemException if a system exception occurred
	*/
	public static void setAuthors(long pk, long[] authorPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setAuthors(pk, authorPKs);
	}

	/**
	* Sets the authors associated with the book, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the book
	* @param authors the authors to be associated with the book
	* @throws SystemException if a system exception occurred
	*/
	public static void setAuthors(long pk,
		java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> authors)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setAuthors(pk, authors);
	}

	public static BookPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BookPersistence)PortletBeanLocatorUtil.locate(com.blogspot.chingovan.customjsp.servicebuilder.service.ClpSerializer.getServletContextName(),
					BookPersistence.class.getName());

			ReferenceRegistry.registerReference(BookUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BookPersistence persistence) {
	}

	private static BookPersistence _persistence;
}