package com.wj.driving.restfulapi.domain.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @ClassName  Admin
 * @Description  
 * @Author  wangjian
 * @Date 2021-01-05 03:34 
 */

@TableName("admin" )
public class AdminBO implements Serializable {

	private static final long serialVersionUID =  1928004993496379225L;

   	@TableField("id" )
	private Long id;

   	@TableField("name" )
	private String name;

   	@TableField("sex" )
	private String sex;

   	@TableField("age" )
	private Integer age;

   	@TableField("phone" )
	private String phone;

   	@TableField("password" )
	private String password;

   	@TableField("auth" )
	private Integer auth;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAuth() {
		return auth;
	}

	public void setAuth(Integer auth) {
		this.auth = auth;
	}
}
