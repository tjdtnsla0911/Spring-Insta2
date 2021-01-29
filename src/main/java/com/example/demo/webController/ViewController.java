package com.example.demo.webController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Controller 
public class ViewController {
	
	User user;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/")
	public String index() {
		System.out.println("/에옴");
		List<User> users = userRepository.userList();
		System.out.println("user = "+users);
		return "index";
	}
	
	@RequestMapping("/addmin")
	public @ResponseBody String test() {
		System.out.println("/user에옴");
		return "index";
	}

}
