package com.tiandijiao.helloWorld;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {
	
	@RequestMapping("helloWorld")
	public ModelAndView helloWorld(){
		ModelAndView mav = new ModelAndView("hello_world");
		return mav;
	}
	
}
