package cn.nsw.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class UserController {
	
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
}
