package com.tiandijiao.manager.newsarticle.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tiandijiao.dao.EmpDao;
import com.tiandijiao.manager.newsarticle.manager.NewsArticleManager;
import com.tiandijiao.model.bean.SuccessMsg;
import com.tiandijiao.model.comm.NewsArticle;
import com.tiandijiao.model.comm.query.NewsArticleQuery;
import com.tiandijiao.model.comm.vo.NewsArticleVo;


@Controller
@RequestMapping("/manager/article")
public class ManagerArticleController {
	
	@Autowired(required=true)
	@Qualifier(value="newsArticleManager")
	private NewsArticleManager newsArticleManager;
	
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

	@RequestMapping("/new")
	public String addPage(Model model, NewsArticleQuery query){
		init(model);
		
		return "/manager/kernel/manager_article_edit";
	}
	


	@RequestMapping("/save")
	@ResponseBody
	public SuccessMsg save(Model model, NewsArticle query){
		SuccessMsg msg = newsArticleManager.add(query);
		return msg;
	}
	
	
	@RequestMapping("/list")
	public String list(Model model, NewsArticleQuery query){
		init(model);
		
		List<NewsArticleVo> newsArticleVos = newsArticleManager.list(query);
		model.addAttribute("newsArticles", newsArticleVos);
		
		return "/manager/kernel/manager_article_list";
	}
}





















