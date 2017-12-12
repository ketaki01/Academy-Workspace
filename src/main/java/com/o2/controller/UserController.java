package com.o2.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.o2.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("user/login");
	}

	@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
	public ModelAndView validate(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String output = userService.findUserByUsername(username, password);
//		System.out.println(output);
		if(!output.isEmpty()) {
		ModelAndView model = new ModelAndView("user/success");
		model.addObject("fullname", output);
		}
		ModelAndView model = new ModelAndView("user/failure");
		model.addObject("error", "You have entered invalid credentials. Try now");
		return model;
		
	}
}
