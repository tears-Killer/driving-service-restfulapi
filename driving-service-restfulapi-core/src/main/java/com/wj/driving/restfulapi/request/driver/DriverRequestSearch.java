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
}