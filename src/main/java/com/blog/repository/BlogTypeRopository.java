package com.blog.repository;

import com.blog.models.BlogType;

public interface BlogTypeRopository {
	/**
	 * 根据Id查询blog分类
	 * @param id
	 * @return
	 */
	public BlogType findById(Integer id);
}
