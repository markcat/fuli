package com.tiandijiao.mobile.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tiandijiao.dao.EmpDao;
import com.tiandijiao.dao.NewsArticleDao;
import com.tiandijiao.entity.Emp;
import com.tiandijiao.model.comm.NewsArticle;

@Controller
@RequestMapping("/newsarticle")
public class NewsArticleController {
	
	@Resource
	private NewsArticleDao newsArticleDao;
	
	@Resource
	private EmpDao empDao;
	
	@RequestMapping("/findEmp.do")
	public String find(Model model) {
		List<Emp> list = empDao.findAll();
		model.addAttribute("emps", list);
		return "emp/emp_list";
	}
	
	@RequestMapping("/list.do")
	public String list(Model model, NewsArticle newsArticle){
		List<NewsArticle> resultList = empDao.select(newsArticle);
		model.addAttribute("newsArticles", resultList);
		model.addAttribute("className", "资讯列表");
		return "/news/news_article_list";
	}
	
	@RequestMapping("/view")
	public String viewById(Model model, NewsArticle newsArticle){
		NewsArticle result = empDao.selectById(newsArticle);
		model.addAttribute("newsArticle", result);
		model.addAttribute("className", "资讯正文");
		return "/news/news_article_detail";
	}
}
