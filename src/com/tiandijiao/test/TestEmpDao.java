package com.tiandijiao.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tiandijiao.dao.EmpDao;
import com.tiandijiao.entity.Condition;
import com.tiandijiao.entity.Emp;

/**
 * EmpDao  ������
 * @author markcat
 *
 */
public class TestEmpDao {
	/**
	 * ���Բ�ѯȫ��Ա��
	 */
	/*
	@Test
	public void testFindAll () {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDao dao = ctx.getBean(EmpDao.class);
		List<Emp> list = dao.findAll();
		for(Emp e:list){
			System.out.println("���Բ�ѯȫ��Ա��");
			System.out.println(
					e.getEmpno() + " " +
					e.getEname() + " " +
					e.getJob()
			);
		}
	}
	*/
	
	
	/**
	 * ���ݲ��Ų�ѯԱ��
	 */
	
	@Test
	public void testFindByDept () {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDao dao = ctx.getBean(EmpDao.class);
		
		Condition cond = new Condition();
		cond.setDeptno(10);
		List<Emp> list = dao.findByDept(cond);
		for(Emp e:list){
			System.out.println("���ݲ��Ų�ѯԱ��");
			System.out.println(
					e.getEmpno() + " " +
					e.getEname() + " " +
					e.getJob()
			);
		}
	}
	/**
	 * ��ѯ���ڵ�ǰ�����Ա��
	 */
	
	@Test
	public void testFindBySalary () {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDao dao = ctx.getBean(EmpDao.class);
		
		Condition cond = new Condition();
		cond.setSalary(4000.0);
		List<Emp> list = dao.findBySalary(cond);
		for(Emp e : list){
			System.out.println("��ѯ���ڵ�ǰ�����Ա��");
			System.out.println(
				e.getEmpno() + " " +
				e.getEname() + " " +
				e.getJob()
			);
		}
	}
}
