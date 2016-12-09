package com.blog.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.models.Bloger;
import com.blog.repository.BlogerRopository;

@Service
public class BlogerService {
	@Resource
	private BlogerRopository blogerRopository;
	public Bloger find(){
		return blogerRopository.find();
	}
}
