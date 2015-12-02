package com.SH.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SH.model.user;
import com.SH.service.userService;

public class myTest {
	@Test
	public void saveTest() throws Exception {
		ApplicationContext Context = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});				
		userService service = (userService)Context.getBean("userService");						
		user u = new user();
		u.setName("zhan");
		service.save(u);
	}
}
