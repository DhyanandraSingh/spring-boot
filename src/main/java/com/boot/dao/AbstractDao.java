package com.boot.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 * @author Dhyanandra
 *
 */
public abstract class AbstractDao<PK extends Serializable, T> {

	private final Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public AbstractDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
	}

	/*
	 * @Autowired 
	 * private SessionFactory sessionFactory;
	 */
	
	@PersistenceContext
    private EntityManager entityManager;

	
	/*
	 protected Session getSession() {
		return sessionFactory.getCurrentSession();
	 }
	*/
	
	protected EntityManager getSession() {
		return this.entityManager;
	 }

	public T getByKey(PK key) {
		//return (T) getSession().get(persistentClass, key);
		return (T) getSession().find(persistentClass, key);
	}

	public void persist(Object entity) {
		getSession().persist(entity);
	}

	public T save(T entity) {
		//getSession().save(entity);
		getSession().persist(entity);
		return entity;
	}

	public void delete(T entity) {
		//getSession().delete(entity);
		getSession().remove(entity);
	}
	
	public void update(T entity){
		getSession().merge(entity);
	}

	protected Criteria createEntityCriteria() {
		//return getSession().createCriteria(persistentClass);
		//SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
		Session session = entityManager.unwrap(Session.class);
		//SessionFactory sessionFactory = session.getSessionFactory();
		return session.createCriteria(persistentClass);
	}

}
