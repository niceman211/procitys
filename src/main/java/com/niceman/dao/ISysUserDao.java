package com.niceman.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.niceman.domain.SysUser;


@Repository
public interface ISysUserDao {

	@Select("select * from sys_user user where user.username = #{username}")
	@Results(value={@Result(id=true,property = "id" ,column = "id"),
				@Result(property = "username" , column = "username"),
				@Result(property = "username" , column = "username")})
	public List<SysUser> getAll(String username);
	
	
	@Insert("insert into sys_user(username,userpwd) values (#{username},#{userpwd})" )
	public void insert(SysUser sysUser);
	
}
