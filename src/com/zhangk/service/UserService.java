package com.zhangk.service;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.zhangk.dao.UserDao;
import com.zhangk.entity.User;

@Service
public class UserService {

	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addOrUpdate(User user){
		userDao.saveOrUpdate(user);
	}
	
	public List<User> showList(){
		List<User> userList = userDao.findAll();
		return userList;
	}
	
	public User get(int id){
		User user = userDao.findById(id);
		return user;
	}
	
	public void delete(User user){
		userDao.delete(user);
	}
	
}
