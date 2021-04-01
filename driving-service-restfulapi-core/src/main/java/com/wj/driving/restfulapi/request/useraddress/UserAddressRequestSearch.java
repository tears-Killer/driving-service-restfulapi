/**
 * Copyright 2017 武汉易酒批电子商务有限公司. All rights reserved.
 */
package com.wj.driving.restfulapi.request.useraddress;

/**
 * @ClassName UserAddressRequestSearch
 * @Description 目的地管理分页查询条件
 * @Author wangjian
 * @Date 2021/4/1 11:15
 */
public class UserAddressRequestSearch {

    /**
     * 客户名称
     */
    private String userName;

    /**
     * 目的地-省
     */
    private String province;

    /**
     * 目的地-市
     */
    private String city;

    /**
     * 目的地-区域
     */
    private String county;

    /**
     * 目的地-街道
     */
    private String street;

    /**
     * 目的地-详细地址
     */
    private String detailAddress;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 最后修改时间
     */
    private String lastUpdateTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}