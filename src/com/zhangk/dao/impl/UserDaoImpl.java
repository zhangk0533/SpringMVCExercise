package com.zhangk.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.zhangk.dao.UserDao;
import com.zhangk.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;
	
	private Session session;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		session = sessionFactory.getCurrentSession();
		session.delete(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		session = sessionFactory.getCurrentSession();
		session.update(user);

	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		session = sessionFactory.getCurrentSession();
		User user = session.get(User.class, id);
		return user;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User");
		List<User> userList = query.list();
		return userList;
	}

}
