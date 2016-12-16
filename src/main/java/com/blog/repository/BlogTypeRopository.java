package com.blog.repository;

import java.util.List;

import com.blog.models.BlogType;

public interface BlogTypeRopository {
	/**
	 * 根据Id查询blog分类
	 * @param id
	 * @return
	 */
	public BlogType findById(Integer id);
	
	/**
	 * 查询所有分类信息
	 * @return
	 */
	public List<BlogType> countList();
}
