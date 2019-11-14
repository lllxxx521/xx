package com.xdl.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdl.bean.Knowledge;
import com.xdl.dao.knowledgeDAO;
import com.xdl.service.KnowledgeService;

@Service
public class KnowledgeServiceImpl implements KnowledgeService {

	@Autowired
	private knowledgeDAO knowledgeDao;
	
	public List<Knowledge> loadKnowledge() {
		return knowledgeDao.findAll();
		
	}

}
