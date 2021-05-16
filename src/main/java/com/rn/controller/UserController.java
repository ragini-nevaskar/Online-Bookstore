package com.rn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rn.entities.User;
import com.rn.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	/* LOGIN MODULE */
	
	@RequestMapping("login")
	public ModelAndView loginHandler(@RequestParam("email") String email, @RequestParam("username") String username, @RequestParam("password") String password) {
		boolean okay=false;
		
		ModelAndView mv=new ModelAndView();
		List<Object[]> list=userService.verifyUser(email, username, password);
		
		outer:for(int i=0; i<list.size(); i++) {
			for(int j=0; j<list.get(i).length; j++) {
				if(list.get(i)[0]==email) {
					if(list.get(i)[1]==username && list.get(i)[2]==password) {
						okay=true;
						break outer;
					}
				}
			}
		}
		
		if(okay==true) 
		{
			//user valid
			//access granted to user's account
			mv.addObject("userDashboard");
		}else {
			//user invalid
			//access denied
		}
		
		return mv;
	}
	
	
	/* SIGNUP MODULE */
	
	@RequestMapping("signup")
	public String signupFormHandler() {
		return "signupForm";
	}
	
	@RequestMapping("saveUser")
	public ModelAndView saveUserHandler(@ModelAttribute("user_details") User user) {
		
		user=userService.addUser(user);
		
		ModelAndView mv=new ModelAndView("userDashboard");
		
		return mv;
	}
	
	
	/* LOGOUT MODULE */
	
	@RequestMapping("logout")
	public String logoutHandler() {
		return "/../../index";
	}
}
