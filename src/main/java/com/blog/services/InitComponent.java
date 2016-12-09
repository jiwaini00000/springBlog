package com.blog.services;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.blog.models.Bloger;

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
		BlogerService blogerService = (BlogerService) applicationContext.getBean("BlogerService");
		Bloger bloger = blogerService.find();
		bloger.setPassword(null);
		application.setAttribute("bloger", bloger);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		InitComponent.applicationContext = applicationContext;
		
	}
	
	

}
