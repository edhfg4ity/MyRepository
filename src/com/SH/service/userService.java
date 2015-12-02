package com.SH.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.SH.dao.UserDao;
import com.SH.model.user;
@Component("userService")
public class userService {
	private UserDao userDao;
	public void save(user user){
		userDao.add(user);
	}
	public UserDao getUserDao() {
		return userDao;
	}
	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
		System.out.print("ahaha");
	}
	
	
	
}
