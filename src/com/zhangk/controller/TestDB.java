package com.zhangk.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangk.entity.User;
import com.zhangk.service.UserService;

@Controller
public class TestDB {
	
	private UserService userService;

	
	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/testHibernate")
	public String testHibernate(User user){
		System.out.println(user);
		userService.add(user);
		
		
		return "success";
	}
	

}
