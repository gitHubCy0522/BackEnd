package cn.nsw.service;

import java.util.List;

import cn.nsw.entity.User;

public interface UserService {
	
	public List<User> selectUser();
	
	public User getUser(String name,String pwd);
}
