package com.zhangk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
		userService.addOrUpdate(user);
		
		
		return "success";
	}
	
	
	@ResponseBody
	@RequestMapping("/testJson")
	public User testJson(){
		return userService.get(1);
	}
	

}
