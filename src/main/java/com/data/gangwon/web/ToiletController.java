package com.data.gangwon.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.data.gangwon.mapper.ToiletMapper;

@Controller
public class ToiletController {
	
	@Autowired
	ToiletMapper toiletMapper;
	
	@RequestMapping(value = "/demo")
	@ResponseBody
	public Integer index() {
		return toiletMapper.toiletCount();
	}
	
	@RequestMapping(value = "/demo2")
	@ResponseBody
	public String index2() {
		return "Success!";
	}
	
	

}
