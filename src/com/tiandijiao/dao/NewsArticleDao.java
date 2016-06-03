package com.tiandijiao.dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tiandijiao.model.comm.NewsArticle;

/**
 * 员工表的 DAO 组件
 * @author markcat
 *
 */
public interface NewsArticleDao {

//	@Autowired(required = true)
//	protected SqlSession sqlSessionTemplate;
	
	
	
//	public List<NewsArticle> select(NewsArticle query){
//
//		return sqlSessionTemplate.selectList(("queryArticles"),query);
//	}
	
}
