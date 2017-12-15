package com.o2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.o2.model.User;
import com.o2.service.RegisterService;

@Controller
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	@RequestMapping("/register")
	public ModelAndView showRegistrationForm(){
//		System.out.println("display Registration page");
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("user", new User());
		return mv;
	}
	
	
	@RequestMapping("/usersave")
	public ModelAndView showNext(@ModelAttribute User user) {
//		System.out.println(user);
		ModelAndView mv;
		String sessionId = null;
		
		if((registerService.checkIfRegistered(user)==null)&&(user.getPassword().equals(user.getConfirmPassword()))) {
		registerService.saveRegistrationData(user);
		mv=new ModelAndView("success");		
		mv.addObject("fullname",user.getName());
		sessionId=user.getAssociateId();
		}
		else{
			mv=new ModelAndView("login");
			mv.addObject("log", "Registered");
		}		
		mv.addObject("sessionId", sessionId);
		return mv;
	}

}
