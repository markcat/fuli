package com.tiandijiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping("/index.do")
	public String index(Model model){
		
		return "redirect:/newsarticle/list.do";
	}
}
