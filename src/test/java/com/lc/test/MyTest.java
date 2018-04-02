package com.lc.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lc.base.model.User;
import com.lc.service.DemoService;
import com.lc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/application.xml" })
public class MyTest {
	@Resource
	private UserService userService = null;
	
	@Resource
	private DemoService demoService = null;

	@Test
	public void test1() {
//		User user = new User();
//		user.setPassword("password");
//		user.setUsername("username");
//		userService.addUser(user);
		demoService.addDemo();
		System.out.println("SUCCESS");
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
	}
}
