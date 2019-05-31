package cn.nsw.dao;

import cn.nsw.entity.User;

public interface UserDao {
	
	public User selectUser(String name,String pwd);
}
