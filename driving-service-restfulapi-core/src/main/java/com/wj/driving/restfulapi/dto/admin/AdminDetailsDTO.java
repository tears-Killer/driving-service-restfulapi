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
    private String account;
    private String password;
    private String name;
    private AuthEnum auth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", auth=" + auth +
                '}';
    }

}