package com.tiandijiao.manager.newsarticle.manager;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tiandijiao.common.dao.domain.Identifiable;
import com.tiandijiao.common.service.impl.BaseManager;
import com.tiandijiao.dao.EmpDao;
import com.tiandijiao.model.bean.SuccessMsg;
import com.tiandijiao.model.comm.NewsArticle;
import com.tiandijiao.model.comm.query.NewsArticleQuery;
import com.tiandijiao.model.comm.vo.NewsArticleVo;

@Component
@Transactional
public class NewsArticleManager extends BaseManager<NewsArticle> {
	
	@Autowired
	private EmpDao empDao;
	
	
	
	public SuccessMsg add(NewsArticle newsArticle){
		try {
			newsArticle.setId(generalTableKey());
			newsArticle.setCreateTime(new Date());
			empDao.insert(newsArticle);
			return SuccessMsg.msg("新增成功");
		} catch (Exception e) {
			return SuccessMsg.msg(false, "新增失败");
		}
		
	}
	
	public List<NewsArticleVo> list(NewsArticleQuery query) {
		List<NewsArticleVo> resultList = empDao.select(query);
		
		return resultList;
	}
}








