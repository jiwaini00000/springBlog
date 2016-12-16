package com.blog.controller;




import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.models.Blog;
import com.blog.services.BlogService;



/**
 * Blog主入口
 * @author 困
 *
 */

@Controller
@RequestMapping(value="/")
public class IndexController {
	private static Logger Log = Logger.getLogger(IndexController.class);
	@Resource
	private BlogService blogService;
	@RequestMapping(value="/")
	public String index(Model model){
		Log.info("fsfds");
		Map<String, Object> map = new HashMap<String, Object>();
		List<Blog> blogList = blogService.list(map);
		model.addAttribute("blogList", blogList);
		model.addAttribute("pageTitle", "java Blog");
		model.addAttribute("mainPage", "foreground/blog/list.jsp");
		return "default";
	}
}
