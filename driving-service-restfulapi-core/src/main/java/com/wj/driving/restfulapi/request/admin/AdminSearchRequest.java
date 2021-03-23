/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.request.admin;

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

    private Integer page = 1;

    private Integer pageSize = 10;

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

    public Integer getPage() {
        return page>0 ? 1:page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize>0 ? 10:pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}