package com.blog.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.models.BlogType;
import com.blog.repository.BlogTypeRopository;

@Service
public class BlogTypeService {
	@Resource
	private BlogTypeRopository blogTypeRopository;
	
	public List<BlogType> countList(){
		return blogTypeRopository.countList();
	}
}
