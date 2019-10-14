package com.javaLive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("employee-module/addNew")
public class EmployeeController {
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		System.out.println("In the controller.......");
		System.out.println("Welcome Friends!");
		model.addAttribute("msg", "Welcome Friends!");
		return "result";
	}

}