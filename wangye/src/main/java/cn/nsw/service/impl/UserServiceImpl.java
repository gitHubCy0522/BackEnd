package cn.nsw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nsw.dao.UserDao;
import cn.nsw.entity.User;
import cn.nsw.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> selectUser() {
		return userDao.selectUser();
	}

	@Override
	public User getUser(String name, String pwd) {
		return userDao.getUser(name, pwd);
	}
}
