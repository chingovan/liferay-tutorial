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

import com.blogspot.chingovan.customjsp.servicebuilder.model.Author;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the author service. This utility wraps {@link AuthorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chinv
 * @see AuthorPersistence
 * @see AuthorPersistenceImpl
 * @generated
 */
public class AuthorUtil {
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
	public static void clearCache(Author author) {
		getPersistence().clearCache(author);
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
	public static List<Author> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Author> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Author> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Author update(Author author) throws SystemException {
		return getPersistence().update(author);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Author update(Author author, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(author, serviceContext);
	}

	/**
	* Caches the author in the entity cache if it is enabled.
	*
	* @param author the author
	*/
	public static void cacheResult(
		com.blogspot.chingovan.customjsp.servicebuilder.model.Author author) {
		getPersistence().cacheResult(author);
	}

	/**
	* Caches the authors in the entity cache if it is enabled.
	*
	* @param authors the authors
	*/
	public static void cacheResult(
		java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> authors) {
		getPersistence().cacheResult(authors);
	}

	/**
	* Creates a new author with the primary key. Does not add the author to the database.
	*
	* @param authorId the primary key for the new author
	* @return the new author
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Author create(
		long authorId) {
		return getPersistence().create(authorId);
	}

	/**
	* Removes the author with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param authorId the primary key of the author
	* @return the author that was removed
	* @throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchAuthorException if a author with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Author remove(
		long authorId)
		throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchAuthorException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(authorId);
	}

	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Author updateImpl(
		com.blogspot.chingovan.customjsp.servicebuilder.model.Author author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(author);
	}

	/**
	* Returns the author with the primary key or throws a {@link com.blogspot.chingovan.customjsp.servicebuilder.NoSuchAuthorException} if it could not be found.
	*
	* @param authorId the primary key of the author
	* @return the author
	* @throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchAuthorException if a author with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Author findByPrimaryKey(
		long authorId)
		throws com.blogspot.chingovan.customjsp.servicebuilder.NoSuchAuthorException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(authorId);
	}

	/**
	* Returns the author with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param authorId the primary key of the author
	* @return the author, or <code>null</code> if a author with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Author fetchByPrimaryKey(
		long authorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(authorId);
	}

	/**
	* Returns all the authors.
	*
	* @return the authors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Author> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the authors from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of authors.
	*
	* @return the number of authors
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the books associated with the author.
	*
	* @param pk the primary key of the author
	* @return the books associated with the author
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> getBooks(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getBooks(pk);
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
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> getBooks(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getBooks(pk, start, end);
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
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> getBooks(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getBooks(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of books associated with the author.
	*
	* @param pk the primary key of the author
	* @return the number of books associated with the author
	* @throws SystemException if a system exception occurred
	*/
	public static int getBooksSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getBooksSize(pk);
	}

	/**
	* Returns <code>true</code> if the book is associated with the author.
	*
	* @param pk the primary key of the author
	* @param bookPK the primary key of the book
	* @return <code>true</code> if the book is associated with the author; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsBook(long pk, long bookPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsBook(pk, bookPK);
	}

	/**
	* Returns <code>true</code> if the author has any books associated with it.
	*
	* @param pk the primary key of the author to check for associations with books
	* @return <code>true</code> if the author has any books associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsBooks(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsBooks(pk);
	}

	/**
	* Adds an association between the author and the book. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the author
	* @param bookPK the primary key of the book
	* @throws SystemException if a system exception occurred
	*/
	public static void addBook(long pk, long bookPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addBook(pk, bookPK);
	}

	/**
	* Adds an association between the author and the book. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the author
	* @param book the book
	* @throws SystemException if a system exception occurred
	*/
	public static void addBook(long pk,
		com.blogspot.chingovan.customjsp.servicebuilder.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addBook(pk, book);
	}

	/**
	* Adds an association between the author and the books. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the author
	* @param bookPKs the primary keys of the books
	* @throws SystemException if a system exception occurred
	*/
	public static void addBooks(long pk, long[] bookPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addBooks(pk, bookPKs);
	}

	/**
	* Adds an association between the author and the books. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the author
	* @param books the books
	* @throws SystemException if a system exception occurred
	*/
	public static void addBooks(long pk,
		java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> books)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addBooks(pk, books);
	}

	/**
	* Clears all associations between the author and its books. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the author to clear the associated books from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearBooks(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearBooks(pk);
	}

	/**
	* Removes the association between the author and the book. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the author
	* @param bookPK the primary key of the book
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBook(long pk, long bookPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBook(pk, bookPK);
	}

	/**
	* Removes the association between the author and the book. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the author
	* @param book the book
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBook(long pk,
		com.blogspot.chingovan.customjsp.servicebuilder.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBook(pk, book);
	}

	/**
	* Removes the association between the author and the books. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the author
	* @param bookPKs the primary keys of the books
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBooks(long pk, long[] bookPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBooks(pk, bookPKs);
	}

	/**
	* Removes the association between the author and the books. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the author
	* @param books the books
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBooks(long pk,
		java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> books)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBooks(pk, books);
	}

	/**
	* Sets the books associated with the author, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the author
	* @param bookPKs the primary keys of the books to be associated with the author
	* @throws SystemException if a system exception occurred
	*/
	public static void setBooks(long pk, long[] bookPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setBooks(pk, bookPKs);
	}

	/**
	* Sets the books associated with the author, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the author
	* @param books the books to be associated with the author
	* @throws SystemException if a system exception occurred
	*/
	public static void setBooks(long pk,
		java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> books)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setBooks(pk, books);
	}

	public static AuthorPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AuthorPersistence)PortletBeanLocatorUtil.locate(com.blogspot.chingovan.customjsp.servicebuilder.service.ClpSerializer.getServletContextName(),
					AuthorPersistence.class.getName());

			ReferenceRegistry.registerReference(AuthorUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AuthorPersistence persistence) {
	}

	private static AuthorPersistence _persistence;
}