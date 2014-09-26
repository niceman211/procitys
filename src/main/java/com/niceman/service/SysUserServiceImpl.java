package com.niceman.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.niceman.dao.ISysUserDao;
import com.niceman.domain.SysUser;

@Component
@Transactional
public class SysUserServiceImpl implements ISysUserService {

	@Autowired
	private ISysUserDao iSysUserDao ;

	public boolean checkuser(String username, String userpwd) {
		
		
//		List<SysUser> ss = this.iSysUserDao.getAll(username);
//		for (SysUser sysUser : ss) {
//			System.out.println(sysUser.getUsername());
//		}
		SysUser sysUser = new SysUser();
		sysUser.setUsername(username);
		sysUser.setUserpwd(userpwd);
		iSysUserDao.insert(sysUser);
		System.out.println("判断是否存在这个用户");
		return false;
	}

}
