package cn.nsw.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.nsw.entity.User;
import cn.nsw.service.UserService;
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@ResponseBody
	@RequestMapping("/index")
	public Map<String, Object> hello(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object>map = new HashMap<String,Object>();
		String name = request.getParameter("name1");
		System.out.println(name);
		map.put("试试", "试试");
		map.put("2", "2");
		map.put("3", "3");
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/hello")
	public List<User> seletUser(){
		return userService.selectUser();
	}
	
	@ResponseBody
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public User getUser(HttpServletRequest request,HttpServletResponse response){
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		User user = userService.getUser(name, pwd);
		if (user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("name", user.getUserName());
			System.out.println(session.getAttribute("name"));
			return user;
		}
		return null;
	}
}
