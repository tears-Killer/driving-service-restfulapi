/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.dto.admin;

import com.wj.driving.restfulapi.enums.admin.AuthEnum;

import java.io.Serializable;

/**
 * @ClassName AdminDTO
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 16:03
 */
public class AdminDetailsDTO implements Serializable {
    private Long id;
    private String name;
    private String sex;
    private Integer age;
    private String phone;
    private String password;
    private AuthEnum auth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
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
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthEnum getAuth() {
        return auth;
    }

    public void setAuth(AuthEnum auth) {
        this.auth = auth;
    }

    @Override
    public String toString() {
        return "AdminDetailsDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", auth=" + auth +
                '}';
    }
}