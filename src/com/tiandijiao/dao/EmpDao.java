package com.tiandijiao.dao;

import java.util.List;

import com.tiandijiao.annotation.MyBatisRepository;
import com.tiandijiao.entity.Condition;
import com.tiandijiao.entity.Emp;
import com.tiandijiao.model.comm.NewsArticle;
import com.tiandijiao.model.comm.query.NewsArticleQuery;
import com.tiandijiao.model.comm.vo.NewsArticleVo;

/**
 * 员工表的 DAO 组件
 * @author markcat
 *
 */
@MyBatisRepository
public interface EmpDao {
	List<Emp> findAll();
	
	List<Emp> findByDept(Condition cond);
	
	List<Emp> findBySalary(Condition cond);
	
	List<NewsArticleVo> select(NewsArticleQuery query);
	
	NewsArticleVo selectById(NewsArticleQuery query);
	
	int insert(NewsArticle query);
	
}
