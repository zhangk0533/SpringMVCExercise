package com.zhangk.dao;

import java.util.List;

import com.zhangk.entity.User;

public interface UserDao {
	
	public void saveOrUpdate(User user);
	
	public void delete(User user);
	
	public void update(User user);
	
	public User findById(int id);
	
	public List<User> findAll();

}
