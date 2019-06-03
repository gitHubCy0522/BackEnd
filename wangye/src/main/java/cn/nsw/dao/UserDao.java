package cn.nsw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.nsw.entity.User;

public interface UserDao {
	
	public List<User> selectUser();
	
	public User getUser(@Param("name")String name,@Param("pwd")String pwd);
}
