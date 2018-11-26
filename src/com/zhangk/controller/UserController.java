package com.zhangk.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@ModelAttribute
	public void getUser(Map<String,User> map,@RequestParam(value="id",required=false,defaultValue="0") int id){
		//System.out.println(id);
		if(id!=0){
			User user = userService.get(id);
			map.put("user", user);
			System.out.println(user);
		}
		
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
	
	
	@RequestMapping(value="/userUpdate",method=RequestMethod.PUT)
	public String userSaveOrUpdate(User user){
		
		System.out.println(user);
		
		userService.addOrUpdate(user);
		
		return "redirect:/userList";
	}
	
	@RequestMapping(value="/userSave",method=RequestMethod.POST)
	public String userSave(User user){
		
		userService.addOrUpdate(user);
		
		return "redirect:/userList";
		
	}
	
	@RequestMapping("/user/{id}")
	public String input(Map<String,Object> map,@PathVariable int id){
		map.put("user", userService.get(id));
		return "input";
	}
	
	@RequestMapping(value="/userDelete/{id}",method=RequestMethod.DELETE)
	public String userDelete(User user){
		
		userService.delete(user);
		
		return "redirect:/userList";
	}
	
	

}
