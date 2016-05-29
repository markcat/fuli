package com.tiandijiao.manager.newsarticle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tiandijiao.model.comm.NewsArticle;


@Controller
@RequestMapping("/manager/article")
public class ManagerArticleController {

	@RequestMapping("/list")
	public String list(Model model, NewsArticle query){
		return "/manager/kernel/manager_article_list";
	}
}
