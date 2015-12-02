package com.SH.DAOimp;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.SH.dao.UserDao;
import com.SH.model.user;
@Component("userDao")
public class userDaoImp implements UserDao{
	private SessionFactory mySessionFactory;
	public SessionFactory getMySessionFactory() {
		return mySessionFactory;
	}
	@Resource
	public void setMySessionFactory(SessionFactory mySessionFactory) {
		this.mySessionFactory = mySessionFactory;
	}
	public void add(user u){
		Session session=mySessionFactory.openSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
		System.out.print("user saved");
		System.out.print("test");
	}

}
