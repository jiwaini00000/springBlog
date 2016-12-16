package com.blog.services;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.blog.models.Blog;
import com.blog.models.BlogType;
import com.blog.models.Bloger;
import com.blog.models.Link;
import com.blog.services.BlogerService;

@Component
public class InitComponent implements ServletContextListener,ApplicationContextAware {

	private static ApplicationContext applicationContext;
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext application = sce.getServletContext();
		//查询博主信息
		BlogerService blogerService = (BlogerService) applicationContext.getBean("blogerService");
		Bloger bloger = blogerService.find();
		bloger.setPassword(null);
		application.setAttribute("blogger", bloger);
		//按日志统计日志数量
		BlogService blogService = (BlogService) applicationContext.getBean("blogService");
		List<Blog> blogCountList = blogService.blogCountList();
		application.setAttribute("blogCountList", blogCountList);
		//按日志分类统计日志数量
		BlogTypeService blogTypeService = (BlogTypeService) applicationContext.getBean("blogTypeService");
		List<BlogType> blogTypeCountList = blogTypeService.countList();
		application.setAttribute("blogTypeCountList", blogTypeCountList);
		//查询友情链接
		LinkService linkService = (LinkService) applicationContext.getBean("linkService");
		List<Link> linkList =linkService.list(10);
		application.setAttribute("linkList", linkList);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		InitComponent.applicationContext = applicationContext;
		
	}
	

}
