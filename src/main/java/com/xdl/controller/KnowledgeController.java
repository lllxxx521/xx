package com.xdl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xdl.bean.Knowledge;
import com.xdl.service.KnowledgeService;

@Controller
public class KnowledgeController {

	@Autowired
	private KnowledgeService knowledgeservice;
	
	@RequestMapping("/knowledge/list")
	public ModelAndView load() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("list");
		List<Knowledge> list = knowledgeservice.loadKnowledge();
		mav.getModel().put("data", list);
		return mav;
	}
}
