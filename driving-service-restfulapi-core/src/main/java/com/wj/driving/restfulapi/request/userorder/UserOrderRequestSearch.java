package com.wj.driving.restfulapi.request.userorder;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *  订单搜索条件
 * </p>
 *
 * @author wangjian
 * @since 2021/4/21
 */
public class UserOrderRequestSearch implements Serializable {

    /**
     * 订单编号
     */
    private Long orderNo;
    /**
     * 订单客户名称
     */
    private String userName;
    /**
     * 订单客户手机号
     */
    private String mobileNo;
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
    private String state;
    /**
     * 订单金额-最低值
     */
    private Double minAmount;
    /**
     * 订单金额-最大值
     */
    private Double maxAmount;
    /**
     * 订单创建时间
     */
    private Date beginTime;
    /**
     * 订单最后更新时间
     */
    private Date endTime;

    /**
     * 当前页
     */
    private Integer page;

    /**
     * 每页条数
     */
    private Integer pageSize;

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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    public Double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}