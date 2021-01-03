/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.dto.admin;

import java.io.Serializable;

/**
 * @ClassName AdminLoginDTO
 * @Description TODO
 * @Author wangjian
 * @Date 2020/12/31 16:11
 */
public class AdminLoginDTO implements Serializable{

    private String account;
    private String password;

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

}