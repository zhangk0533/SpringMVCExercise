package com.zhangk.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangk.entity.User;
import com.zhangk.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	
	@RequestMapping("/userList")
	public String showList(Map<String,List<User>> map){
		List<User> userList = userService.showList();
		map.put("userList", userList);
		return "list";
	}
	
	@RequestMapping("/user")
	public String input(Map<String,Object> map){
		map.put("user", new User());
		return "input";
	}
	
	
	@RequestMapping("/userSaveOrUpdate")
	public String userSaveOrUpdate(User user){
		
		userService.addOrUpdate(user);
		
		return "redirect:/userList";
	}
	
	@RequestMapping("/user/{id}")
	public String input(Map<String,Object> map,@PathVariable int id){
		map.put("user", userService.get(id));
		return "input";
		
	}

}
