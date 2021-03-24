package com.wj.driving.restfulapi.request.user;

import java.io.Serializable;

public class UserSearchRequest implements Serializable {

    private String name;

    private String nickname;

    private String mobileNo;

    private Integer state;

    private Integer page;

    private Integer pageSize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPage() {
        return page == null ? 0:(page-1)*getPageSize();
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
