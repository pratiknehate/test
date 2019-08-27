package com.pratik.location.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pratik.location.entities.P_user;
import com.pratik.location.repos.UserRepository;
@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/login1")
	public String login() {	
		return "login";
	}
	@RequestMapping("/register")
	public String regPage() {	
		return "registration";
	}
	@RequestMapping("/registration")
	public String register(@ModelAttribute("user") P_user user) {
		userRepository.save(user);
		return "login";
	}
	@RequestMapping("/login")
	public String login(@RequestParam("email")String email,@RequestParam("password")String password,ModelMap map) {
		P_user user1 = userRepository.findByEmail(email);
	//	System.out.println(user.getEmail()+"  "+user.getPassword()+"    "+password+"    "+email);
		if(user1.getPassword().equals(password))
		{
			return "flights";
		}
		else
		{
			map.addAttribute("msg", "wrong login");
		}
		return "login";	
	}	
}