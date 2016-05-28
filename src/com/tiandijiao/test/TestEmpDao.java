package com.tiandijiao.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tiandijiao.dao.EmpDao;
import com.tiandijiao.entity.Condition;
import com.tiandijiao.entity.Emp;

/**
 * EmpDao  测试类
 * @author markcat
 *
 */
public class TestEmpDao {
	/**
	 * 测试查询全部员工
	 */
	/*
	@Test
	public void testFindAll () {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDao dao = ctx.getBean(EmpDao.class);
		List<Emp> list = dao.findAll();
		for(Emp e:list){
			System.out.println("测试查询全部员工");
			System.out.println(
					e.getEmpno() + " " +
					e.getEname() + " " +
					e.getJob()
			);
		}
	}
	*/
	
	
	/**
	 * 根据部门查询员工
	 */
	
	@Test
	public void testFindByDept () {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDao dao = ctx.getBean(EmpDao.class);
		
		Condition cond = new Condition();
		cond.setDeptno(10);
		List<Emp> list = dao.findByDept(cond);
		for(Emp e:list){
			System.out.println("根据部门查询员工");
			System.out.println(
					e.getEmpno() + " " +
					e.getEname() + " " +
					e.getJob()
			);
		}
	}
	/**
	 * 查询大于当前收入的员工
	 */
	
	@Test
	public void testFindBySalary () {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDao dao = ctx.getBean(EmpDao.class);
		
		Condition cond = new Condition();
		cond.setSalary(4000.0);
		List<Emp> list = dao.findBySalary(cond);
		for(Emp e : list){
			System.out.println("查询大于当前收入的员工");
			System.out.println(
				e.getEmpno() + " " +
				e.getEname() + " " +
				e.getJob()
			);
		}
	}
}
