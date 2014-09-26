package com.niceman.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niceman.domain.SysUser;
import com.niceman.service.ISysUserService;

@Controller
@RequestMapping("/login")
public class TestController {
	
	@Autowired
	private ISysUserService iSysUserService;
	
	
	
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String view ()
	{
		return "/login/login";
	}
	
	@RequestMapping(value="/doLogin",method = RequestMethod.POST)
	public String doLogin(SysUser sysUser , Model model)
	{
		
		this.iSysUserService.checkuser(sysUser.getUsername(), sysUser.getUserpwd());
		return "redirect:http://www.baidu.com";
	}
	
	@RequestMapping(value="/json")
	@ResponseBody
	public Map<String,Object> json(ModelMap model)
	{
		Map<String,Object> map = new HashMap<String,Object>();  
        map.put("code", true); 
		return map;
	}
}
