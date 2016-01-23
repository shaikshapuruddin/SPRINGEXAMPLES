package com.shaik.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shaik.spring.services.UserServices;
@Controller
@RequestMapping("/login.spring")
public class LoginController  {
	@Autowired
	private UserServices userServices;
	
    @RequestMapping(method=RequestMethod.GET)
	public ModelAndView processLogin(@RequestParam("uname")String uname,@RequestParam("pwd")String pwd) throws Exception {
	 
	 boolean flag=userServices.processLogin(uname, pwd);
	 if(flag)
		 return new ModelAndView("Userdetail");
	 else
		 return new ModelAndView("login");
	}
	
	

}
