package com.blog.services;

import java.util.List;
import java.util.Map;

import com.blog.models.Blog;

public interface BlogService {
	/**
	 * 查询blog列表
	 * @param map
	 * @return
	 */
	public List<Blog> list(Map<String, Object> map);
}
