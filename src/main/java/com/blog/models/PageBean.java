package com.blog.models;

public class PageBean {
	private final Integer page;
	private final Integer pageSize;
	private final Integer pageStart;
	
	public PageBean(int page, int pageSize){
		super();
		this.page = page;
		this.pageSize = pageSize;
		this.pageStart = (page - 1) * pageSize;
	}
	

	public Integer getPage() {
		return page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Integer getPageStart() {
		return pageStart;
	}
	
}
