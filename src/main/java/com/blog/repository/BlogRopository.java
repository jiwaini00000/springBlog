


package com.blog.repository;

import java.util.List;
import java.util.Map;


import com.blog.models.Blog;

public interface BlogRopository {
	
	/**
	 * 查询blog列表
	 */
	public List<Blog> list(Map<String, Object> map);
}
