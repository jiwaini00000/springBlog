package com.blog.services.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.models.Blog;
import com.blog.repository.BlogRopository;
import com.blog.services.BlogService;

@Service("BlogService")
public class BlogServiceImpl implements BlogService {
	@Resource
	private BlogRopository blogRopository;
	@Override
	public List<Blog> list(Map<String, Object> map) {
		
		//System.out.println("ffff");
		return blogRopository.list(map);
	}

}
