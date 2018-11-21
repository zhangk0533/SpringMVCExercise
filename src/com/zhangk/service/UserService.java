package com.zhangk.service;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.zhangk.entity.User;

@Service
public class UserService {
	
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void add(User user){
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		System.out.println("a user add!");
		
	}

}
