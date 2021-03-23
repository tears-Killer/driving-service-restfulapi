/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.request;

import java.io.Serializable;

/**
 * @ClassName AdminSearchRequest
 * @Description 管理员搜索条件
 * @Author wangjian
 * @Date 2021/3/23 13:58
 */
public class AdminSearchRequest implements Serializable {

    private String name;

    private String phone;

    private Integer auth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }
}