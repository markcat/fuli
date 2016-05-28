package com.tiandijiao.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tiandijiao.entity.Emp;


@Controller
@RequestMapping("/test")
public class JsonController {

	
	@RequestMapping("/test1.do")
	@ResponseBody
	public boolean f1 (){
		
		return true;
	}
	
	@RequestMapping("/test2.do")
	@ResponseBody
	public Map<String, Object> f2 () {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("id", 1001);
		data.put("name", "¡ı±∏");
		return data;
	}
	
	@RequestMapping("/test3.do")
	@ResponseBody
	public List<String> f3 () {
		List<String> list = new ArrayList<String>();
		list.add("spring");
		list.add("mybatis");
		list.add("struts");
		return list;
	}
	
	@RequestMapping("/test4.do")
	@ResponseBody
	public Emp f4 () {
		Emp e = new Emp();
		
		e.setEmpno(1);
		
		e.setEname("¡ı≤‘À…");
		
		e.setMgr(1);
		
		e.setSal(10000.0);
		
		e.setDeptno(30);		
		return e;
	}
	
	@RequestMapping("/test5.do")
	@ResponseBody
	public List<Emp> f5() {
		List<Emp> list = new ArrayList<Emp>();
		Emp e1 = new Emp();
		e1.setEmpno(1);
		e1.setEname("ƒ≥»À");
		return list;
	}
}
