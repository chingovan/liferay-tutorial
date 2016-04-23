/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.blogspot.chingovan.validator.service.persistence;

import com.blogspot.chingovan.validator.NoSuchValidator_StudentException;
import com.blogspot.chingovan.validator.model.Validator_Student;
import com.blogspot.chingovan.validator.model.impl.Validator_StudentImpl;
import com.blogspot.chingovan.validator.model.impl.Validator_StudentModelImpl;

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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the validator_ student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author chinv
 * @see Validator_StudentPersistence
 * @see Validator_StudentUtil
 * @generated
 */
public class Validator_StudentPersistenceImpl extends BasePersistenceImpl<Validator_Student>
	implements Validator_StudentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Validator_StudentUtil} to access the validator_ student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Validator_StudentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Validator_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validator_StudentModelImpl.FINDER_CACHE_ENABLED,
			Validator_StudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Validator_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validator_StudentModelImpl.FINDER_CACHE_ENABLED,
			Validator_StudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Validator_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validator_StudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public Validator_StudentPersistenceImpl() {
		setModelClass(Validator_Student.class);
	}

	/**
	 * Caches the validator_ student in the entity cache if it is enabled.
	 *
	 * @param validator_Student the validator_ student
	 */
	@Override
	public void cacheResult(Validator_Student validator_Student) {
		EntityCacheUtil.putResult(Validator_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validator_StudentImpl.class, validator_Student.getPrimaryKey(),
			validator_Student);

		validator_Student.resetOriginalValues();
	}

	/**
	 * Caches the validator_ students in the entity cache if it is enabled.
	 *
	 * @param validator_Students the validator_ students
	 */
	@Override
	public void cacheResult(List<Validator_Student> validator_Students) {
		for (Validator_Student validator_Student : validator_Students) {
			if (EntityCacheUtil.getResult(
						Validator_StudentModelImpl.ENTITY_CACHE_ENABLED,
						Validator_StudentImpl.class,
						validator_Student.getPrimaryKey()) == null) {
				cacheResult(validator_Student);
			}
			else {
				validator_Student.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all validator_ students.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(Validator_StudentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(Validator_StudentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the validator_ student.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Validator_Student validator_Student) {
		EntityCacheUtil.removeResult(Validator_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validator_StudentImpl.class, validator_Student.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Validator_Student> validator_Students) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Validator_Student validator_Student : validator_Students) {
			EntityCacheUtil.removeResult(Validator_StudentModelImpl.ENTITY_CACHE_ENABLED,
				Validator_StudentImpl.class, validator_Student.getPrimaryKey());
		}
	}

	/**
	 * Creates a new validator_ student with the primary key. Does not add the validator_ student to the database.
	 *
	 * @param studentId the primary key for the new validator_ student
	 * @return the new validator_ student
	 */
	@Override
	public Validator_Student create(long studentId) {
		Validator_Student validator_Student = new Validator_StudentImpl();

		validator_Student.setNew(true);
		validator_Student.setPrimaryKey(studentId);

		return validator_Student;
	}

	/**
	 * Removes the validator_ student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the validator_ student
	 * @return the validator_ student that was removed
	 * @throws com.blogspot.chingovan.validator.NoSuchValidator_StudentException if a validator_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validator_Student remove(long studentId)
		throws NoSuchValidator_StudentException, SystemException {
		return remove((Serializable)studentId);
	}

	/**
	 * Removes the validator_ student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the validator_ student
	 * @return the validator_ student that was removed
	 * @throws com.blogspot.chingovan.validator.NoSuchValidator_StudentException if a validator_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validator_Student remove(Serializable primaryKey)
		throws NoSuchValidator_StudentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Validator_Student validator_Student = (Validator_Student)session.get(Validator_StudentImpl.class,
					primaryKey);

			if (validator_Student == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchValidator_StudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(validator_Student);
		}
		catch (NoSuchValidator_StudentException nsee) {
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
	protected Validator_Student removeImpl(Validator_Student validator_Student)
		throws SystemException {
		validator_Student = toUnwrappedModel(validator_Student);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(validator_Student)) {
				validator_Student = (Validator_Student)session.get(Validator_StudentImpl.class,
						validator_Student.getPrimaryKeyObj());
			}

			if (validator_Student != null) {
				session.delete(validator_Student);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (validator_Student != null) {
			clearCache(validator_Student);
		}

		return validator_Student;
	}

	@Override
	public Validator_Student updateImpl(
		com.blogspot.chingovan.validator.model.Validator_Student validator_Student)
		throws SystemException {
		validator_Student = toUnwrappedModel(validator_Student);

		boolean isNew = validator_Student.isNew();

		Session session = null;

		try {
			session = openSession();

			if (validator_Student.isNew()) {
				session.save(validator_Student);

				validator_Student.setNew(false);
			}
			else {
				session.merge(validator_Student);
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

		EntityCacheUtil.putResult(Validator_StudentModelImpl.ENTITY_CACHE_ENABLED,
			Validator_StudentImpl.class, validator_Student.getPrimaryKey(),
			validator_Student);

		return validator_Student;
	}

	protected Validator_Student toUnwrappedModel(
		Validator_Student validator_Student) {
		if (validator_Student instanceof Validator_StudentImpl) {
			return validator_Student;
		}

		Validator_StudentImpl validator_StudentImpl = new Validator_StudentImpl();

		validator_StudentImpl.setNew(validator_Student.isNew());
		validator_StudentImpl.setPrimaryKey(validator_Student.getPrimaryKey());

		validator_StudentImpl.setStudentId(validator_Student.getStudentId());
		validator_StudentImpl.setCode(validator_Student.getCode());
		validator_StudentImpl.setFullname(validator_Student.getFullname());
		validator_StudentImpl.setGender(validator_Student.isGender());
		validator_StudentImpl.setBirthday(validator_Student.getBirthday());
		validator_StudentImpl.setEmail(validator_Student.getEmail());
		validator_StudentImpl.setAddress(validator_Student.getAddress());
		validator_StudentImpl.setBlog(validator_Student.getBlog());
		validator_StudentImpl.setMark(validator_Student.getMark());

		return validator_StudentImpl;
	}

	/**
	 * Returns the validator_ student with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the validator_ student
	 * @return the validator_ student
	 * @throws com.blogspot.chingovan.validator.NoSuchValidator_StudentException if a validator_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validator_Student findByPrimaryKey(Serializable primaryKey)
		throws NoSuchValidator_StudentException, SystemException {
		Validator_Student validator_Student = fetchByPrimaryKey(primaryKey);

		if (validator_Student == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchValidator_StudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return validator_Student;
	}

	/**
	 * Returns the validator_ student with the primary key or throws a {@link com.blogspot.chingovan.validator.NoSuchValidator_StudentException} if it could not be found.
	 *
	 * @param studentId the primary key of the validator_ student
	 * @return the validator_ student
	 * @throws com.blogspot.chingovan.validator.NoSuchValidator_StudentException if a validator_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validator_Student findByPrimaryKey(long studentId)
		throws NoSuchValidator_StudentException, SystemException {
		return findByPrimaryKey((Serializable)studentId);
	}

	/**
	 * Returns the validator_ student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the validator_ student
	 * @return the validator_ student, or <code>null</code> if a validator_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validator_Student fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Validator_Student validator_Student = (Validator_Student)EntityCacheUtil.getResult(Validator_StudentModelImpl.ENTITY_CACHE_ENABLED,
				Validator_StudentImpl.class, primaryKey);

		if (validator_Student == _nullValidator_Student) {
			return null;
		}

		if (validator_Student == null) {
			Session session = null;

			try {
				session = openSession();

				validator_Student = (Validator_Student)session.get(Validator_StudentImpl.class,
						primaryKey);

				if (validator_Student != null) {
					cacheResult(validator_Student);
				}
				else {
					EntityCacheUtil.putResult(Validator_StudentModelImpl.ENTITY_CACHE_ENABLED,
						Validator_StudentImpl.class, primaryKey,
						_nullValidator_Student);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(Validator_StudentModelImpl.ENTITY_CACHE_ENABLED,
					Validator_StudentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return validator_Student;
	}

	/**
	 * Returns the validator_ student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentId the primary key of the validator_ student
	 * @return the validator_ student, or <code>null</code> if a validator_ student with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Validator_Student fetchByPrimaryKey(long studentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)studentId);
	}

	/**
	 * Returns all the validator_ students.
	 *
	 * @return the validator_ students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Validator_Student> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the validator_ students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.validator.model.impl.Validator_StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of validator_ students
	 * @param end the upper bound of the range of validator_ students (not inclusive)
	 * @return the range of validator_ students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Validator_Student> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the validator_ students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.blogspot.chingovan.validator.model.impl.Validator_StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of validator_ students
	 * @param end the upper bound of the range of validator_ students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of validator_ students
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Validator_Student> findAll(int start, int end,
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

		List<Validator_Student> list = (List<Validator_Student>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VALIDATOR_STUDENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VALIDATOR_STUDENT;

				if (pagination) {
					sql = sql.concat(Validator_StudentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Validator_Student>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Validator_Student>(list);
				}
				else {
					list = (List<Validator_Student>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the validator_ students from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Validator_Student validator_Student : findAll()) {
			remove(validator_Student);
		}
	}

	/**
	 * Returns the number of validator_ students.
	 *
	 * @return the number of validator_ students
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

				Query q = session.createQuery(_SQL_COUNT_VALIDATOR_STUDENT);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the validator_ student persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.blogspot.chingovan.validator.model.Validator_Student")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Validator_Student>> listenersList = new ArrayList<ModelListener<Validator_Student>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Validator_Student>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(Validator_StudentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VALIDATOR_STUDENT = "SELECT validator_Student FROM Validator_Student validator_Student";
	private static final String _SQL_COUNT_VALIDATOR_STUDENT = "SELECT COUNT(validator_Student) FROM Validator_Student validator_Student";
	private static final String _ORDER_BY_ENTITY_ALIAS = "validator_Student.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Validator_Student exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(Validator_StudentPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"studentId", "code", "fullname", "gender", "birthday", "email",
				"address", "blog", "mark"
			});
	private static Validator_Student _nullValidator_Student = new Validator_StudentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Validator_Student> toCacheModel() {
				return _nullValidator_StudentCacheModel;
			}
		};

	private static CacheModel<Validator_Student> _nullValidator_StudentCacheModel =
		new CacheModel<Validator_Student>() {
			@Override
			public Validator_Student toEntityModel() {
				return _nullValidator_Student;
			}
		};
}