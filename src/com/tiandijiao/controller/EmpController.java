package com.tiandijiao.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tiandijiao.dao.EmpDao;
import com.tiandijiao.entity.Emp;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Resource
	private EmpDao empDao;
	
	@RequestMapping("/findEmp.do")
	public String find(Model model) {
		List<Emp> list = empDao.findAll();
		model.addAttribute("emps", list);
		return "emp/emp_list";
	}
}
