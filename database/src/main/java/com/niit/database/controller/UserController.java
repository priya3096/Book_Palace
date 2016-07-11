package com.niit.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.database.dao.UserDAO;

@Controller
public class UserController {
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/isValidUser")
	public ModelAndView isValidUser(@RequestParam(value="name")String name, @RequestParam(value="password")String password)
	{
		System.out.println("controller");
		System.out.println("");
		String message;
		ModelAndView mv ;
		if (userDAO.isValidUser(name, password,true)) 
		{
			System.out.println("in controller");
			message = "";
			 mv = new ModelAndView("adminpage");
		} else {
			message = "Invalid credentials :(";
			 mv = new ModelAndView("login");
		}

		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
		
	}
	

}
