package com.xdl.bean;

import java.io.Serializable;

public class Knowledge implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String memo;
	public Knowledge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Knowledge(int id, String name, String memo) {
		super();
		this.id = id;
		this.name = name;
		this.memo = memo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "KnowledgePoint [id=" + id + ", name=" + name + ", memo=" + memo + "]";
	}
	
}
