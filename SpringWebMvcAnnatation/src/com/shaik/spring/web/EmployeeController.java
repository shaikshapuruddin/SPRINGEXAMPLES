package com.shaik.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class EmployeeController {
	@RequestMapping(value="/empSearch.spring",
			method=RequestMethod.GET)
	public String process()
	{
		return "employeesearch";
	}
	

}
