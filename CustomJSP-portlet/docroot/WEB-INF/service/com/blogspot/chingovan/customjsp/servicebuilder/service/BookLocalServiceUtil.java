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

package com.blogspot.chingovan.customjsp.servicebuilder.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Book. This utility wraps
 * {@link com.blogspot.chingovan.customjsp.servicebuilder.service.impl.BookLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author chinv
 * @see BookLocalService
 * @see com.blogspot.chingovan.customjsp.servicebuilder.service.base.BookLocalServiceBaseImpl
 * @see com.blogspot.chingovan.customjsp.servicebuilder.service.impl.BookLocalServiceImpl
 * @generated
 */
public class BookLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.blogspot.chingovan.customjsp.servicebuilder.service.impl.BookLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the book to the database. Also notifies the appropriate model listeners.
	*
	* @param book the book
	* @return the book that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Book addBook(
		com.blogspot.chingovan.customjsp.servicebuilder.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addBook(book);
	}

	/**
	* Creates a new book with the primary key. Does not add the book to the database.
	*
	* @param bookId the primary key for the new book
	* @return the new book
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Book createBook(
		long bookId) {
		return getService().createBook(bookId);
	}

	/**
	* Deletes the book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the book
	* @return the book that was removed
	* @throws PortalException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Book deleteBook(
		long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBook(bookId);
	}

	/**
	* Deletes the book from the database. Also notifies the appropriate model listeners.
	*
	* @param book the book
	* @return the book that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Book deleteBook(
		com.blogspot.chingovan.customjsp.servicebuilder.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteBook(book);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Book fetchBook(
		long bookId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchBook(bookId);
	}

	/**
	* Returns the book with the primary key.
	*
	* @param bookId the primary key of the book
	* @return the book
	* @throws PortalException if a book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Book getBook(
		long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBook(bookId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> getBooks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBooks(start, end);
	}

	/**
	* Returns the number of books.
	*
	* @return the number of books
	* @throws SystemException if a system exception occurred
	*/
	public static int getBooksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBooksCount();
	}

	/**
	* Updates the book in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param book the book
	* @return the book that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.blogspot.chingovan.customjsp.servicebuilder.model.Book updateBook(
		com.blogspot.chingovan.customjsp.servicebuilder.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateBook(book);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addAuthorBook(long authorId, long bookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addAuthorBook(authorId, bookId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addAuthorBook(long authorId,
		com.blogspot.chingovan.customjsp.servicebuilder.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addAuthorBook(authorId, book);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addAuthorBooks(long authorId, long[] bookIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addAuthorBooks(authorId, bookIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addAuthorBooks(long authorId,
		java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> Books)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().addAuthorBooks(authorId, Books);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearAuthorBooks(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearAuthorBooks(authorId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteAuthorBook(long authorId, long bookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAuthorBook(authorId, bookId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteAuthorBook(long authorId,
		com.blogspot.chingovan.customjsp.servicebuilder.model.Book book)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAuthorBook(authorId, book);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteAuthorBooks(long authorId, long[] bookIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAuthorBooks(authorId, bookIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteAuthorBooks(long authorId,
		java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> Books)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAuthorBooks(authorId, Books);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> getAuthorBooks(
		long authorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAuthorBooks(authorId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> getAuthorBooks(
		long authorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAuthorBooks(authorId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.blogspot.chingovan.customjsp.servicebuilder.model.Book> getAuthorBooks(
		long authorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getAuthorBooks(authorId, start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getAuthorBooksCount(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAuthorBooksCount(authorId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasAuthorBook(long authorId, long bookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasAuthorBook(authorId, bookId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasAuthorBooks(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasAuthorBooks(authorId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setAuthorBooks(long authorId, long[] bookIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().setAuthorBooks(authorId, bookIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static BookLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BookLocalService.class.getName());

			if (invokableLocalService instanceof BookLocalService) {
				_service = (BookLocalService)invokableLocalService;
			}
			else {
				_service = new BookLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(BookLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(BookLocalService service) {
	}

	private static BookLocalService _service;
}