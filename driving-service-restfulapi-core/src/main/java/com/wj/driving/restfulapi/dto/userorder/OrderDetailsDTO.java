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
     * 订单客户手机号
     */
    private String mobileNo;
    /**
     * 起始地-省
     */
    private String fromProvicne;
    /**
     * 起始地-区
     */
    private String fromCounty;
    /**
     * 起始地-市
     */
    private String fromCity;
    /**
     * 起始地-街道
     */
    private String fromStreet;
    /**
     * 目的地-省
     */
    private String toProvince;
    /**
     * 目的地-市
     */
    private String toCity;
    /**
     * 目的地-区
     */
    private String toCounty;
    /**
     * 目的地-街道
     */
    private String toStreet;
    /**
     * 代驾人员名称
     */
    private String driverName;
    /**
     * 订单状态
     */
    private Integer state;
    /**
     * 订单状态
     */
    private String stateName;
    /**
     * 订单金额
     */
    private Double amount;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getFromProvicne() {
        return fromProvicne;
    }

    public void setFromProvicne(String fromProvicne) {
        this.fromProvicne = fromProvicne;
    }

    public String getFromCounty() {
        return fromCounty;
    }

    public void setFromCounty(String fromCounty) {
        this.fromCounty = fromCounty;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getFromStreet() {
        return fromStreet;
    }

    public void setFromStreet(String fromStreet) {
        this.fromStreet = fromStreet;
    }

    public String getToProvince() {
        return toProvince;
    }

    public void setToProvince(String toProvince) {
        this.toProvince = toProvince;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getToCounty() {
        return toCounty;
    }

    public void setToCounty(String toCounty) {
        this.toCounty = toCounty;
    }

    public String getToStreet() {
        return toStreet;
    }

    public void setToStreet(String toStreet) {
        this.toStreet = toStreet;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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