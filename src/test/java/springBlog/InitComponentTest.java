package springBlog;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.models.Blog;
import com.blog.models.BlogType;
import com.blog.models.Link;
import com.blog.models.PageBean;
import com.blog.services.BlogService;
import com.blog.services.BlogTypeService;
import com.blog.services.LinkService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class InitComponentTest {
	@Resource
	private BlogService blogService;
	
	@Resource
	private BlogTypeService blogTypeService;
	
	@Resource
	private LinkService linkService;
	
	@Test
	public void blogTypeTest(){
		List<BlogType> blogCount = blogTypeService.countList();
		for (BlogType blogType : blogCount) {
			System.out.println(blogType.toString());
		}
		
	}
	@Test
	public void blogCountListTest(){
		List<Blog> blogCountList = blogService.blogCountList();
		for (Blog blog : blogCountList) {
			System.out.println(blog.getReleaseDateStr()+"===="+blog.getBlogCount());
		}
	}
	
	@Test
	public void linkServiceTest(){
		List<Link> linkList = linkService.list(8);
		for (Link link : linkList) {
			System.out.println(link.getLinkName());
		}
	}
	
	@Test
	public void pageBeanTest(){
		PageBean pageBean1 = new PageBean(1, 15);
		System.out.println(pageBean1.getPageSize());
		PageBean pageBean2 = new PageBean(1, 20);
		System.out.println(pageBean2.getPageSize());
	}
}
