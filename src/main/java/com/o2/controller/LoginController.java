package com.o2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.o2.service.LoginService;

@Controller
//@RequestMapping(value = "/user")
public class LoginController {

	@Autowired
	LoginService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
	public ModelAndView validate(HttpServletRequest request) {
		String associateId = request.getParameter("username");
		String password = request.getParameter("password");
		
		ModelAndView model;
		String sessionId = null;
		
		String output = userService.findUserByUsername(associateId, password);
//		System.out.println(output);
		if(!output.isEmpty()) {
		model = new ModelAndView("success");
		model.addObject("fullname", output);
		sessionId=associateId;
		} else {
		model = new ModelAndView("failure");
		model.addObject("error", "You have entered invalid credentials. Try now");
		}
		model.addObject("sessionId", sessionId);
		return model;
		
	}
}
