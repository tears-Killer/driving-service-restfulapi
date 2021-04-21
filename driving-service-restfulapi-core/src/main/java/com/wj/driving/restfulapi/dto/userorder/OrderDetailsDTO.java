package com.wj.driving.restfulapi.dto.userorder;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *  订单详情
 * </p>
 *
 * @author wangjian
 * @since 2021/4/20
 */
public class OrderDetailsDTO implements Serializable {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 订单编号
     */
    private Long orderNo;
    /**
     * 订单客户名称
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
     * 目的地-区
     */
    private String county;
    /**
     * 目的地-街道
     */
    private String street;
    /**
     * 订单状态
     */
    private String stateName;
    /**
     * 订单创建时间
     */
    private Date createTime;
    /**
     * 订单最后更新时间
     */
    private Date lastUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

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

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}