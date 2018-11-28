package com.zhangk.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.zhangk.entity.Address;
import com.zhangk.entity.User;
import com.zhangk.service.UserService;

@SessionAttributes(value = { "user", "id" }, types = { String.class })
@Controller
/**
 * @author ZHANGK
 */
public class HelloWorld {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/success")
	public String testHelloWorld(User user1) {
		System.out.println(user1);
		return "success";
	}

	/*@ModelAttribute
	public void getUser(Model model) {
		Address address = new Address("zobo", "11-1");
		User user = new User(1, "zhangk", 11, 0, address);
		model.addAttribute("user", user);
	}*/
	
	@RequestMapping("/testUserService")
	public String testUserService(User user){
		userService.addOrUpdate(user);
		return "success";
	}

}
