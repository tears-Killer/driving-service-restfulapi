package com.wj.driving.restfulapi.domain.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *  订单实体类
 * </p>
 *
 * @author wangjian
 * @since 2021/4/20
 */
public class OrderBO implements Serializable {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 订单号
     */
    private Long orderNo;
    /**
     * 用户id
     */
    private Long userId;
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
    private Integer state;
    /**
     * 订单创建时间
     */
    private Date createTime;
    /**
     * 最后更新时间
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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