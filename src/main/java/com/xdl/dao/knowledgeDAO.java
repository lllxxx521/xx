package com.xdl.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xdl.bean.Knowledge;

@Repository
public interface knowledgeDAO {
    
	
	public List<Knowledge> findAll();
}
