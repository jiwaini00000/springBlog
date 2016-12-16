package com.blog.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.models.Link;
import com.blog.repository.LinkRopository;

@Service
public class LinkService {
	@Resource
	private LinkRopository linkRopository;
	
	public List<Link> list(int pageSize){
		return linkRopository.list(pageSize); 
	}
	
}
