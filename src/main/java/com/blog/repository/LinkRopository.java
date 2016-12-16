package com.blog.repository;

import java.util.List;

import com.blog.models.Link;

public interface LinkRopository {
	/**
	 * 查询友情链接列表
	 * @param pageSize
	 * @return
	 */
	public List<Link> list(int pageSize);
}
