package com.wj.driving.restfulapi.domain.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wj.driving.restfulapi.enums.admin.AuthEnum;

import java.io.Serializable;

/**
 * @ClassName  Admin
 * @Description  
 * @Author  wangjian
 * @Date 2020-12-31 04:52 
 */

@TableName("admin" )
public class AdminBO implements Serializable {

	private static final long serialVersionUID =  1409054388861625034L;

   	@TableField("id")
	private Long id;

   	@TableField("account" )
	private String account;

   	@TableField("password" )
	private String password;

   	@TableField("name" )
	private String name;

   	@TableField("auth" )
	private Integer auth;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAuth() {
		return auth;
	}

	public void setAuth(Integer auth) {
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "AdminBO{" +
				"id=" + id +
				", account='" + account + '\'' +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				", auth=" + auth +
				'}';
	}
}
