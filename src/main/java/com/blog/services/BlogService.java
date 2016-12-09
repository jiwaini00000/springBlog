package com.blog.services;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.models.Blog;
import com.blog.repository.BlogRopository;

@Service
public class BlogService {
	@Resource
	private BlogRopository blogRopository;
	public List<Blog> list(Map<String, Object>map){
		return blogRopository.list(map);
	}
}
