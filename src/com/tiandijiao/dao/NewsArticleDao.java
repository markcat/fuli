package com.tiandijiao.dao;

import java.util.List;

import com.tiandijiao.annotation.MyBatisRepository;
import com.tiandijiao.entity.Emp;
import com.tiandijiao.model.comm.NewsArticle;

/**
 * Ա����� DAO ���
 * @author markcat
 *
 */
@MyBatisRepository
public interface NewsArticleDao {
	List<Emp> findAll();
	
	//List<NewsArticle> select(NewsArticle newsArticle);
	
}
