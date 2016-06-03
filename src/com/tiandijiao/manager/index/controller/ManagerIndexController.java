package com.tiandijiao.manager.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/manager/index")


public class ManagerIndexController {

	
	/**
	 * 获取项目路径名称
	 * 
	 * @author markcat
	 * @param model
	 * @return
	 */
	public Model init(Model model) {
		String contextPath = "/fuli";
		return model.addAttribute("ctx", contextPath);
	}
	

	@RequestMapping(value={"", "/"})
	public String index(Model model){
		init(model);
		
		return "/manager/kernel/manager_index";
	}
}
