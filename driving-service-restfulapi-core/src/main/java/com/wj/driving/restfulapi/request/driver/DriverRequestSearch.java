package com.wj.driving.restfulapi.request.driver;

import java.io.Serializable;

/**
 * <p>
 *  代驾搜索条件
 * </p>
 *
 * @author wangjian
 * @since 2021/4/23
 */
public class DriverRequestSearch implements Serializable {

    /**
     * 姓名
     */
    private String name;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 等级
     */
    private Integer starLevel;
    /**
     * 状态
     */
    private Integer state;
    /**
     * 当前页
     */
    private Integer page;
    /**
     * 每页条数
     */
    private Integer pageSize;

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

    public Integer getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
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
        return pageSize<0 ? 10:pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}