package com.tiandijiao.manager.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/manager/index")


public class ManagerIndexController {

	@RequestMapping(value={"", "/"})
	public String index(){
		return "/manager/kernel/index";
	}
}
